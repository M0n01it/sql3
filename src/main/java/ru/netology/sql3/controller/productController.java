package ru.netology.sql3.controller;

import ru.netology.sql3.repository.productRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class productController {

    private final productRepository productRepository;

    public productController(productRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/fetch-product")
    public ResponseEntity<String> fetchProduct(@RequestParam String name) {
        String productName = productRepository.getProductName(name);
        return ResponseEntity.ok(productName);
    }
}
