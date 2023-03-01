package com.lightweightapp.services.dbservice.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
    @Column(name = "id")
    private  int paymentID;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "payment_amount")
    private Double paymentAmount;
    @Column(name = "payment_method")
    private String paymentMethod;
    @Column(name = "payment_status")
    private String status;

    public Payment() {
    }

    public Payment(int paymentID, int userId, Double paymentAmount, String paymentMethod, String status) {
        this.paymentID = paymentID;
        this.userId = userId;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
