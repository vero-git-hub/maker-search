package org.example.makersearch.service;

import org.example.makersearch.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author v_code
 **/
public interface SupplierService {

    Page<Supplier> findSuppliersByLocation(String location, Pageable pageable);

    Page<Supplier> findSuppliersByNatureOfBusiness(String natureOfBusiness, Pageable pageable);

    Page<Supplier> findSuppliersByManufacturingProcess(String manufacturingProcess, Pageable pageable);

    Page<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcess, Pageable pageable);

    Supplier saveSupplier(Supplier supplier);
}