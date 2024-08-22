package org.example.makersearch.service;

import org.example.makersearch.model.Supplier;
import org.example.makersearch.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author v_code
 **/
@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Page<Supplier> findSuppliersByLocation(String location, Pageable pageable) {
        return supplierRepository.findByLocation(location, pageable);
    }

    @Override
    public Page<Supplier> findSuppliersByNatureOfBusiness(String natureOfBusiness, Pageable pageable) {
        return supplierRepository.findByNatureOfBusiness(natureOfBusiness, pageable);
    }

    @Override
    public Page<Supplier> findSuppliersByManufacturingProcess(String manufacturingProcess, Pageable pageable) {
        return supplierRepository.findByManufacturingProcessesContaining(manufacturingProcess, pageable);
    }

    @Override
    public Page<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcess, Pageable pageable) {
        if (location != null && natureOfBusiness != null && manufacturingProcess != null) {
            return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(location, natureOfBusiness, manufacturingProcess, pageable);
        } else if (location != null) {
            return supplierRepository.findByLocation(location, pageable);
        } else if (natureOfBusiness != null) {
            return supplierRepository.findByNatureOfBusiness(natureOfBusiness, pageable);
        } else if (manufacturingProcess != null) {
            return supplierRepository.findByManufacturingProcessesContaining(manufacturingProcess, pageable);
        } else {
            return supplierRepository.findAll(pageable);
        }
    }
}