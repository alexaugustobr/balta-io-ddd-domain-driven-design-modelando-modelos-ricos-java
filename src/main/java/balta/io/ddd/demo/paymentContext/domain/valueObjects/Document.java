package balta.io.ddd.demo.paymentContext.domain.valueObjects;

import balta.io.ddd.demo.paymentContext.shared.valueObjects.ValueObject;

public class Document extends ValueObject {

    private String number;

    private Type type;

    public Document(String number, Type type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        CPF,
        CNPJ
    }
}
