package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_identification")
public class CustomerIdentification {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CSTID_ID")
    private Integer customerId; // Assuming int maps to Integer in Java

    @Column(name = "CSTID_TYP")
    private String customerType; // varchar(100)

    @Column(name = "CSTID_ITEM")
    private String customerItem; // varchar(100)

    @Column(name = "CSTID_EFCTV_DT")
    private java.sql.Date effectiveDate; // date

    @Column(name = "CSTCL_ID")
    private Integer customerClassificationId; // int

    // Getters and Setters
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerItem() {
        return customerItem;
    }

    public void setCustomerItem(String customerItem) {
        this.customerItem = customerItem;
    }

    public java.sql.Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(java.sql.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Integer getCustomerClassificationId() {
        return customerClassificationId;
    }

    public void setCustomerClassificationId(Integer customerClassificationId) {
        this.customerClassificationId = customerClassificationId;
    }
}