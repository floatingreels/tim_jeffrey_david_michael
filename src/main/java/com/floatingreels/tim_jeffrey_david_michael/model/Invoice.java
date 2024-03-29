//package com.floatingreels.tim_jeffrey_david_michael.model;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
//Author DG
//entiteit facturen/bestellingen, om datatabel bij te houden van alle geplaatste bestellingen. nog niet in website geïmplementeerd
//@Entity
//public class Invoice {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private ArrayList<Product> orderList;
//    private LocalDateTime orderTime;
    //regex gevonden op https://emailregex.com/
//    @Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
//    private String email;
//    @DecimalMin(value = "0.05")
//    private BigDecimal total;
//
//    public Invoice() {
//        orderTime = LocalDateTime.now();
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public ArrayList<Product> getOrderList() {
//        return orderList;
//    }
//
//    public LocalDateTime getOrderTime() {
//        return orderTime;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public BigDecimal getPrice() {
//        return total;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setOrderList(ArrayList<Product> orderList) {
//        this.orderList = orderList;
//    }
//
//    public void setOrderTime(LocalDateTime orderTime) {
//        this.orderTime = orderTime;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.total = price;
//    }
//}
