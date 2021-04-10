package Fadda_Hyan;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.junit.Test;

/*
 * This class is created to test some of the method of Email class using JUnit testing framework.
 * As the class Email is abstract class so we have inherited this Email class in EmailMock class
 * By doing that, we are able to create constructor of EmailMock class and assign it to Email class reference as below:
 * 
 * Email email1 = new EmailMock();
 * 
 * EmailMock works as Mock class and this is how we are able to call the actual methods of Email class.
 * 
 */

public class TestEmailClass {

	// This method is created to test the "getSocketConnectionTimeout()" method
	@Test
	public void TestGetSocketConnectionTimeout() {
		Email email = new EmailMock();

		// It asserts that two longs are equal
		assertEquals(60000, email.getSocketConnectionTimeout());
	}

	