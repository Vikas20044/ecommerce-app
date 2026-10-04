package com.vikas.ecommerce_app.controller;

import com.vikas.ecommerce_app.model.Product;
import com.vikas.ecommerce_app.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    private ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
