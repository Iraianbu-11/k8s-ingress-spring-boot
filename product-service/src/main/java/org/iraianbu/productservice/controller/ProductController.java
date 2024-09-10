package org.iraianbu.productservice.controller;

import org.iraianbu.productservice.model.Product;
import org.iraianbu.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
