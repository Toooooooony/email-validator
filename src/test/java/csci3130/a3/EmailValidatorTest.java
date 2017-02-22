package csci3130.a3;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidatorTest {
	
	@Test
	public void testConstructor() {
		EmailValidator ev = new EmailValidator();
		assertNotNull(ev);
	}
	
	@Test
	public void testIsAt1() {
		EmailValidator ev = new EmailValidator();
		boolean except = true;
		String forTest = "test@test.com";
		boolean result = ev.isOneAt(forTest);
		assertFalse(except != result);
	}
	
	@Test
	public void testIsAt2() {
		EmailValidator ev = new EmailValidator();
		boolean except = false;
		String forTest = "testtest.com";
		boolean result = ev.isOneAt(forTest);
		assertFalse(except != result);
	}
	
	@Test
	public void testIsAt3() {
		EmailValidator ev = new EmailValidator();
		boolean except = false;
		String forTest = "test@@test.com";
		boolean result = ev.isOneAt(forTest);
		assertFalse(except != result);
	}
	
	@Test
	public void testIsPoint1() {
		EmailValidator ev = new EmailValidator();
		boolean except = true;
		String forTest = "testtest.com";
		boolean result = ev.isPoint(forTest);
		assertFalse(except != result);
	}
	
	@Test
	public void testIsPoint2() {
		EmailValidator ev = new EmailValidator();
		boolean except = false;
		String forTest = "testtestcom";
		boolean result = ev.isPoint(forTest);
		assertFalse(except != result);
	}
	
	@Test
	public void testIsValid1() {
		EmailValidator ev = new EmailValidator();
		boolean except = false;
		String forTest = "testtest.com";
		ev.setEmailAddress(forTest);
		boolean result = ev.isValid();
		assertFalse(except != result);
	}
	
	@Test
	public void testIsValid2() {
		EmailValidator ev = new EmailValidator();
		boolean except = false;
		String forTest = "test@@testcom";
		ev.setEmailAddress(forTest);
		boolean result = ev.isValid();
		assertFalse(except != result);
	}
	
	@Test
	public void testIsValid3() {
		EmailValidator ev = new EmailValidator();
		boolean except = false;
		String forTest = "test@testcom";
		ev.setEmailAddress(forTest);
		boolean result = ev.isValid();
		assertFalse(except != result);
	}
	
	@Test
	public void testIsValid4() {
		EmailValidator ev = new EmailValidator();
		boolean except = true;
		String forTest = "test@test.com";
		ev.setEmailAddress(forTest);
		boolean result = ev.isValid();
		assertFalse(except != result);
	}

}
