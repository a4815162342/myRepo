package com.gmail.delta4815162342;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventsPage {
	
	public static void getEvents(WebDriver driver) {
		driver.findElement(By.id("events")).click();
	}
	
	public static void addEvent(WebDriver driver) {
		driver.findElement(By.id("addEvent")).click();
	}
	
	public static void signIn(WebDriver driver) {
		driver.findElement(By.id("signIn")).click();
	}
	
	public static void signOut(WebDriver driver) {
		driver.findElement(By.id("signOut")).click();
	}
	
	public static Boolean isHeaderPresent(String searchCriteria, WebDriver driver) {
		List<WebElement> headers = driver.findElements(By.className("Heading"));
		long matching = 0;
		matching = headers.stream().filter(event -> event.getText().contains(searchCriteria)).count();
		
		if(matching == 0) {
			return false;
		}
		
		return true;
	}
	
	public static Boolean isSubHeaderPresent(String searchCriteria, WebDriver driver) {
		List<WebElement> subHeaders = driver.findElements(By.className("Subheading"));
		long matching = 0;
		matching = subHeaders.stream().filter(event -> event.getText().contains(searchCriteria)).count();
		
		if(matching == 0) {
			return false;
		}
		
		return true;
	}
	
	public static Boolean isCategoryPresent(String searchCriteria, WebDriver driver) {
		List<WebElement> category = driver.findElements(By.className("Category"));
		long matching = 0;
		matching = category.stream().filter(event -> event.getText().contains(searchCriteria)).count();
		
		if(matching == 0) {
			return false;
		}
		
		return true;
	}
}
