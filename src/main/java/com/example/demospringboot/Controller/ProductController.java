package com.example.demospringboot.Controller;

import com.example.demospringboot.Model.Product;
import com.example.demospringboot.Model.ResponseObject;
import com.example.demospringboot.Service.Impl.ProductServiceImpl;
import com.example.demospringboot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    public ProductService productService;
    @GetMapping("/get-all")
    public ResponseEntity<ResponseObject> getAllProduct(){
        List<Product> ListProduct = productService.getAllProduct();
       return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok","Get all product hehe",ListProduct));
    }

}
