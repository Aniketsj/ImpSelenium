package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIt {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/word-to-pdf");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\auto.exe");
		

	}

}
