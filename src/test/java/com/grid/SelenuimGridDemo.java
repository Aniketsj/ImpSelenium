package com.grid;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenuimGridDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Capabilities capabilities;
		capabilities=DesiredCapabilities.chrome();
		RemoteWebDriver driver=new RemoteWebDriver(capabilities);

	}

}
