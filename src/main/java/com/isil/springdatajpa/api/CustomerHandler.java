package com.isil.springdatajpa.api;

import com.isil.springdatajpa.entity.Customer;
import com.isil.springdatajpa.model.dto.CustomerDTO;
import com.isil.springdatajpa.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerHandler {

    private final ICustomerService customerService;

    @GetMapping({"/",""})
    public ResponseEntity<List<CustomerDTO>> get(){
        return ResponseEntity.ok().body(customerService.get());
    }

    @GetMapping("/age/{birthyear}")
    public ResponseEntity<HashMap<String,String>> calcAge(@PathVariable int birthyear){
        HashMap<String, String> resp= new HashMap<>();
        resp.put("edad",String.valueOf(customerService.calcAge(birthyear)));
        return ResponseEntity.ok().body(resp);
    }

}
