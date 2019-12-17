package com.sam.docker.controller;

import com.sam.docker.model.Product;
import com.sam.docker.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl service;

    @GetMapping("/list")
    public List<Product> getProduct(){
        return service.getAllProduct();
    }

    @GetMapping("/list/{id}")
    public Product getProductById(@PathVariable Long id){
        return service.getOneProduct(id);
    }

    @PostMapping("/add")
    public Product createProduct(@RequestBody Product product){

        return service.createProduct(product);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){

        return service.createProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id){

        service.deleteProduct(id);
    }
}
