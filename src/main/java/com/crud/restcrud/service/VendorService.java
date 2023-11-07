package com.crud.restcrud.service;

import com.crud.restcrud.model.Vendor;

import java.util.List;

public interface VendorService {

    public String createVendor(Vendor vendor);
    public String updateVendor(Vendor vendor);
    public String deleteVendor(String vendorId);
    public Vendor getVendor(String Id);

    public List<Vendor> getAllVendors();


}
