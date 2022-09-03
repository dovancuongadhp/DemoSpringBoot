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
//    @PostMapping("/add-product")
//    public ResponseEntity<ResponseObject> addProduct(@RequestBody Product product){
//        if(product.getName().equals("")){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("ok","Không có tên",""));
//        }else{
//            productRepository.save(product);
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok","Thêm sản phẩm thành công",product));
//    }
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<ResponseObject> removeProduct(@PathVariable int id){
//        Optional<Product> productFound = productRepository.findById(id);
//        if(productFound.isPresent()){
//            productRepository.deleteById(id);
//        }else{
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("ok","Không tìm thấy id",productFound));
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok","Xoa thành công","Sản phẩm ko còn tồn tại"));
//    }
}
