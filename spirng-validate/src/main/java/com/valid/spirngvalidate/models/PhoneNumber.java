package com.valid.spirngvalidate.models;

import com.valid.spirngvalidate.validation.ContactNumberConstraint;

public class PhoneNumber {
    @ContactNumberConstraint
    private String number ;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
