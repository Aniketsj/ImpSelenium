package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTabBlank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String link = "window.open('','_blank');";
		js.executeScript(link);
	}

}
