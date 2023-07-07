package com.isil.springdatajpa.service;

import com.isil.springdatajpa.entity.Customer;
import com.isil.springdatajpa.model.dto.CustomerDTO;
import com.isil.springdatajpa.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService{

    private final CustomerRepository customerRepository;

    public void save(Customer customer) {
        customerRepository.save(customer);
    }


    public List<CustomerDTO> get() {

        return customerRepository.findAll()
                .stream()
                .map(item -> {
                    CustomerDTO customerDTO = new CustomerDTO();
                    customerDTO.setFullName(item.getFirstName() + " " + item.getLastName());
                    customerDTO.setEmail(item.getEmail());
                    return customerDTO;
                })
                .toList();
    }


    public void delete(Long id) {
        Customer customerToDelete = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customerToDelete);
    }

    public int calcAge(int birthYear){
        return customerRepository.getAge(birthYear);
    }
}
