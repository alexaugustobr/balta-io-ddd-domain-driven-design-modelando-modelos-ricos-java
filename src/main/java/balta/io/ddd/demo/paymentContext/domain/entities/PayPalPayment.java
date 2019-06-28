package balta.io.ddd.demo.paymentContext.domain.entities;

import java.math.BigDecimal;
import java.util.Date;

public class PayPalPayment extends Payment {
    private String transactionCode;

    public PayPalPayment(Date paidDate, Date expireDate, BigDecimal total, BigDecimal totalPaid, String number, String document, String address, String payer, String transactionCode) {
        super(paidDate, expireDate, total, totalPaid, number, document, address, payer);
        this.transactionCode = transactionCode;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }
}
