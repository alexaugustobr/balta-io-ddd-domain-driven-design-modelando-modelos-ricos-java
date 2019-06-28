package balta.io.ddd.demo.paymentContext.domain.entities;

import java.math.BigDecimal;
import java.util.Date;

public class BoletoPayment extends Payment {
    private String barcode;
    private String email;
    private String boletoNumber;

    public BoletoPayment(Date paidDate, Date expireDate, BigDecimal total, BigDecimal totalPaid, String number, String document, String address, String payer, String barcode, String email, String boletoNumber) {
        super(paidDate, expireDate, total, totalPaid, number, document, address, payer);
        this.barcode = barcode;
        this.email = email;
        this.boletoNumber = boletoNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBoletoNumber() {
        return boletoNumber;
    }

    public void setBoletoNumber(String boletoNumber) {
        this.boletoNumber = boletoNumber;
    }
}
