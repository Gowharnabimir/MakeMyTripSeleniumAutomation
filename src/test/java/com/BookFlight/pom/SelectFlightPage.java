package com.BookFlight.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;

public class SelectFlightPage extends BaseClass{
	
	

    WebDriver driver;
	
	//define constructer
	public SelectFlightPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	//locaters
	
	private By nonStopFirst= By.xpath("//p[text()=\"Non Stop First\"]");
	
	//Actions Methods
	
	
	public void clicknonStopButton() throws InterruptedException
	
	{
		Thread.sleep(5000);
		driver.findElement(nonStopFirst).click();
	}

}




