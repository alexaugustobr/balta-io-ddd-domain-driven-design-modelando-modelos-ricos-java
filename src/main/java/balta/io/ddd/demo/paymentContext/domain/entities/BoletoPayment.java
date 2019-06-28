package balta.io.ddd.demo.paymentContext.domain.entities;

import balta.io.ddd.demo.paymentContext.domain.valueObjects.Address;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Document;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Email;

import java.math.BigDecimal;
import java.util.Date;

public class BoletoPayment extends Payment {
    private String barcode;
    private String boletoNumber;

    public BoletoPayment(Date paidDate, Date expireDate, BigDecimal total, BigDecimal totalPaid, Document document, Address address, String payer, Email email, String barcode) {
        super(paidDate, expireDate, total, totalPaid, document, address, payer, email);
        this.barcode = barcode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBoletoNumber() {
        return boletoNumber;
    }

    public void setBoletoNumber(String boletoNumber) {
        this.boletoNumber = boletoNumber;
    }
}
