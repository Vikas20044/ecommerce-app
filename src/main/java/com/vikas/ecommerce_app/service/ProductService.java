package com.vikas.ecommerce_app.service;

import com.vikas.ecommerce_app.model.Product;
import com.vikas.ecommerce_app.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
