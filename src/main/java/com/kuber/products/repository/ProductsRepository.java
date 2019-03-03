package com.kuber.products.repository;

import com.kuber.products.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends DatastoreRepository<Product, Long> {
}
