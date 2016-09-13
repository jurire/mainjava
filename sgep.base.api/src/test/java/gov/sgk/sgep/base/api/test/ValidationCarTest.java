package gov.sgk.sgep.base.api.test;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * javax validation test sınıfı
 * @author o-mssahin
 *
 */
public class ValidationCarTest {
	
	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void manufacturerIsNull() {
		Car car = new Car(null, "DD-AB-123", 4);
		Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);
		assertEquals(1, constraintViolations.size());
		//assertEquals("may not be null", constraintViolations.iterator().next().getMessage());
	}

	@Test
	public void licensePlateTooShort() {
		Car car = new Car("Morris", "D", 4);

		Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

		assertEquals(1, constraintViolations.size());
		// assertEquals("size must be between 2 and 14",
		// constraintViolations.iterator().next().getMessage());
		//constraintViolations.forEach((c) -> System.out.println(c.getMessage()));
	}

	@Test
	public void seatCountTooLow() {
		Car car = new Car("Morris", "DD-AB-123", 1);

		Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

		assertEquals(1, constraintViolations.size());
		//assertEquals("must be greater than or equal to 2", constraintViolations.iterator().next().getMessage());
	}

	@Test
	public void carIsValid() {
		Car car = new Car("Morris", "DD-AB-123", 2);
		car.setEklemeZamani(new Timestamp(new Date().getTime()));

		Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

		assertEquals(0, constraintViolations.size());
	}
}
