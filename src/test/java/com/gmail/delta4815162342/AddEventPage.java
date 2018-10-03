package com.gmail.delta4815162342;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEventPage {
	
	private static WebElement heading;
	private static WebElement subHeading;
	private static WebElement description;
	private static WebElement category;
	private static WebElement date;
	
	public static void enterHeading(String inputData, WebDriver driver) {
		heading = driver.findElement(By.id("heading"));
		heading.sendKeys(inputData);
	}
	
	public static void enterSubHeading(String inputData, WebDriver driver) {
		subHeading = driver.findElement(By.id("subheading"));
		subHeading.sendKeys(inputData);
	}
	
	public static void enterDescription(String inputData, WebDriver driver) {
		description = driver.findElement(By.id("description"));
		description.sendKeys(inputData);
	}
	
	public static void enterCategory(String inputData, WebDriver driver) {
		category = driver.findElement(By.id("category"));
		category.sendKeys(inputData);
	}
	
	public static void enterDate(String inputData, WebDriver driver) {
		date = driver.findElement(By.id("date"));
		date.sendKeys(inputData);
	}
	
	public static void publishEvent(WebDriver driver) {
		driver.findElement(By.id("publish")).click();
	}
}
