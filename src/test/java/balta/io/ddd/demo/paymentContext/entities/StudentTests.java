package balta.io.ddd.demo.paymentContext.entities;

import balta.io.ddd.demo.paymentContext.domain.entities.Student;
import balta.io.ddd.demo.paymentContext.domain.entities.Subscription;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Document;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Email;
import balta.io.ddd.demo.paymentContext.domain.valueObjects.Name;
import org.junit.Assert;
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
        Student student = new Student(new Name("André","Baltieri"),new Document("1234567812", Document.Type.CPF), new Email("hello@balta.io"), null);

        student.addSubscription(subscription);


    }

    @Test(expected = UnsupportedOperationException.class)
    public void addSubscriptionWrongWay() {

        Subscription subscription = new Subscription(new Date());
        Student student = new Student(new Name("André","Baltieri"),new Document("1234567812", Document.Type.CPF), new Email("hello@balta.io"), null);

        student.getSubscriptionList().add(subscription);


    }

    @Test
    public void blankNameFail() {

        Subscription subscription = new Subscription(new Date());
        Student student = new Student(new Name("","Baltieri"),new Document("1234567812", Document.Type.CPF), new Email("hello@balta.io"), null);

        Assert.assertTrue(student.isInvalid());


    }

    @Test
    public void namePass() {

        Subscription subscription = new Subscription(new Date());
        Student student = new Student(new Name("André","Baltieri"),new Document("1234567812", Document.Type.CPF), new Email("hello@balta.io"), null);

        Assert.assertTrue(student.isValid());


    }

}
