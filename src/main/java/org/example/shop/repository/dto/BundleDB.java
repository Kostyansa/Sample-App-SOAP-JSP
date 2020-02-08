package org.example.shop.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BundleDB {

    private Long id;

    private String name;
    private String description;
    private Long price;
}
