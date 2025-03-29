package com.example.demo.mapper;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.example.demo.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toEntity(ProductRequestDto productRequestDto);
    //dto to entity conversion to save into database.
    ProductResponseDto toResponseDto(Product product);
    //entity to dto to give to client.

    void updateProductFromDTO(ProductRequestDto dto, @MappingTarget Product product);
    //mapping target only allows not null values.
}
