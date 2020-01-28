package org.example.jsp.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDB {

    private Long id;

    private String name;
    private String description;
    private Long price;
}
