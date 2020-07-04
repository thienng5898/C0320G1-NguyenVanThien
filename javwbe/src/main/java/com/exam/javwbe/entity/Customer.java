package com.exam.javwbe.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Date;


@Entity
@Table(name = "customers")
public class Customer implements Validator {
    @Id
    @GeneratedValue
    private Long id ;

    @Pattern(regexp = "^KH-[0-9]{4}$", message = "mã khách hàng định dạng KH-XXXX , X từ 0-9.")
    @Column(name = "customer_code")
    private String codeCustomer;

    @Column(name = "customer_type")
    private String typeCustomer ;

    @Column(name = "customer_name")
    private String nameCustomer ;

    @Column(name = "gender")
    private String gender ;

    @Pattern(regexp = "(^((\\d{4}).(\\d{3}).(\\d{3})$))", message = "Số điện thoại XXXX.XXX.XXX ,X số 0-9 ")
    @Column(name = "phone")
    private String phone ;

    @Pattern(regexp = "^[A-Za-z0-9]{3,10}+@[A-Za-z0-9]{3,10}+.[a-z]{2,6}$", message = "Email không đúng định dạng")
    @Column(name = "customer_email")
    private String email;

    @Column(name = "id_card")
    private String idCard;

    @DateTimeFormat(pattern ="yyyy-MM-dd")
    @Column(name = "customer_birthday")
    private Date birthday;

    @Column(name = "address")
    private String address ;

    @Column(name = "flash_delete")
    private Boolean flashDelete ;

    public Boolean getFlashDelete() {
        return flashDelete;
    }

    public void setFlashDelete(Boolean flashDelete) {
        this.flashDelete = flashDelete;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
          Customer customer =(Customer) o ;
          Date date = new Date() ;
        if  (date.getYear() - customer.birthday.getYear()<18){
            errors.rejectValue("birthday","customer.birthday.empty");
        }
    }
}
