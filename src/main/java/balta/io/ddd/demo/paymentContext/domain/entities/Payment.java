package balta.io.ddd.demo.paymentContext.domain.entities;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Payment {

    private Date paidDate;
    private Date expireDate;
    private BigDecimal total;
    private BigDecimal totalPaid;
    private String number;
    private String document;
    private String address;
    private String payer;

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

    public class Boleto extends Payment {
        private String barcode;
        private String email;
        private String boletoNumber;

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

    public class CreditCard extends Payment {
        private String cardHolderName;
        private String cardNumber;
        private String lastTransactionNumber;

        public String getCardHolderName() {
            return cardHolderName;
        }

        public void setCardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getLastTransactionNumber() {
            return lastTransactionNumber;
        }

        public void setLastTransactionNumber(String lastTransactionNumber) {
            this.lastTransactionNumber = lastTransactionNumber;
        }
    }

    public class PayPal extends Payment {
        private String transactionCode;

        public String getTransactionCode() {
            return transactionCode;
        }

        public void setTransactionCode(String transactionCode) {
            this.transactionCode = transactionCode;
        }
    }
}

