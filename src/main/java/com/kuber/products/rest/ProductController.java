package com.kuber.products.rest;


import com.kuber.products.dto.Product;
import com.kuber.products.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductsRepository repository;

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity getHealth() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable Long id) {
        return repository.findById(id).orElseGet(null);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public Iterable<Product> getProductAll() {
        return repository.findAll();
    }
}
