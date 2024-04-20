package com.nishant.RestAPI.repository;

import com.nishant.RestAPI.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>
{
}
