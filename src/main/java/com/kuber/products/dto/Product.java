package com.kuber.products.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "products")
@AllArgsConstructor
@Data
public class Product {

    @Id
    String id;

    String name;
    
    String image;

    String description;

    Double price;
}