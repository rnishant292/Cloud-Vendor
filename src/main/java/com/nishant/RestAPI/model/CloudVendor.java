package com.nishant.RestAPI.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cloud_vendor")
public class CloudVendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;
    private String vendorName;
    private String vendorAddress;
    private long vendorPhoneNumber;

    // Default constructor
    public CloudVendor() {
    }

    // Constructor with parameters
    public CloudVendor(String vendorName, String vendorAddress, long vendorPhoneNumber) {
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    // Getters and setters
    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public long getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(long vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
