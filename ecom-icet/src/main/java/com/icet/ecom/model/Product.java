package com.icet.ecom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Product {
    private long id;
    private String name;
    private String description;
    private String category;
    private boolean isActive;
}
