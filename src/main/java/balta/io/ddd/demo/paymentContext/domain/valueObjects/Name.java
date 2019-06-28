package balta.io.ddd.demo.paymentContext.domain.valueObjects;

import balta.io.ddd.demo.paymentContext.shared.valueObjects.ValueObject;
import org.apache.commons.lang3.StringUtils;

public class Name extends ValueObject {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (StringUtils.isBlank(firstName)) {
            this.addNotification("firstName", "Nome inválido.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
