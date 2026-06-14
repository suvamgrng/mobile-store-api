package com.suvam.mobilestore.service;

import com.suvam.mobilestore.data.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class ProductService {

    private  List<Product> products =new ArrayList<>(List.of(
            new Product(
                    1,
                    "Apple",
                    "iPhone 17 Pro",
                    999
            ),
            new Product(
                    2,
                    "Samsung",
                    "Samsung Galaxy S22 Ultra",
                    1999
            ),
            new Product(
                    3,
                    "Xiaomi",
                    "Xiaomi Galaxy S22 Ultra",
                    2999
            )));

    public Product getProductById(int proId) {
        return products.stream()
                .filter(p -> p.getId() == proId)
                .findFirst().orElse(new Product(100, "N/A", "No Item", 0));
    }

    public void addProducts(Product prod) {
        System.out.println(prod);
        products.add(prod);
    }
}
