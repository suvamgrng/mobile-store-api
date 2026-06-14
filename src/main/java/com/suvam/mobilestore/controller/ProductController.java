package com.suvam.mobilestore.controller;

import com.suvam.mobilestore.data.Product;
import com.suvam.mobilestore.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> productsList() {
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod) {
        service.addProducts(prod);
    }
}
