package com.crud.restcrud.controller;


import com.crud.restcrud.model.Vendor;
import com.crud.restcrud.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// control layer interacts with service layer using the repos layer
@RestController
@RequestMapping("/vendor")
public class VendorAPIController {


    //Vendor vendor;
    VendorService vendorService;
    public VendorAPIController(VendorService vendorService) {
        this.vendorService = vendorService;
    }




    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(@PathVariable("vendorId") String vendorId){


        return vendorService.getVendor(vendorId);
    }

    @GetMapping("")
    public List<Vendor> getAllVendorDetails(){


        return vendorService.getAllVendors();
    }

    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendor){

        vendorService.createVendor(vendor);
        return "Vendor created successfully";


    }

    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendor){

        vendorService.updateVendor(vendor);
        return "Vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable("vendorId") String vendorId){

        vendorService.deleteVendor(vendorId);
        return "Vendor deleted";

    }



}
