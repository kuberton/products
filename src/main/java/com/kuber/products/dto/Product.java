package com.kuber.products.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Entity(name = "products-dev")
@AllArgsConstructor
@Data
public class Product {

    @Id
    String uid;

    String name;

    String image;

    String description;

    Double price;
}