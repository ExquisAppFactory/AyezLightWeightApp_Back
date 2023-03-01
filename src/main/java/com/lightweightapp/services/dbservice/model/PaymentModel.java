package com.lightweightapp.services.dbservice.model;

import jakarta.persistence.Column;

public class PaymentModel {

    private  int paymentID;
    private int userId;
    private Double paymentAmount;
    private String paymentMethod;
    private String status;

    public PaymentModel() {
    }

    public PaymentModel(int paymentID, int userId, Double paymentAmount, String paymentMethod, String status) {
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
