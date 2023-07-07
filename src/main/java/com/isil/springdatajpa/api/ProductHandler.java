package com.isil.springdatajpa.api;

import com.isil.springdatajpa.entity.Product;
import com.isil.springdatajpa.model.dto.ProductDTO;
import com.isil.springdatajpa.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductHandler {

    private final IProductService productService;

    @PostMapping({"/",""})
    public ResponseEntity<Long> add(@RequestBody ProductDTO product){
        return ResponseEntity.ok().body(productService.add(product));
    }

    @GetMapping({"/",""})
    public ResponseEntity<List<ProductDTO>> get (){
        return ResponseEntity.ok().body(productService.get());
    }
}
