package balta.io.ddd.demo.paymentContext.domain.valueObjects;

import balta.io.ddd.demo.paymentContext.shared.valueObjects.ValueObject;

public class Email extends ValueObject {

    private String address;

    public Email(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
