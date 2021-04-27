import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		String date = "15-May-2021";

		String[] date1 = date.split("-");
		String day = date1[0];
		String month = date1[1];
		String year = date1[2];

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();

		String montxt = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']"))
				.getText();
		String yeartxt = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"))
				.getText();

//		String monthyr = montxt + " " +yeartxt;
//		
//		while (!monthyr.equalsIgnoreCase(month + " " + year)) {
//			Thread.sleep(2000);
//
//			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
//			montxt = driver
//					.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']"))
//					.getText();
//			yeartxt = driver
//					.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"))
//					.getText();
//			monthyr = montxt + " " + yeartxt;
// 
//		}

		while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText()
				.equalsIgnoreCase(month + " " + year)) {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		}

		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for (int i = 0; i < days.size(); i++) {
			if (day.equalsIgnoreCase(days.get(i).getText())) {
				days.get(i).click();
				break;
			}
		}

	}

}
