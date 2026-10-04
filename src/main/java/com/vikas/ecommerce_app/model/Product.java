package com.vikas.ecommerce_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;
@Entity
public class Product {
    @Id
    private int productId;
    private String productName;
    private String brand;
    private String description;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean available;
    private int quantity;

    public Product(int productId, int quantity, boolean available, Date releaseDate, String category, BigDecimal price, String description, String brand, String productName) {
        this.productId = productId;
        this.quantity = quantity;
        this.available = available;
        this.releaseDate = releaseDate;
        this.category = category;
        this.price = price;
        this.description = description;
        this.brand = brand;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
