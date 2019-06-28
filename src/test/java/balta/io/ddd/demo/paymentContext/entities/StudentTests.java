package balta.io.ddd.demo.paymentContext.entities;

import balta.io.ddd.demo.paymentContext.domain.entities.Student;
import balta.io.ddd.demo.paymentContext.domain.entities.Subscription;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTests {

    @Test
    public void addSubscriptionRightWay() {

        Subscription subscription = new Subscription(new Date());
        Student student = new Student("André","Baltieri","1234567812","hello@balta.io");

        student.addSubscription(subscription);


    }

    @Test(expected = UnsupportedOperationException.class)
    public void addSubscriptionWrongWay() {

        Subscription subscription = new Subscription(new Date());
        Student student = new Student("André","Baltieri","1234567812","hello@balta.io");

        student.getSubscriptionList().add(subscription);


    }

}
