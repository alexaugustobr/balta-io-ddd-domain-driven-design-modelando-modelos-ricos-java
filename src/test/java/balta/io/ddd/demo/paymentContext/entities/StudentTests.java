package balta.io.ddd.demo.paymentContext.entities;

import balta.io.ddd.demo.paymentContext.domain.entities.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTests {

    @Test
    public void test1() {

        Student student = new Student("","","","");



    }

}
