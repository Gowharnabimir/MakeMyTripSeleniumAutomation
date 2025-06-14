package com.BookFlight.testcases;

import org.testng.annotations.Test;

import com.BookFlight.pom.HomePage;
import com.BookFlight.pom.SelectFlightPage;

import Base.BaseClass;


public class TestCases extends BaseClass {

	@Test
	public void searchFlightTickets() throws InterruptedException {
		HomePage homepage = new HomePage(driver); // use BaseTest.driver
		homepage.closePopUp();
		homepage.clickRoundTripButton();
		homepage.entersourceCity("Dubai");
		homepage.enterDestinationCity("New Delhi");
		homepage.selectDepartureDate();
		homepage.selectReturnDate();
		homepage.clickSearchButton();
		homepage.clicknonStopButton();
		homepage.clickonbookNowButton();
		homepage.clickonbookTicketButton();
		
	}
	
	@Test
	public void selectFlightTicket() throws InterruptedException {
		
		
		SelectFlightPage sp = new SelectFlightPage(driver);
		sp.clicknonStopButton();
	    
	}
}
