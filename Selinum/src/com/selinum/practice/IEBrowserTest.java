package com.selinum.practice;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "E:\\MOUNIKA\\Selinum\\IEDriverServer.exe");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://amazon.in");

	}

}
