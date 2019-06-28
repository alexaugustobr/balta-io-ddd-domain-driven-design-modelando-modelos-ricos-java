package balta.io.ddd.demo.paymentContext.domain.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Subscription {

    private Date createDate = new Date();
    private Date lastUpdateDate = new Date();
    private Date expireDate;
    private boolean active = false;
    private List<Payment> paymentList = new ArrayList<>();

    public Subscription(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public boolean isActive() {
        return active;
    }

    public List<Payment> getPaymentList() {
        return Collections.unmodifiableList(paymentList);
    }

    public Subscription addPayment(Payment newPayment) {
        this.lastUpdateDate = new Date();
        this.paymentList.add(newPayment);
        return this;
    }

    public Subscription activate() {
        this.active = true;
        this.lastUpdateDate = new Date();
        return this;
    }

    public Subscription inactivate() {
        this.active = false;
        this.lastUpdateDate = new Date();
        return this;
    }
}
