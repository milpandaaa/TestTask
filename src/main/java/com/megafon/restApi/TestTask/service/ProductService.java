package com.megafon.restApi.TestTask.service;

import com.megafon.restApi.TestTask.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import com.megafon.restApi.TestTask.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    List<Product> getAllProduct();

    Optional<Product> getProduct(Integer id);

    void delete(Integer id);

    void add(Product product);

    void edit(Product product);
}
