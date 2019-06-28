package balta.io.ddd.demo.paymentContext.domain.entities;

import balta.io.ddd.demo.paymentContext.domain.valueObjects.Address;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Document;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Email;
import balta.io.ddd.demo.paymentContext.shared.Entity;
import balta.io.ddd.demo.utils.GUIDUtils;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Payment extends Entity {

    private Date paidDate;
    private Date expireDate;
    private BigDecimal total;
    private BigDecimal totalPaid;
    private String number = GUIDUtils.generateNewGuidNumbersOnlyAsString();
    private Document document;
    private Address address;
    private String payer;
    private Email email;

    public Payment(Date paidDate, Date expireDate, BigDecimal total, BigDecimal totalPaid, Document document, Address address, String payer, Email email) {
        this.paidDate = paidDate;
        this.expireDate = expireDate;
        this.total = total;
        this.totalPaid = totalPaid;
        this.document = document;
        this.address = address;
        this.payer = payer;
        this.email = email;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public String getNumber() {
        return number;
    }

    public Document getDocument() {
        return document;
    }

    public Address getAddress() {
        return address;
    }

    public String getPayer() {
        return payer;
    }

    public Email getEmail() {
        return email;
    }
}

