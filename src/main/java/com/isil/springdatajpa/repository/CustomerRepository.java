package com.isil.springdatajpa.repository;

import com.isil.springdatajpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {


    @Procedure("CalculateAge")
    public int getAge(int birthYear);



}
