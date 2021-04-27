package com.selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		WebDriverWait wait = new WebDriverWait(driver, 10);	
		
		Set<String> windows = driver.getWindowHandles();
		Iterator itr = windows.iterator();
		
		for (String window : windows) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			if(driver.switchTo().window(window).getTitle().equalsIgnoreCase("Sykes")){
//				driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			}
		}
		

	}

}
