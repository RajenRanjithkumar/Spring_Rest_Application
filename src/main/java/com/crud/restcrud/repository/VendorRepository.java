package com.crud.restcrud.repository;

import com.crud.restcrud.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;


 // Repo layer talks to the db
                                    //                          type of the ID
public interface VendorRepository extends JpaRepository <Vendor, String>{
}
