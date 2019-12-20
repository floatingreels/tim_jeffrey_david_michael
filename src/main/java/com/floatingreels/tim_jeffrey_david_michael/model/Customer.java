package com.floatingreels.tim_jeffrey_david_michael.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message="{empty_field}")
    private String fullName;
    @Column(columnDefinition = "text")
    @NotNull(message="{empty_field}")
    private String fullAddress;
    @Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])",
            message="{invalid_email}" )
    @NotNull(message="{empty_field}")
    private String email;
    @Pattern(regexp = "((?=.*[a-zA-Z])(?=.*d)(?=.*[@#$%]).{6,16})",
            message="{invalid_pass}" )
    @NotNull(message="{empty_field}")
    private String password;


    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String firstName) {
        this.fullName = firstName;
    }

    public void setFullAddress(String street) {
        this.fullAddress = street;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

