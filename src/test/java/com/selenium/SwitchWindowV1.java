package com.selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindowV1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		WebDriverWait wait = new WebDriverWait(driver, 30);	
		
		String p =driver.getWindowHandle();
		System.out.println(p);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		String parent = itr.next();
		System.out.println("Parent  = "+parent);
		String child = itr.next();
		System.out.println("child  = "+child);
		System.out.println("befor switch title = "+driver.getTitle());
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		System.out.println("after switch title = "+driver.getTitle());
		
		driver.switchTo().window(parent);
		System.out.println("after default switch title = "+driver.getTitle());
		
	}

}
