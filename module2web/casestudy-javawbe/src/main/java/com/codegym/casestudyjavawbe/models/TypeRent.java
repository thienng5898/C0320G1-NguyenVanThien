package com.codegym.casestudyjavawbe.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "typerents")
public class TypeRent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "typerent_name")
    private String name ;

    @OneToMany(targetEntity = Service.class)
    private List<Service> serviceList ;

    public TypeRent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
