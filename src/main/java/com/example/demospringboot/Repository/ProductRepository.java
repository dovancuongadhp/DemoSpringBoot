package com.example.demospringboot.Repository;

import com.example.demospringboot.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
