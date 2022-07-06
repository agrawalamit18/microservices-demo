package com.product.services.controller;

import com.product.services.entity.Product;
import com.product.services.services.ProductServices;
import com.product.services.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/products")
@Slf4j

public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping ("/status")
    public String helloProduct() {
        return "Product Service is running.";
    }

    @PostMapping ("/save")
    public Product saveProduct (@RequestBody Product product) {
        return productServices.save (product);
    }
    @GetMapping ("/{id}")
    public ResponseVO getById(@PathVariable ("id") Long id) {

        return productServices.getProductById (id);
    }
}