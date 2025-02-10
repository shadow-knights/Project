package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.CustomerIdentification;
import com.example.demo.repository.CustomerIdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerIdentificationService {
    @Autowired
    private CustomerIdentificationRepository customerIdentificationRepository;

    public List<CustomerIdentification> getAllIdentifications() {
        return customerIdentificationRepository.findAll();
    }

    public CustomerIdentification saveIdentification(CustomerIdentification customerIdentification) {
        return customerIdentificationRepository.save(customerIdentification);
    }
}