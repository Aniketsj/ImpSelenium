package com.selenium;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableDataRead {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		Set<String> hs = new TreeSet<String>();
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		System.out.println("rows = " + rows);
		for (int i = 1; i < rows; i++) {
			String xpath = "//table[@class='dataTable']//tr[" + i + "]//a";
			WebElement row = driver.findElement(By.xpath(xpath));

			
			hs.add(row.getText());
			System.out.println(row.getText());
		}
		System.out.println("hs = " + hs.size());

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
