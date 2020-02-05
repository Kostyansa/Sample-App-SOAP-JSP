package org.example.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @NotNull
    private Long id;

    private String name;
    private String description;
    private Long price;
    private Long amount;
}
