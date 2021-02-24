package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestinghelp.com/");

		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		for (WebElement frame : list) {

			driver.switchTo().frame(frame);
			System.out.println("done");

			System.out.println("inside for");

		}
	}

}
