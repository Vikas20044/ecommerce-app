package com.vikas.ecommerce_app.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class productController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
