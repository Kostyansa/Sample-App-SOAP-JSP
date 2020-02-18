package org.example.shop.service;

import org.example.shop.entity.Bundle;

import java.util.List;

public interface BundleService {
    Bundle find(Long id);

    List<Bundle> find(Long limit, Long offset);
}
