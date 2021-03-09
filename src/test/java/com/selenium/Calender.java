package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		String date = "15-May-2021";
		String d[] = date.split("-");
		String day = d[0];
		String mon = d[1];
		String yr = d[2];

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();

		String mon1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yr1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		System.out.println(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText());

		String com = mon1 + " " + yr1;
		System.out.println("com = " + com);
		System.out.println(com.equalsIgnoreCase(mon1 + " " + yr1));

		while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText()
				.equalsIgnoreCase(mon + " " + yr)) {

			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
//			mon1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			yr1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//			com = mon1 + " " + yr1;
		}

		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//a"));
		for (WebElement selectDay : days) {
			if (selectDay.getText().equalsIgnoreCase(day)) {
				selectDay.click();
				break;
			}

		}
	}

}
