package org.example.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @NotNull
    private Long id;

    private Long idOrder;

    private Long price;

    private boolean completed;
}
