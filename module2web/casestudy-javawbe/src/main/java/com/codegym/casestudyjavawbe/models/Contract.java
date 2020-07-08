package com.codegym.casestudyjavawbe.models;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "contracts")
public class Contract implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "employee")
    private String employeeName;


    @JoinColumn(name = "customer_id")
    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;

    @JoinColumn(name = "service_id")
    @ManyToOne(targetEntity = Service.class)
    private Service service;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "contract_day")
    private Date contractDay;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "finish_date")
    private Date finishDate;


    @Column(name = "deposit")
    private Integer deposit;


    @Column(name = "money_total")
    private Integer moneyTotal;

    @Column(name = "flash_delete")
    private Boolean flashDelete;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getContractDay() {
        return contractDay;
    }

    public void setContractDay(Date contractDay) {
        this.contractDay = contractDay;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getMoneyTotal() {
        return moneyTotal;
    }

    public void setMoneyTotal(Integer moneyTotal) {
        this.moneyTotal = moneyTotal;
    }

    public Boolean getFlashDelete() {
        return flashDelete;
    }

    public void setFlashDelete(Boolean flashDelete) {
        this.flashDelete = flashDelete;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Contract() {
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Contract.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
       Contract contract = (Contract) o;
       if  (contract.deposit == null){
           errors.rejectValue("deposit","customer.name.empty");
       }else if (contract.deposit<0 ){
           errors.rejectValue("deposit","customer.name.empty");
       }
    }
}
