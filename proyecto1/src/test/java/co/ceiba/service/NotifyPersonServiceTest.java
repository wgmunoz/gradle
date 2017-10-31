package co.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Person;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup() {
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);		
	}
	
	@Test
	public void notifyTest() {
		//arrange
		Person person = new PersonTestDataBuilder().build();
		//act
		String message = notifyPersonService.notify(person);
		//assert
		Assert.assertNotNull(message);
	}

}
