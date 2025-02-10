package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_details")
public class CustomerDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CSTMR_ID")
    private Integer customerId; // Assuming int maps to Integer in Java

    @Column(name = "CSTMR_TYP")
    private String customerType; // varchar(50)

    @Column(name = "CSTMR_NAME")
    private String customerName; // varchar(255)

    @Column(name = "CSTMR_DOB")
    private java.sql.Date customerDOB; // date

    @Column(name = "CSTMR_STATUS")
    private String customerStatus; // varchar(50)

    @Column(name = "CSTMR_CONTACT")
    private String customerContact; // varchar(50)

    @Column(name = "CSTMR_MOBILE")
    private String customerMobile; // varchar(15)

    @Column(name = "CSTMR_EMAIL")
    private String customerEmail; // varchar(100)

    @Column(name = "CSTMR_COUNTRY")
    private String customerCountry; // varchar(50)

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public java.sql.Date getCustomerDOB() {
        return customerDOB;
    }

    public void setCustomerDOB(java.sql.Date customerDOB) {
        this.customerDOB = customerDOB;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public Integer getCustomerClassificationId() {
        return customerClassificationId;
    }

    public void setCustomerClassificationId(Integer customerClassificationId) {
        this.customerClassificationId = customerClassificationId;
    }
}