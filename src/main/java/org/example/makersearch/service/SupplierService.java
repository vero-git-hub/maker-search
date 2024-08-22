package org.example.makersearch.service;

import org.example.makersearch.model.Supplier;

import java.util.List;

/**
 * @author v_code
 **/
public interface SupplierService {
    List<Supplier> findSuppliersByLocation(String location);

    List<Supplier> findSuppliersByNatureOfBusiness(String natureOfBusiness);

    List<Supplier> findSuppliersByManufacturingProcess(String manufacturingProcess);

    List<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcess);
}