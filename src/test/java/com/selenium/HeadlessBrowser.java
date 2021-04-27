package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");

		ChromeOptions option=new ChromeOptions();
		option.setHeadless(false);
		WebDriver driver = new ChromeDriver(option);
//		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("done");
		System.out.println(true);
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String link = "window.open('','_blank');";
		js.executeScript(link);

		
			
			
			

	}

}
