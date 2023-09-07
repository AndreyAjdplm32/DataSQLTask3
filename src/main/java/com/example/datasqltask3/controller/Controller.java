package com.example.datasqltask3.controller;

import com.example.datasqltask3.repository.Product;
import com.example.datasqltask3.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product{name}")
    public List<String> getProduct(@RequestParam("name") String name) {
        return service.productList(name);
    }
}
