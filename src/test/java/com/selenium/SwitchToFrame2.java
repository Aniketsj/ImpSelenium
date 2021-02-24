package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/fantasy-cricket");

		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		for (WebElement webElement : list) {
			driver.switchTo().frame(webElement);
			System.out.println("switch");
			driver.switchTo().defaultContent();
			
		}
		
		
	}

}
