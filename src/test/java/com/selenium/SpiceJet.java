package com.selenium;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Programs\\Java\\Practice\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"(//label[contains(text(),'Depart date')]//parent::div//following-sibling::button[@class='ui-datepicker-trigger'])[1]")));
		driver.findElement(By
				.xpath("(//label[contains(text(),'Depart date')]//parent::div//following-sibling::button[@class='ui-datepicker-trigger'])[1]"))
				.click();

		String month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		String year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		String MonthYear = month + " " + year;

		LocalDate currentDate = LocalDate.now();
		LocalDate newDate = currentDate.plusWeeks(2);
		
		String mon = newDate.getMonth()+"";
		String yr = newDate.getYear()+"";
		String day = newDate.getDayOfMonth()+"";

		while (!MonthYear.equalsIgnoreCase(mon + " " + yr)) {
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")));
			month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
			year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
			MonthYear = month + " " + year;
		}

		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td/a"));
		for (WebElement daySelect : list) {
			if (day.equalsIgnoreCase(daySelect.getText())) {
				daySelect.click();
				break;
			}
		}

		//
		// WebElement month=
		// driver.findElement(By.xpath("//div[@class='ui-datepicker-group
		// ui-datepicker-group-first']//span[@class='ui-datepicker-month']"));
		// if(month.getText().equalsIgnoreCase("January")){
		// List<WebElement> list =
		// driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//td/a"));
		// System.out.println(list.size());
		//
		// for (int i = 0; i < list.size(); i++) {
		// if (list.get(i).getText().equalsIgnoreCase("8")) {
		// list.get(i).click();
		// }
		// }
		// }

	}

}
