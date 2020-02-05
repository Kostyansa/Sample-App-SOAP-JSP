package org.example.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @NotNull
    private Long id;

    @NotNull
    private String login;
    @NotNull
    private String fullName;
    @NotNull
    private String password;
}
