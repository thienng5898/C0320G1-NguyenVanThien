package com.codegym.casestudyjavawbe.models;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name = "detailcontracts")
public class DetailContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @JoinColumn(name = "contract_id")
    @ManyToOne(targetEntity = Contract.class)
    private Contract contract ;

    @Column(name = "bonus_service")
    private String bonusService ;

    @Column(name = "amount")
    private Integer amount ;

    public DetailContract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getBonusService() {
        return bonusService;
    }

    public void setBonusService(String bonusService) {
        this.bonusService = bonusService;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
