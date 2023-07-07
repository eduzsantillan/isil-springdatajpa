package com.isil.springdatajpa.repository;


import com.isil.springdatajpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


    @Procedure("InsertProduct")
    public Product add (String productName,Double productPrice);


}
