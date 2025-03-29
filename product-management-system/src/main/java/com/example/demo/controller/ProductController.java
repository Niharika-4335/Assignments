package com.example.demo.controller;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService service) {
        this.productService = service;
    }
    @GetMapping
    public List<Product> getListOfProducts(){
        return productService.getListOFProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PostMapping
    @Transactional
    public ProductResponseDto createProduct(@Valid  @RequestBody ProductRequestDto productRequestDto) {
        return productService.saveProduct(productRequestDto);
    }

    @PutMapping("/{id}")
    @Transactional
    public ProductResponseDto updateProduct(@PathVariable Integer id, @Valid @RequestBody  ProductRequestDto productRequestDto){
        return productService.updateProduct(id,productRequestDto);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteById(@PathVariable Integer id){
       productService.deleteById(id);
    }


}
