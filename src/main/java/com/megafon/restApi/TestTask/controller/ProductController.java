package com.megafon.restApi.TestTask.controller;

import com.megafon.restApi.TestTask.model.Product;
import com.megafon.restApi.TestTask.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Integer id){
        return productService.getProduct(id);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") Integer id){
        productService.delete(id);
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productService.add(product);

    }

    @PutMapping("/product/{id}")
    public void editProduct(@RequestBody Product product){
        productService.edit(product);
    }

}
