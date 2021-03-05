package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenuimGridDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities;
		capabilities=DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.ANY);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.107:4444/wd/hub"),capabilities);
		driver.get("https://www.google.com/");
		System.out.println("Done");

	}

}
