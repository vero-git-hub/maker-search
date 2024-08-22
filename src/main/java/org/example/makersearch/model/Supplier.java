package org.example.makersearch.model;

import jakarta.persistence.*;
import java.util.Objects;

/**
 * @author v_code
 **/
@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id", nullable = false)
    private Long supplierId;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    private String website;

    private String location;

    @Column(name = "nature_of_business", nullable = false)
    private String natureOfBusiness;

    @Column(name = "manufacturing_processes")
    private String manufacturingProcesses;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(String manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Supplier supplier) {
            return Objects.equals(supplierId, supplier.supplierId);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId);
    }
}