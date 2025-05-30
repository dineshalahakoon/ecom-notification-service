package com.icet.ecom.controller;

import com.icet.ecom.model.Product;
import com.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
@Slf4j
public class ProductController {
    private final ProductService productServie;

    @PostMapping()
    void persist(@RequestBody Product product){
        productServie.saveProduct(product);

    }
    @GetMapping("/all")

    List<Product> all() throws InterruptedException {
        log.info("request resiced all products{} -{}",Thread.currentThread().getName(),Thread.activeCount());
        return productServie.retriveProduct();
    }
}
