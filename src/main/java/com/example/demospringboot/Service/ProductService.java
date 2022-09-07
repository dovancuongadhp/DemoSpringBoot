package com.example.demospringboot.Service;

import com.example.demospringboot.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ProductService {
    public List<Product> getAllProduct();
}
