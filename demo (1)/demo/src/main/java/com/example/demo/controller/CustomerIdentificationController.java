package com.example.demo.controller;

import com.example.demo.entity.CustomerIdentification;
import com.example.demo.service.CustomerIdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/identifications")
public class CustomerIdentificationController {
    @Autowired
    private CustomerIdentificationService customerIdentificationService;

    @GetMapping
    public List<CustomerIdentification> getAllIdentifications() {
        return customerIdentificationService.getAllIdentifications();
    }

    @PostMapping
    public CustomerIdentification createIdentification(@RequestBody CustomerIdentification customerIdentification) {
        return customerIdentificationService.saveIdentification(customerIdentification);
    }
}