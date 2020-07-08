package com.codegym.casestudyjavawbe.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "service_name")
    private String serviceName;


    @Pattern(regexp = "^DV-[0-9]{4}$", message = "mã dịch vụ định dạng DV-XXXX , X từ 1-9.")
    @Column(name = "service_code")
    private String codeService;

    @Column(name = "area")
    private Integer area;

    @Min(value = 1,message = "số tầng phải là số nguyên dương")
    @Column(name = "number_floor")
    private Integer numberFloor;

    @Min(value = 1,message = "số người phải là số nguyên dương")
    @Column(name = "max_people")
    private Integer maxPeople;

    @Min(value = 1,message = "chi phí thuê là số dương")
    @Column(name = "rent_cost")
    private Double rentCost;

    @ManyToOne
    @JoinColumn(name = "id_typerent")
    private TypeRent typeRent;

    @ManyToOne
    @JoinColumn(name = "id_typesevice")
    private TypeService typeService;


    @Column(name = "flash_delete")
    private Boolean flashDelete;

    public Service() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(Integer numberFloor) {
        this.numberFloor = numberFloor;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Double getRentCost() {
        return rentCost;
    }

    public void setRentCost(Double rentCost) {
        this.rentCost = rentCost;
    }

    public TypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(TypeRent typeRent) {
        this.typeRent = typeRent;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public Boolean getFlashDelete() {
        return flashDelete;
    }

    public void setFlashDelete(Boolean flashDelete) {
        this.flashDelete = flashDelete;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }
}
