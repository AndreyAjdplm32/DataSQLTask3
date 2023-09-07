package com.example.datasqltask3.service;

import com.example.datasqltask3.repository.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private ProductImpl product;

    public List<String> productList (String name){
        return product.getProductByName(name);
    }
}
