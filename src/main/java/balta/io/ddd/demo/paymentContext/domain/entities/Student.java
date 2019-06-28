package balta.io.ddd.demo.paymentContext.domain.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String document;
    private String email;
    private String address;
    private List<Subscription> subscriptionList = new ArrayList<>();

    public Student(String firstName, String lastName, String document, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    public String getEmail() {
        return email;
    }

    public List<Subscription> getSubscriptionList() {
        return Collections.unmodifiableList(this.subscriptionList);
    }

    public String getAddress() {
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
