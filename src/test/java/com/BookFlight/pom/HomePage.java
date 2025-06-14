package com.BookFlight.pom;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;

public class HomePage extends BaseClass{
	
	
     WebDriver driver;
	
	//define constructer
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	// Define locators
		private By close = By.xpath("//span[@class=\"commonModal__close\"]");
		private By roundTripButton = By.xpath("//li[@data-cy=\"roundTrip\"]");
		private By sourceCity = By.id("fromCity");
		private By sourcesearchBox = By.xpath("//input[@aria-controls=\'react-autowhatever-1']");
		private By destinationCity = By.id("toCity");
		private By destinationSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
		private By searchButton = By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");
		private By nonStopFirst= By.xpath("//p[text()=\"Non Stop First\"]");
		private By bookNowButton= By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]");
		private By bookTicketButton=By.xpath("//div[@class='keen-slider__slide number-slide1 fareFamilyCardWrapper cta-wrapper']//button[1]");
	
	//Action methods:
	
	public  void closePopUp()
	{
		driver.findElement(close).click();
		
	}
	
	public  void clickRoundTripButton()
	{
		driver.findElement(roundTripButton).click();
	}
	
	public  void entersourceCity(String fromCity)
	{
		driver.findElement(sourceCity).click();
		
	    driver.findElement(sourcesearchBox).sendKeys(fromCity);
	    driver.findElement(By.xpath("//span[text()='"+fromCity+"']")).click();
	}
	
	public   void enterDestinationCity(String toCity) throws InterruptedException
	{   
		
		//Thread.sleep(2000);
		driver.findElement(destinationCity).click();
	//	Thread.sleep(2000);
	    driver.findElement(destinationSearchBox).sendKeys(toCity);
	    driver.findElement(By.xpath("//span[text()='"+toCity+"']")).click();
	}
	
	public  void selectDepartureDate()
	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(450,510)", "");
		driver.findElement(By.xpath("//div[@aria-label='Tue Jul 08 2025']")).click();
		 
		
	}
	
	public  void selectReturnDate()
	{
		driver.findElement(By.xpath("//div[@aria-label='Sat Jul 12 2025']")).click();	
	}
	
   public void clickSearchButton() throws InterruptedException
   {
	   driver.findElement(searchButton).click();
	   Thread.sleep(8000);
   }
   public void clicknonStopButton() throws InterruptedException
	
	{
		
		driver.findElement(nonStopFirst).click();
		
	}
   public void clickonbookNowButton() throws InterruptedException
	
  	{
	    Thread.sleep(4000);
  		driver.findElement(bookNowButton).click();
  		Thread.sleep(4000);
  	}
   public void clickonbookTicketButton() throws InterruptedException
	
 	{
	    Thread.sleep(5000);
 		driver.findElement(bookTicketButton).click();
 		Thread.sleep(5000);
 	}
}
