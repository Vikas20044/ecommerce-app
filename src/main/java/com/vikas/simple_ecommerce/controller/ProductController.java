package com.vikas.simple_ecommerce.controller;

import com.vikas.simple_ecommerce.model.Product;
import com.vikas.simple_ecommerce.service.ProductService;
import org.hibernate.annotations.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getALlProducts(){
        return productService.getAllProducts();
    }

}
