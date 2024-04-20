package com.nishant.RestAPI.controller;

import com.nishant.RestAPI.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CloudVendor")
public class CloudAPIService {

    @GetMapping("/details")
    public CloudVendor getCloudVendorDetails( String vendorId) {

    }
}

