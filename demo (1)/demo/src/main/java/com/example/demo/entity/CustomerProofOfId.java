package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_proof_of_identity")
public class CustomerProofOfId {
    
    @Id
    @Column(name = "CSTMR_ID")
    private Integer customerId; // Assuming int maps to Integer in Java

    @Id
    @Column(name = "CSTID_TYPE")
    private String proofOfIdentityType; // varchar(100)

    @Column(name = "CSTID_VALUE")
    private String proofOfIdentityValue; // varchar(100)

    @Column(name = "START_DATE")
    private java.sql.Date startDate; // date

    @Column(name = "END_DATE")
    private java.sql.Date endDate; // date

    @Column(name = "CSTMR_EFCTV_DT")
    private java.sql.Date effectiveDate; // date

    // Getters and Setters
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getProofOfIdentityType() {
        return proofOfIdentityType;
    }

    public void setProofOfIdentityType(String proofOfIdentityType) {
        this.proofOfIdentityType = proofOfIdentityType;
    }

    public String getProofOfIdentityValue() {
        return proofOfIdentityValue;
    }

    public void setProofOfIdentityValue(String proofOfIdentityValue) {
        this.proofOfIdentityValue = proofOfIdentityValue;
    }

    public java.sql.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(java.sql.Date startDate) {
        this.startDate = startDate;
    }

    public java.sql.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(java.sql.Date endDate) {
        this.endDate = endDate;
    }

    public java.sql.Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(java.sql.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}