package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavatpointClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/java-tutorial");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='menu']//a"));
		ArrayList arr = new ArrayList();
		for (WebElement topic : list) {
			arr.add(topic.getText());
			
		}
		
		System.out.println("topic name*********************");
		for (Object object : arr) {
			System.out.println(object);
		}
	}

}
