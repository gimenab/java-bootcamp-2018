package com.globant.dto;

import com.globant.model.Payment;

import java.util.ArrayList;
import java.util.List;

public class ClientDTO {
    private Integer id;
    private String name;
    private String surname;
    private String description;
    private List<Payment> PaymentList = new ArrayList <Payment>();

    public ClientDTO() {
    }

    public ClientDTO(Integer id ) {
        this.id = id;
    }

    public ClientDTO(Integer id, String name, String surmane, String description, List<Payment> paymentArrayList) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.PaymentList = PaymentList;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurmane() {
        return surname;
    }

    public String getDescription() {
        return description;
    }

    public List<Payment> getPaymentList() {
        return PaymentList;
    }

    public void setId(Integer id ) {
        this.id = id;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setSurmane( String surmane ) {
        this.surname = surname;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public void setPaymentList(List<Payment> PaymentList) {
        this.PaymentList = PaymentList;
    }
}
