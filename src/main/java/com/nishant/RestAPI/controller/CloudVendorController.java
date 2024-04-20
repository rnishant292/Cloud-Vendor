package com.nishant.RestAPI.controller;

import com.nishant.RestAPI.Service.CloudVendorService;
import com.nishant.RestAPI.model.CloudVendor; // Import the CloudVendor class

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cloudVendor")
public class CloudVendorController {
   private final CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    //this is get for individual
    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") long vendorId)
    {
        return cloudVendorService.getCloudVendor(String.valueOf(vendorId));


    }
    //this is get for all
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }
    @PostMapping
    public String  createCloudVendorDetail(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor( cloudVendor);
        return "Cloud vendor created Successfully";
    }
    @PutMapping
    public String  updateCloudVendorDetail(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor update Successfully";
    }
    @DeleteMapping("/{vendorId}")
    public String  deleteCloudVendorDetail(@PathVariable("vendorId") String vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor delete Successfully";
    }
}




