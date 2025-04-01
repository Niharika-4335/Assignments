package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Integer> {

    Page<Product> findAll(Pageable pageable);

    //Find products by category.

     List<Product> findByCategory(String category);

    //Search products within a price range.
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);


    //i can also write like this(writing sql query and making it native query)
//    @Query(value = "SELECT * FROM product WHERE category = :category", nativeQuery = true)
//    List<Product> getProductsByCategory(@Param("category") String category);

    //using jpql queries.
//    @Query("SELECT p FROM Product p WHERE p.category = :category")
//    List<Product> getProductsByCategory(@Param("category") String category);

}
