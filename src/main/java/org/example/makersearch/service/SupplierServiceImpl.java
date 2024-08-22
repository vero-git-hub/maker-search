package org.example.makersearch.service;

import org.example.makersearch.model.Supplier;
import org.example.makersearch.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Supplier> findSuppliersByLocation(String location) {
        return supplierRepository.findByLocation(location);
    }

    @Override
    public List<Supplier> findSuppliersByNatureOfBusiness(String natureOfBusiness) {
        return supplierRepository.findByNatureOfBusiness(natureOfBusiness);
    }

    @Override
    public List<Supplier> findSuppliersByManufacturingProcess(String manufacturingProcess) {
        return supplierRepository.findByManufacturingProcessesContaining(manufacturingProcess);
    }

    @Override
    public List<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcess) {
        return supplierRepository.findAll().stream()
                .filter(supplier -> supplier.getLocation().equalsIgnoreCase(location))
                .filter(supplier -> supplier.getNatureOfBusiness().equalsIgnoreCase(natureOfBusiness))
                .filter(supplier -> supplier.getManufacturingProcesses().contains(manufacturingProcess))
                .toList();
    }
}