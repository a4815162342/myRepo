package com.gmail.delta4815162342;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	private static WebElement emailInputField;
	private static WebElement passwordInputField;
	private static WebElement submitButton;
	private static WebElement errorMessage;
	
	public static void enterEmail(String email, WebDriver driver) {
		emailInputField = driver.findElement(By.id("email"));
		emailInputField.sendKeys(email);
	}
	
	public static void enterPass(String pass, WebDriver driver) {
		passwordInputField = driver.findElement(By.id("password"));
		passwordInputField.sendKeys(pass);
	}
	
	public static void submit(WebDriver driver) {
		submitButton = driver.findElement(By.id("submitButton"));
		submitButton.click();
	}
	
	public static boolean isErrorMessagePresent(WebDriver driver) {
		
		try {
			errorMessage = driver.findElement(By.id("errorMessage"));
		}catch(Exception e){
			return false;
		}
		
		return errorMessage.isDisplayed();
	}
}
