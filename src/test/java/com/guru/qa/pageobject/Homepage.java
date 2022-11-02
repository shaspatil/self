package com.guru.qa.pageobject;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.qa.base.Testbase;

public class Homepage extends Testbase{
	
	
	@FindBy(name="name")
	WebElement username;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender;
	
	@FindBy(name="dob")
	WebElement date;
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement town;
	
	@FindBy(name="state")
	WebElement statics;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement phone;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="password")
	WebElement passs;
	
	@FindBy(name="sub")
	WebElement submit;
	
	@FindBy(linkText="New Customer")
	WebElement abcd;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void sett() {
		
		abcd.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		username.sendKeys("basava");
		gender.click();
		date.sendKeys("05/02/2005");
		address.sendKeys("bangalore");
		town.sendKeys("bng");
		statics.sendKeys("utterpradesh");
		pin.sendKeys("123456");
		phone.sendKeys("987456321");
		
		String emai=random()+"@gmail.com";
		email.sendKeys(emai);
		
		passs.sendKeys("123");
		submit.click();
		
	}
	
	
	public String random() {
		
		String abcd=RandomStringUtils.randomAlphabetic(8);
		return abcd;
	}

}
