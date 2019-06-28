package balta.io.ddd.demo.paymentContext.domain.entities;

import balta.io.ddd.demo.paymentContext.domain.valueObjects.Address;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Document;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Email;

import java.math.BigDecimal;
import java.util.Date;

public class PayPalPayment extends Payment {
    private String transactionCode;

    public PayPalPayment(Date paidDate, Date expireDate, BigDecimal total, BigDecimal totalPaid, Document document, Address address, String payer, Email email, String transactionCode) {
        super(paidDate, expireDate, total, totalPaid, document, address, payer, email);
        this.transactionCode = transactionCode;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }
}
