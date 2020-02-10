package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {

	public static void main(String[] args) 
	{
		
		 System.setProperty("webdriver.gecko.driver", "E:\\MOUNIKA\\Selinum\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();
	      driver.navigate().to("http://www.primusbank.qedgetech.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("txtuId")).sendKeys("Admin");
	      driver.findElement(By.name("txtPword")).sendKeys("Admin");
	      driver.findElement(By.id("login")).click();
	     //branch creation
	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	      driver.findElement(By.id("BtnNewBR")).click();
	      driver.findElement(By.id("txtZip")).sendKeys("55555");
	    Select country=new Select (driver.findElement(By.id("lst_counrtyU")));
	    country.selectByIndex(1);
	    Select state=new Select (driver.findElement(By.id("lst_stateI")));
	    state.selectByIndex(1);
	    Select city=new Select (driver.findElement(By.id("lst_cityI")));
	    city.selectByIndex(1);
	    driver.findElement(By.id("btn_insert")).click();
	    
	    
	    	      
	}

}