package com.vikas.simple_ecommerce.repository;

import com.vikas.simple_ecommerce.model.Product;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
