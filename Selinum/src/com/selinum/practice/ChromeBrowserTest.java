package com.selinum.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "E:\\MOUNIKA\\Selinum\\chromedriver\\chromedriver.exe");
			ChromeDriver ob = new ChromeDriver();
			ob.get("https://www.google.com/");

	}

}
