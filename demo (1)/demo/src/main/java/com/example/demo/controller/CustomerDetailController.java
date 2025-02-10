package com.example.demo.controller;

import com.example.demo.entity.CustomerDetail;
import com.example.demo.service.CustomerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerDetailController {
    @Autowired
    private CustomerDetailService customerDetailService;

    @GetMapping
    public List<CustomerDetail> getAllCustomers() {
        return customerDetailService.getAllCustomers();
    }

    @PostMapping
    public CustomerDetail createCustomer(@RequestBody CustomerDetail customerDetail) {
        return customerDetailService.saveCustomer(customerDetail);
    }
}