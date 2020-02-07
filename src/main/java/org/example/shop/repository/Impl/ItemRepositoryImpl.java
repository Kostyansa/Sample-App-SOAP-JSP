package org.example.shop.repository.Impl;

import org.example.shop.repository.ItemRepository;
import org.example.shop.repository.dto.ItemDB;
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
public class ItemRepositoryImpl implements ItemRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<ItemDB> rowMapper = (rowStr, rowNum) -> new ItemDB(
            rowStr.getLong("id"),
            rowStr.getString("name"),
            rowStr.getString("description"),
            rowStr.getDouble("price"),
            rowStr.getLong("amount")
    );


    @Override
    public int create(ItemDB itemDB) {
        return jdbcTemplate.update("insert into shop.Item(price, name, description) values (?, ?, ?);",
                itemDB.getPrice(),
                itemDB.getName(),
                itemDB.getDescription());
    }

    @Cacheable("items")
    @Override
    public Optional<ItemDB> read(Long id) {
        try{
            ItemDB itemDB = jdbcTemplate.queryForObject(
                    "select It.id, price, name, description, amount from shop.Item as It " +
                            "left join shop.ItemAvailability as ItAv on It.id = ItAv.id where It.id = ?",
                    new Object[]{
                            id
                    },
                    rowMapper);
            return Optional.ofNullable(itemDB);
        }
        catch (EmptyResultDataAccessException e){
            return Optional.empty();
        }
    }

    @Cacheable("items")
    @Override
    public List<ItemDB> readByBundleId(Long idBundle) {
        return jdbcTemplate.query(
                "select It.id, price, name, description from shop.Item as It " +
                        "left join shop.ItemAvailability as ItAv on It.id = ItAv.id " +
                        "left join shop.Bundle_Has_Item as Bun on It.id = Bun.id_Item " +
                        "where Bun.id_Bundle = ?",
                    new Object[]{
                            idBundle
                    },
                    rowMapper
                );
    }

    @CacheEvict("customers")
    @Override
    public int update(ItemDB itemDB) {
        return jdbcTemplate.update("update shop.Item set price = ?, name = ?, description = ? where id = ?",
                itemDB.getPrice(),
                itemDB.getName(),
                itemDB.getDescription(),
                itemDB.getId());
    }

    @Override
    public int updateAvailability(ItemDB itemDB) {
        return jdbcTemplate.update("update shop.ItemAvailability set amount = ? where id = ?",
                itemDB.getAmount(),
                itemDB.getId());
    }

    @CacheEvict("customers")
    @Override
    public int delete(ItemDB itemDB) {
        return jdbcTemplate.update("delete from shop.Item where id = ?",
                itemDB.getId());
    }
}
