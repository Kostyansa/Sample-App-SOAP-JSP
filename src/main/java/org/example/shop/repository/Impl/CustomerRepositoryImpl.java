package org.example.shop.repository.Impl;

import org.example.shop.repository.CustomerRepository;
import org.example.shop.repository.dto.CustomerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<CustomerDB> rowMapper = (rowStr, rowNum) -> new CustomerDB(
            rowStr.getLong("id"),
            rowStr.getString("login"),
            rowStr.getString("fullName"),
            rowStr.getString("password")
    );


    @Override
    public int create(CustomerDB customerDB) {
        return jdbcTemplate.update("insert into shop.Customer(password, fullName, login) values (?, ?, ?)",
                customerDB.getPassword(),
                customerDB.getFullName(),
                customerDB.getLogin());
    }

    @Cacheable(cacheNames = "customers", key = "#id", unless = "#result == null")
    @Override
    public Optional<CustomerDB> read(Long id) {
        try {
            CustomerDB customerDB = jdbcTemplate.queryForObject(
                    "select id, password, fullName, login from shop.Customer where id = ?",
                    new Object[]{id},
                    rowMapper);
            return Optional.ofNullable(customerDB);
        }
        catch (EmptyResultDataAccessException e){
            return Optional.empty();
        }
    }

    @Cacheable(cacheNames = "customers", unless = "#result == null")
    @Override
    public Optional<CustomerDB> readByLogin(String login){
        try {
            CustomerDB customerDB = jdbcTemplate.queryForObject(
                    "select id, password, fullName, login from shop.Customer where login = ?",
                    new Object[]{login},
                    rowMapper);
            return Optional.ofNullable(customerDB);
        }
        catch (EmptyResultDataAccessException e){
            return Optional.empty();
        }
    }

    @Override
    public List<CustomerDB> readAll() {
        return jdbcTemplate.query("select id, password, fullName, login from shop.Customer", rowMapper);
    }

    @CacheEvict(cacheNames = "customers", key="#customerDB.id")
    @Override
    public int update(CustomerDB customerDB) {
        return jdbcTemplate.update(
                "update shop.Customer set password = ?, fullName = ?, login = ? where id = ?",
                        customerDB.getPassword(),
                        customerDB.getFullName(),
                        customerDB.getLogin(),
                        customerDB.getId());
    }

    @CacheEvict(cacheNames = "customers", key="#customerDB.id")
    @Override
    public int delete(CustomerDB customerDB) {
        return jdbcTemplate.update("delete from shop.Customer where id = ?", customerDB.getId());
    }
}
