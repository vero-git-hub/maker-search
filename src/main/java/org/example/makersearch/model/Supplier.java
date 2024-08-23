package org.example.makersearch.model;

import jakarta.persistence.*;
import java.util.Objects;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * @author v_code
 **/
@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Long supplierId;

    @NotBlank(message = "Company name cannot be blank")
    @Size(max = 100, message = "Company name cannot exceed 100 characters")
    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Size(max = 200, message = "Website URL cannot exceed 200 characters")
    private String website;

    @NotBlank(message = "Location cannot be blank")
    @Size(max = 100, message = "Location cannot exceed 100 characters")
    private String location;

    @NotBlank(message = "Nature of business cannot be blank")
    @Size(max = 50, message = "Nature of business cannot exceed 50 characters")
    @Column(name = "nature_of_business", nullable = false)
    private String natureOfBusiness;

    @NotBlank(message = "Manufacturing processes cannot be blank")
    @Size(max = 255, message = "Manufacturing processes cannot exceed 255 characters")
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