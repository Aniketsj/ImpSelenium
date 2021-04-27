package com.practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenLink {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(links.size());
		String url = Keys.chord(Keys.CONTROL,Keys.ENTER);
		for(int i =0;i<links.size();i++) {
			links.get(i).sendKeys(url);
		}

		Set<String> win = driver.getWindowHandles();
//		
//		Iterator<String> itr = win.iterator();
//		while(itr.hasNext()) {
//			driver.switchTo().window(itr.next()).getTitle();
//			
//		}
		
		for (String string : win) {
			String title= driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
	}

}
