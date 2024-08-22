package org.example.makersearch.repository;

import org.example.makersearch.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
@author v_code
**/
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    List<Supplier> findByLocation(String location);
    List<Supplier> findByNatureOfBusiness(String natureOfBusiness);
    List<Supplier> findByManufacturingProcessesContaining(String manufacturingProcess);
}