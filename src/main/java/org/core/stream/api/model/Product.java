package org.core.stream.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
}
