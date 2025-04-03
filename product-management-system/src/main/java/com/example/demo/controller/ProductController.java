package com.example.demo.controller;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    @GetMapping("/")
    public Page<Product> getListOfProducts(@PageableDefault(value = 5,sort = "price") Pageable pageable){
        return productService.getListOFProducts(pageable);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PostMapping()
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

    @GetMapping("/category/{category}")
    public List<Product> findProductByCategory(@PathVariable String category){
        return productService.findByCategory(category);
    }

    @GetMapping("/price")
    public List<Product> findProductByPriceRange(@RequestParam double min,@RequestParam  double max){
        return productService.findByPriceBetween(min,max);
    }




}
