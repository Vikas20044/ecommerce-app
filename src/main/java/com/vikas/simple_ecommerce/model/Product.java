package com.vikas.simple_ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;


import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productID;
    private String productName;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date releaseDate;
    private boolean available;
    private Integer quantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getImageName() {
        return imageName;
    }

    public Product(Integer productID, String productName, String description, String brand, BigDecimal price, String category, Date releaseDate, boolean available, Integer quantity, String imageName, String imageType, byte[] imageData) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.category = category;

        this.releaseDate = releaseDate;
        this.available = available;
        this.quantity = quantity;
        this.imageName = imageName;
        this.imageType = imageType;
        this.imageData = imageData;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }



}
