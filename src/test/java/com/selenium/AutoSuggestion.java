package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.id("fromPlaceName")).sendKeys("bang");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		String txt = driver.findElement(By.id("fromPlaceName")).getText();
		System.out.println(txt);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String d= "return document.getElementById(\\\"fromPlaceName\\\").value;";
		String tx = (String) js.executeScript(d);
		System.out.println("java= "+ tx);
		
		
		
		
		
		
		
		
		
		
	}

}
