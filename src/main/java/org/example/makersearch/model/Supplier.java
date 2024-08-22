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
    private Long supplier_id;

    @Column(nullable = false)
    private String company_name;

    private String website;

    private String location;

    @Column(nullable = false)
    private String nature_of_business;

    private String manufacturing_processes;

    public Long getSupplierId() {
        return supplier_id;
    }

    public void setSupplierId(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
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
        return nature_of_business;
    }

    public void setNatureOfBusiness(String nature_of_business) {
        this.nature_of_business = nature_of_business;
    }

    public String getManufacturingProcesses() {
        return manufacturing_processes;
    }

    public void setManufacturingProcesses(String manufacturing_processes) {
        this.manufacturing_processes = manufacturing_processes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Supplier supplier) {
            return Objects.equals(supplier_id, supplier.supplier_id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplier_id);
    }
}