package com.codegym.validateuser.models;

import javax.validation.constraints.*;

public class User {
    private String firstName;
    @NotBlank(message = "Last name can't not Blank")
    @Size(min=5,max=45,message = "name invalid")
    private String lastName;

    @Min(value = 18,message = "you are too young!!")
    private int age ;

    @Pattern(regexp = "^0[0-9]{9,10}$",message = "Email invalid!!")
    private String phoneNumber;

    @Email
    private String email ;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
