package com.example.demospringboot.Service.Impl;

import com.example.demospringboot.Model.Product;
import com.example.demospringboot.Repository.ProductRepository;
import com.example.demospringboot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Autowired
    public ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {
        List<Product> listProduct = productRepository.findAll();
        return listProduct;
    }
}
