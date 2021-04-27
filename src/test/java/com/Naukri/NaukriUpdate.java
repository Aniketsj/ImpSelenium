package com.Naukri;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

public class NaukriUpdate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(10000);
		Set<String> window = driver.getWindowHandles();
		System.out.println(window.size());
		System.out.println(driver.getTitle());

		for (String string : window) {
			driver.switchTo().window(string);
			if (driver.getTitle().contains("Jobs - Recruitment")) {
//				driver.switchTo().window(string);
				System.out.println("done=" + driver.getTitle());
				break;
			}
		}
//
//		driver.findElement(By.id("login_Layer")).click();
//		WebElement email = driver
//				.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
//
//		String a = driver.findElement(By.xpath("//a[text()='Register for free']")).getText();
//		System.out.println(a);
//		email.sendKeys("aniketjadhav2k19@gmail.com");
//
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@niDam0721");
//
//		driver.findElement(By.xpath("//input[@type='password']//following::button[text()='Login']")).click();
//		Thread.sleep(5000);
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//*[text()='My Naukri']"))).build().perform();
//		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[text()='Attach Resume']")));
//
//		WebElement editResumeHeadline = driver.findElement(By.xpath("//div[@class='cardPad']//span[text()='Resume Headline']/following-sibling::span"));
//		wait.until(ExpectedConditions.elementToBeClickable(editResumeHeadline));
//		editResumeHeadline.click();
//		
//		WebElement txtBox = driver.findElement(By.id("resumeHeadlineTxt"));
//		if(txtBox.getText().endsWith(".")){
//			txtBox.sendKeys(Keys.BACK_SPACE);
//			txtBox.sendKeys(".");
//			
//		}
//		
//		driver.findElement(By.xpath("//form[@name='resumeHeadlineForm']//button[text()='Save']")).click();
		
	}

}
