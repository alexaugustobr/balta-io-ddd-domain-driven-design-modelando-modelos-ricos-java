package balta.io.ddd.demo.paymentContext.domain.entities;

import balta.io.ddd.demo.paymentContext.domain.valueObjects.Address;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Document;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Email;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Name;
import balta.io.ddd.demo.paymentContext.shared.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends Entity {

    private Name name;
    private Document document;
    private Email email;
    private Address address;
    private List<Subscription> subscriptionList = new ArrayList<>();

    public Student(Name name, Document document, Email email, Address address) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Document getDocument() {
        return document;
    }

    public Email getEmail() {
        return email;
    }

    public List<Subscription> getSubscriptionList() {
        return Collections.unmodifiableList(this.subscriptionList);
    }

    public Address getAddress() {
        return address;
    }

    public Student addSubscription(Subscription newSubscription) {

        for (Subscription subscription : this.subscriptionList) {
            subscription.activate();
        }

        this.subscriptionList.add(newSubscription);

        return this;
    }
}
