package balta.io.ddd.demo.paymentContext.domain.entities;

import balta.io.ddd.demo.Utils.GUIDUtils;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Payment {

    private Date paidDate;
    private Date expireDate;
    private BigDecimal total;
    private BigDecimal totalPaid;
    private String number = GUIDUtils.generateNewGuidNumbersOnlyAsString();
    private String document;
    private String address;
    private String payer;

    public Payment(Date paidDate, Date expireDate, BigDecimal total, BigDecimal totalPaid, String number, String document, String address, String payer) {
        this.paidDate = paidDate;
        this.expireDate = expireDate;
        this.total = total;
        this.totalPaid = totalPaid;
        this.number = number;
        this.document = document;
        this.address = address;
        this.payer = payer;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

}

