package com.suvam.mobilestore.service;

import com.suvam.mobilestore.data.Product;
import com.suvam.mobilestore.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductRepo repo;

    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

//        private  List<Product> products =new ArrayList<>(List.of(
//            new Product(
//                    1,
//                    "Apple",
//                    "iPhone 17 Pro",
//                    999
//            ),
//            new Product(
//                    2,
//                    "Samsung",
//                    "Samsung Galaxy S22 Ultra",
//                    1999
//            ),
//            new Product(
//                    3,
//                    "Xiaomi",
//                    "Xiaomi Galaxy S22 Ultra",
//                    2999
//            )));

    public List<Product> getProducts() {
        return repo.findAll();
    }
    public Product getProductById(int proId) {
        return repo.findById(proId)
                .orElseThrow(()-> new RuntimeException("Product not found"));
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(int prodId, Product product) {
        product.setId(prodId);
        repo.save(product);
    }

    public void deleteProduct(int prod) {
        repo.deleteById(prod);
    }
}
