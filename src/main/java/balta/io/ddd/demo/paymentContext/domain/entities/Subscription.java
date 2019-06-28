package balta.io.ddd.demo.paymentContext.domain.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Subscription {

    private Date createDate;
    private Date lastUpdateDate;
    private Date expireDate;
    private boolean active = false;
    public List<Payment> paymentList = new ArrayList<>();

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
