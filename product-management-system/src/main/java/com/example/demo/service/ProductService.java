package com.example.demo.service;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.example.demo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getListOFProducts();

    Product getProductById(Integer id);

    //post

    ProductResponseDto saveProduct(ProductRequestDto productRequestDto);
   //update

    ProductResponseDto updateProduct(Integer id,ProductRequestDto productRequestDto);

    void deleteById(Integer id);

}
