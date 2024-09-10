package org.iraianbu.productservice.service;

import org.iraianbu.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = List.of(
            new Product(1, "Laptop", 999.99, 10),
            new Product(2, "Smartphone", 699.99, 20),
            new Product(3, "Headphones", 199.99, 50)
    );

    public List<Product> getAllProducts(){
        return products;
    }
}
