package com.codegym.casestudyjavawbe.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "typecustmers")
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "typecustomer_name")
    private String name ;

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customerList ;

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

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public TypeCustomer() {
    }
}
