package org.example.makersearch.controller;

import org.example.makersearch.model.Supplier;
import org.example.makersearch.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

/**
 * @author v_code
 **/
@RestController
@RequestMapping("/api/suppliers")
@Validated
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public Page<Supplier> getSuppliers(
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String natureOfBusiness,
            @RequestParam(required = false) String manufacturingProcess,
            @PageableDefault(size = 10) @Min(value = 1, message = "Page size must be at least 1") Pageable pageable) {

        return supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcess, pageable);
    }

    @PostMapping
    public Supplier createSupplier(@Valid @RequestBody Supplier supplier) {
        return supplierService.saveSupplier(supplier);
    }
}