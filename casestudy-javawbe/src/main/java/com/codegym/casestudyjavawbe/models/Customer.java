package com.codegym.casestudyjavawbe.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Date;


@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name")
    private String name;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "customer_birthday")
    private Date birthday;

    @Pattern(regexp = "(^[0-9]{9}$)|(^[0-9]{12}$)", message = "CMND 9 hoặc 12 số")
    @Column(name = "id_card")
    private String idCard;


    @Pattern(regexp = "(^09[0|1][0-9]{7}$)|(^\\(84\\)+9[0|1][0-9]{7}$)", message = "Số điện thoại không đúng ")
    @Column(name = "customer_phone")
    private String phone;

    @Column(name = "gender")
    private String gender;


    @Pattern(regexp = "^[A-Za-z0-9]+@[A-Za-z0-9]+.[a-z]{2,6}$", message = "Email không đúng định dạng")
    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_type_customer")
    private TypeCustomer typeCustomer ;

    @Pattern(regexp = "^KH-[0-9]{4}$", message = "mã khách hàng định dạng KH-XXXX , X từ 1-9.")
    @Column(name = "customer_code")
    private String codeCustomer;

    @Column(name = "flashDelete")
    private Boolean flashDelete;

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


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public Boolean getFlashDelete() {
        return flashDelete;
    }

    public void setFlashDelete(Boolean flashDelete) {
        this.flashDelete = flashDelete;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public Customer() {
    }
}
