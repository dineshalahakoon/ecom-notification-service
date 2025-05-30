package com.icet.ecom.service;

import com.icet.ecom.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> retriveProduct();
}
