package com.megafon.restApi.TestTask.service;

import com.megafon.restApi.TestTask.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import com.megafon.restApi.TestTask.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        List<Product> productList = new ArrayList<Product>();
        productRepository.findAll().forEach(product -> productList.add(product));
        return productList;
    }

    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    public void add(Product product) {
        productRepository.save(product);
    }

    public void edit(Product product) {
        productRepository.save(product);
    }
}
