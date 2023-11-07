package com.crud.restcrud.service.impl;

import com.crud.restcrud.model.Vendor;
import com.crud.restcrud.repository.VendorRepository;
import com.crud.restcrud.service.VendorService;
import org.springframework.stereotype.Service;

import java.util.List;


// more business logic in this layer

@Service
public class VendorServiceImpl implements VendorService {

    VendorRepository vendorRepository;
    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }



    @Override
    public String createVendor(Vendor vendor) {

        vendorRepository.save(vendor);

        return "Success";
    }

    @Override
    public String updateVendor(Vendor vendor) {

        vendorRepository.save(vendor);
        return "Success";
    }

    @Override
    public String deleteVendor(String vendorId) {

        vendorRepository.deleteById(vendorId);
        return "Success";
    }

    @Override
    public Vendor getVendor(String vendorId) {

        return vendorRepository.findById(vendorId).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
