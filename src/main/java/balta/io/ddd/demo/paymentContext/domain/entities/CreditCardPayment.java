package balta.io.ddd.demo.paymentContext.domain.entities;

import java.math.BigDecimal;
import java.util.Date;

public class CreditCardPayment extends Payment {
    private String cardHolderName;
    private String cardNumber;
    private String lastTransactionNumber;

    public CreditCardPayment(Date paidDate, Date expireDate, BigDecimal total, BigDecimal totalPaid, String number, String document, String address, String payer, String cardHolderName) {
        super(paidDate, expireDate, total, totalPaid, number, document, address, payer);
        this.cardHolderName = cardHolderName;
    }

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
