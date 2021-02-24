package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@jscontroller='BLvsRb']/div/a"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			webElement.sendKeys(click);
			
		}
		System.out.println("for loop");
		int size = driver.findElements(By.xpath("//div[@jscontroller='BLvsRb']/div/a")).size();
		for(int i=0;i<size;i++){
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElements(By.xpath("//div[@jscontroller='BLvsRb']/div/a")).get(i).sendKeys(click);
			System.out.println(driver.findElements(By.xpath("//div[@jscontroller='BLvsRb']/div/a")).get(i).getText());
			
		}
		
		
		
	}

}
