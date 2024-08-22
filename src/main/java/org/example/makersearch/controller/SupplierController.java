package org.example.makersearch.controller;

import org.example.makersearch.model.Supplier;
import org.example.makersearch.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author v_code
 **/
@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public List<Supplier> getSuppliers(
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String natureOfBusiness,
            @RequestParam(required = false) String manufacturingProcess) {

        if (location != null && natureOfBusiness != null && manufacturingProcess != null) {
            return supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcess);
        } else if (location != null) {
            return supplierService.findSuppliersByLocation(location);
        } else if (natureOfBusiness != null) {
            return supplierService.findSuppliersByNatureOfBusiness(natureOfBusiness);
        } else if (manufacturingProcess != null) {
            return supplierService.findSuppliersByManufacturingProcess(manufacturingProcess);
        } else {
            return List.of();
        }
    }
}