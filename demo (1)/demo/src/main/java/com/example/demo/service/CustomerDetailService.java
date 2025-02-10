package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.CustomerDetail;
import com.example.demo.repository.CustomerDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailService {
    @Autowired
    private CustomerDetailRepository customerDetailRepository;

    public List<CustomerDetail> getAllCustomers() {
        return customerDetailRepository.findAll();
    }

    public CustomerDetail saveCustomer(CustomerDetail customerDetail) {
        return customerDetailRepository.save(customerDetail);
    }
}