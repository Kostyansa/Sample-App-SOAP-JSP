package org.example.shop.repository.Impl;

import org.example.shop.repository.BundleRepository;
import org.example.shop.repository.dto.BundleDB;
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
public class BundleRepositoryImpl implements BundleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<BundleDB> rowMapper = (rowStr, rowNum) -> new BundleDB(
            rowStr.getLong("id"),
            rowStr.getString("name"),
            rowStr.getString("description"),
            rowStr.getDouble("price")
    );


    @Override
    public int create(BundleDB bundleDB) {
        return 0;
    }

    @Cacheable("bundles")
    @Override
    public Optional<BundleDB> read(Long id) {
        try {
            BundleDB bundleDB = jdbcTemplate.queryForObject(
                    "select id, price, name, description from shop.Bundle as Bun  where Bun.id = ?",
                    new Object[]{
                            id
                    },
                    rowMapper);
            return Optional.ofNullable(bundleDB);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Cacheable("bundles")
    @Override
    public List<BundleDB> read(Long limit, Long offset) {
        return jdbcTemplate.query(
                "select id, price, name, description from shop.Bundle as Bun limit ? offset ?",
                new Object[]{
                        limit, offset
                },
                rowMapper);
    }

    @Cacheable("bundles")
    @Override
    public Optional<BundleDB> readByName(String name) {
        return Optional.empty();
    }

    @CacheEvict("bundles")
    @Override
    public int update(BundleDB bundleDB) {
        return 0;
    }

    @CacheEvict("bundles")
    @Override
    public int delete(BundleDB bundleDB) {
        return 0;
    }
}
