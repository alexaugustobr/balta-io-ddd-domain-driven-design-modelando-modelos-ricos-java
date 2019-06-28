package balta.io.ddd.demo.paymentContext.domain.valueObjects;

import balta.io.ddd.demo.paymentContext.shared.valueObjects.ValueObject;

public class Name extends ValueObject {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
