package com.crud.restcrud.controller;


import com.crud.restcrud.model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")

public class VendorController {


    Vendor vendor;


    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(String vendorId){

        return vendor;
    }

    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendor){

        this.vendor = vendor;
        return "Vendor created successfully";


    }

    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendor){

        this.vendor = vendor;
        return "Vendor updated successfully";
    }



}
