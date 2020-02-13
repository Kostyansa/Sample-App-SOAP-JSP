package org.example.shop.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDB {

    private Long id;

    private String name;
    private String description;
    private Double price;
    private Long amount;
}
