package balta.io.ddd.demo;

import balta.io.ddd.demo.flunt.validations.Contract;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {

		Integer integer = Integer.valueOf(0);
		BigDecimal bigDecimal = BigDecimal.ZERO;

		Contract contract = new Contract().isGreaterOrEqualsThan(integer, bigDecimal, "", "");

		Assert.assertTrue(contract.isInvalid());

	}

}
