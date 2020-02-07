package org.example.shop.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDB {

    private Long id;

    private String login;
    private String fullName;
    private String password;
}
