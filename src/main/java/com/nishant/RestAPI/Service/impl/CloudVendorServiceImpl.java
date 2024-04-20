package com.nishant.RestAPI.Service.impl;

import com.nishant.RestAPI.Service.CloudVendorService;
import com.nishant.RestAPI.exception.CloudVendorNotFoundException;
import com.nishant.RestAPI.model.CloudVendor;
import com.nishant.RestAPI.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository)
    {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public   String createCloudVendor(CloudVendor cloudVendor)
    {
        //more business logic
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor)
    {
        //more business logic
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId)
    {
        //more business logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        //more business logic
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("request cloud vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List <CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

}
