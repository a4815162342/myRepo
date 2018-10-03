package com.gmail.delta4815162342;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class Cursovaia extends BaseTest {

	@Test
	public static void wrongLoginTest() {

		driver.get("http://localhost/signin.php");

		// Incorrect Login
		SignInPage.enterEmail("test@test.com", driver);
		SignInPage.enterPass("mypass", driver);
		SignInPage.submit(driver);

		SoftAssert testAssert = new SoftAssert();
		testAssert.assertTrue(!SignInPage.isErrorMessagePresent(driver));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Wrong Password
		SignInPage.enterEmail("delta4815162342@gmail.com", driver);
		SignInPage.enterPass("test", driver);
		SignInPage.submit(driver);

		testAssert.assertTrue(!SignInPage.isErrorMessagePresent(driver));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Empty Password
		SignInPage.enterEmail("delta4815162342@gmail.com", driver);
		SignInPage.enterPass("", driver);
		SignInPage.submit(driver);

		testAssert.assertTrue(!SignInPage.isErrorMessagePresent(driver));

		// Positive Test
		SignInPage.enterEmail("delta4815162342@gmail.com", driver);
		SignInPage.enterPass("mypass", driver);
		SignInPage.submit(driver);

		// TODO: assertions for positive test
		testAssert.assertTrue(!SignInPage.isErrorMessagePresent(driver));
	}

	@Test
	public static void addEventTest() {
		driver.get("http://localhost/signin.php");

		// Login
		SignInPage.enterEmail("delta4815162342@gmail.com", driver);
		SignInPage.enterPass("mypass", driver);
		SignInPage.submit(driver);
		
		EventsPage.addEvent(driver);
		
		AddEventPage.enterHeading("testHeading", driver);
		AddEventPage.enterSubHeading("testSubHeading", driver);
		AddEventPage.enterDescription("testDiscription", driver);
		AddEventPage.enterCategory("testCategory", driver);
		AddEventPage.enterDate("12122012", driver);
		AddEventPage.publishEvent(driver);
		
		SoftAssert testAssert = new SoftAssert();

		testAssert.assertTrue(EventsPage.isHeaderPresent("testHeading", driver));
		testAssert.assertTrue(EventsPage.isCategoryPresent("testCategory", driver));
		testAssert.assertTrue(EventsPage.isSubHeaderPresent("testSubHeading", driver));
		
		
	}
}
