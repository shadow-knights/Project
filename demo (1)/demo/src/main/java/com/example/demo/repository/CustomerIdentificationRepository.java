package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CustomerIdentification;

public interface CustomerIdentificationRepository extends JpaRepository<CustomerIdentification, Long> {
}