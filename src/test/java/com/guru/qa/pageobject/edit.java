package com.guru.qa.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.qa.base.Testbase;

public class edit extends Testbase{

	@FindBy(linkText="Edit Customer")
	WebElement  edit;
	
	@FindBy(name="cusid")
	WebElement  customer;
	
	@FindBy(name="AccSubmit")
	WebElement  sub;
	
	@FindBy(name="addr")
	WebElement  addres;
	
	@FindBy(name="city")
	WebElement  cccttt;
	
	@FindBy(name="sub")
	WebElement  next;
	
	public edit() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void go() {
		edit.click();
		
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		customer.sendKeys(pro.getProperty("customerid"));
		sub.click();
		addres.clear();
		addres.sendKeys("kardyal gurkul");
		cccttt.clear();
		cccttt.sendKeys("mysore");
		next.click();
		driver.switchTo().alert().accept();
	}
	
	
	
	
	
}
