package com.selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReads {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Set<String> set = new HashSet<String>();
		int rows = driver.findElements(By.xpath("//th[(.)='Prev Close (Rs)']/ancestor::table//following::tr")).size();
		String xpath;
		for (int i = 2; i <= rows; i++) {
			xpath = "//th[(.)='Prev Close (Rs)']/ancestor::table//following::tr[" + i + "]/td[3]";
			String value = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(value);
			set.add(value);
		}
		System.out.println("****************set" + set.size());
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
