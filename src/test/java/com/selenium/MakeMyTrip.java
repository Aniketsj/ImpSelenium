package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		WebDriverWait wait = new WebDriverWait(driver, 30);	
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//input[@id='fromCity']"))));
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();

		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//input[@placeholder='From']"))));
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li//p"));
		for (WebElement city : list) {
			if(city.getText().contains("Mumbai")){
				city.click();
				break;
			}
		}
	}

}
