package com.example.demo.service;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface ProductService {

    Page<Product> getListOFProducts(Pageable pageable);

    Product getProductById(Integer id);

    //post

    ProductResponseDto saveProduct(ProductRequestDto productRequestDto);
   //update

    ProductResponseDto updateProduct(Integer id,ProductRequestDto productRequestDto);

    void deleteById(Integer id);



    //Find products by category.

    List<Product> findByCategory(String category);

    //Search products within a price range.

    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);



}
