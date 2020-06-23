package com.Roicians.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Roicians.base.TestBase;
import com.Roicians.pages.AboutUsPage;
import com.Roicians.pages.CoursesPage;
import com.Roicians.pages.HomePage;


public class HomePageTest extends TestBase {
	
	HomePage homepage;
	AboutUsPage aboutuspage;
    CoursesPage coursespage;
    
    
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new HomePage();
		
	}
	
	@Test(priority=1)
	public void HomePageTitle() {
		String title = homepage.validateTitle();
		Assert.assertEquals(title, "Home - Roicians");
	}
	
	
	@Test(priority=3)
	public void ClickOnPhone() {
	   
		homepage.clickPhoneNumber();
	}
	
	@Test(priority=2)
	public void  ClickAboutUsPage() {
		
		aboutuspage = homepage.ClickonAboutUS();
		String title = homepage.validateTitle();
		Assert.assertEquals(title, "About Us - Roicians");
		
	}
	
	@Test(priority=4)
	public void RoiciansLogo() {
		boolean Flag = homepage.validateLogo();
		Assert.assertTrue(Flag);
		
	}
	@Test(priority=5)
	public void ValidateServicePageLink() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
	    homepage.ClickonServicePageLink();
	
		
		 //JavascriptExecutor js = (JavascriptExecutor) driver;
		  // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	@Test(priority=6)
	public void ValidateTrainingPageLink() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		
        homepage.ClickonTrainingPageLink();
		
	    
	}
	@AfterMethod
	public void teardown() {
	
		//driver.quit();
		
	}
	
}
