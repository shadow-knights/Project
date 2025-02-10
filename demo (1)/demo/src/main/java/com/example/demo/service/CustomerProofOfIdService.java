package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.CustomerProofOfId;
import com.example.demo.repository.CustomerProofOfIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerProofOfIdService {
    @Autowired
    private CustomerProofOfIdRepository customerProofOfIdRepository;

    public List<CustomerProofOfId> getAllProofs() {
        return customerProofOfIdRepository.findAll();
    }

    public CustomerProofOfId saveProof(CustomerProofOfId customerProofOfId) {
        return customerProofOfIdRepository.save(customerProofOfId);
    }
}