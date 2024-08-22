package org.example.makersearch.repository;

import org.example.makersearch.model.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
@author v_code
**/
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    Page<Supplier> findByLocation(String location, Pageable pageable);

    Page<Supplier> findByNatureOfBusiness(String natureOfBusiness, Pageable pageable);

    Page<Supplier> findByManufacturingProcessesContaining(String manufacturingProcess, Pageable pageable);

    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location, String natureOfBusiness, String manufacturingProcesses, Pageable pageable);
}