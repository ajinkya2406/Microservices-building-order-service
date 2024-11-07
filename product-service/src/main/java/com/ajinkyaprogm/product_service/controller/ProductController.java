package com.ajinkyaprogm.product_service.controller;


import com.ajinkyaprogm.product_service.dto.ProductRequest;
import com.ajinkyaprogm.product_service.dto.ProductResponse;
import com.ajinkyaprogm.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    //inject product service inside the product controller
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createproduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse>getAllProducts() {
        return productService.getAllProducts();

    }
}
