package com.isil.springdatajpa.service;

import com.isil.springdatajpa.entity.Product;
import com.isil.springdatajpa.model.dto.ProductDTO;
import com.isil.springdatajpa.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService{

    private final ProductRepository productRepository;


    //@Transactional
    public Long add(ProductDTO dto) {
        Product productToSave = new Product();
        productToSave.setProductName(dto.getItemName());
        productToSave.setProductPrice(dto.getPrice());
        return productRepository.save(productToSave).getId();
    }

    public List<ProductDTO> get (){
        return productRepository.findAll()
                .stream()
                .map(item -> {
                    return new ProductDTO(
                            item.getProductName(),
                            item.getProductPrice()
                    );
                })
                .toList();

    }
}

