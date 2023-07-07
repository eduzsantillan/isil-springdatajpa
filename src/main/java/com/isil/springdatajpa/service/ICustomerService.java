package com.isil.springdatajpa.service;

import com.isil.springdatajpa.entity.Customer;
import com.isil.springdatajpa.model.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {

    public void save(Customer customer);
    public List<CustomerDTO> get();
    public void delete(Long id);

    public int calcAge(int birthYear);
}
