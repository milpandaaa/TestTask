package com.megafon.restApi.TestTask.controller;

import com.megafon.restApi.TestTask.model.Product;
import com.megafon.restApi.TestTask.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id) {
        return ResponseEntity.of(productService.getProduct(id));
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") Integer id) {
        productService.delete(id);
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product) {
        productService.add(product);

    }

    @PutMapping("/product/{id}")
    public void editProduct(@RequestBody Product product) {
        productService.edit(product);
    }

}
