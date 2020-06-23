package com.Roicians.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Roicians.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	@FindBy(xpath="//li[@class='text-white']//preceding-sibling::li//a[contains(text(),'+1 (289) 499-4040')]")
	
	WebElement Phone;
	
	@FindBy(linkText = "info@roicians.com")
	WebElement header_link;

	
	@FindBy(xpath="//ul[@class='menuzord-menu menuzord-right menuzord-indented scrollable']//preceding-sibling::a//img")
	WebElement RoiciansLogo;
	
	@FindBy(xpath="//ul[@class='menuzord-menu menuzord-right menuzord-indented scrollable']//preceding-sibling::li//a[contains(text(),'About Us')]")
	WebElement AboutUSPage;
	
	@FindBy(linkText = "Courses")
	WebElement menubar_Courses;
	
	@FindBy(xpath = "//ul[@class='menuzord-menu menuzord-right menuzord-indented scrollable']//a[contains(text(),'Services')]")
	WebElement menubar_Services;
	
	@FindBy(linkText = "Careers")
	WebElement menubar_Careers;
	
	@FindBy(linkText = "Contact Us")
	WebElement menubar_Contact_Us;
	
	@FindBy(linkText = "Enquire Now")
	WebElement menubar_Enquire_Now;

	
	@FindBy(xpath="//h3[contains(text(),'Services')]//parent::div[@class='counter text-center']")
	WebElement ServicePageLink;
	
	@FindBy(xpath="//h3[contains(text(),'Training')]//parent::div[@class='counter text-center']")
	WebElement TrainingPageLink;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[2]/div[1]/div[1]/div[3]/a[1]/div[1]/div[2]")
	WebElement box_carrer;
	
	@FindBy(xpath = "//h3[contains(text(),'Events')]")
	WebElement box_event;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement footer_readmore;
	
	@FindBy(xpath = "//i[@class='fa fa-facebook']")
	WebElement footer_facebook;
	
	@FindBy(xpath = "//i[@class='fa fa-twitter']")
	WebElement footer_twitter;
	
	@FindBy(xpath = "////i[@class='fa fa-skype']")
	WebElement footer_Skype;
		
	@FindBy(xpath = "//i[@class='fa fa-google-plus']")	
	WebElement footer_googleplus;
		
	@FindBy(xpath = "//i[@class='fa fa-youtube']")	
	WebElement footer_youtube;
	
	@FindBy(xpath = "//input[@id='mce-EMAIL']")
	WebElement footer_email;
	
	@FindBy(xpath = "//i[@class='fa fa-paper-plane-o text-white']")
	WebElement footer_email_button;
	
	@FindBy(xpath = "//label[@class='display-block error']")
	WebElement footer_emailerror_lable;

	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		
		return RoiciansLogo.isDisplayed();
	}
	
	public void clickPhoneNumber() {
		
	
		Phone.click();
		driver.getWindowHandle();
	
		Alert alert = driver.switchTo().alert();
		System.out.println("text is   dsfsdf" + alert.getText());
		alert.accept();
	}

	
	
	public AboutUsPage ClickonAboutUS() {
		
		AboutUSPage.click();
		
		return new AboutUsPage();
		
	}
	
	public String ClickonServicePageLink() {
		
		ServicePageLink.click();
		
		return driver.getTitle();
		
	}
	
	public void ClickonTrainingPageLink() {
		
		TrainingPageLink.click();
		
		
	}
}
