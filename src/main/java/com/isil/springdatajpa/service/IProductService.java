package com.isil.springdatajpa.service;

import com.isil.springdatajpa.entity.Product;
import com.isil.springdatajpa.model.dto.ProductDTO;

import java.util.List;

public interface IProductService {

    public Long add(ProductDTO product);

    public List<ProductDTO> get();
}
