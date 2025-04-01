package com.example.demo.service;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImp implements  ProductService{

    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;


    @Autowired
    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Page<Product> getListOFProducts(Pageable pageable) {

        return productRepository.findAll(pageable);
    }

    @Override
    public Product getProductById(Integer id) {

        return productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("product not found with id" + id));
    }

    @Override
    public ProductResponseDto saveProduct(ProductRequestDto productRequestDto) {
        Product product =productMapper.toEntity(productRequestDto);
        //wea re taking dto and converting into entity using mapper.
        //before updating to database we will change to entity product
       productRepository.save(product);
       return productMapper.toResponseDto(product);
    }

    @Override
    public ProductResponseDto updateProduct(Integer id, ProductRequestDto productRequestDto) {
        Product targetProduct=productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("product not found with id" + id));

        productMapper.updateProductFromDTO(productRequestDto,targetProduct);

        productRepository.save(targetProduct);
        return productMapper.toResponseDto(targetProduct);

    }

    @Override
    public void deleteById(Integer id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findByCategory(String category) {
       return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> findByPriceBetween(Double minPrice, Double maxPrice) {
        return productRepository.findByPriceBetween(minPrice, maxPrice);
    }


}
