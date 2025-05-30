package com.icet.ecom.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icet.ecom.entity.ProductEntity;
import com.icet.ecom.model.Product;
import com.icet.ecom.repository.ProductRepository;
import com.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private  final ProductRepository productRepository;
    private final ObjectMapper objectManager;


    @Override
    public Product saveProduct(Product product) {
        ProductEntity productEntity = objectManager.convertValue(product, ProductEntity.class);
        ProductEntity saveProduct = productRepository.save(productEntity);
        return objectManager.convertValue(saveProduct,Product.class);
    }

    @Override
    public List<Product> retriveProduct() {
        final Iterable<ProductEntity> allProducts = productRepository.findAll();

        List<Product> productList=new ArrayList<>();

        allProducts.forEach(productEntity -> {
            productList.add(objectManager.convertValue(productEntity,Product.class));
        });
        return productList;
    }
}
