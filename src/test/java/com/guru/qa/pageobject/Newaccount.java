package com.guru.qa.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.guru.qa.base.Testbase;

public class Newaccount extends Testbase{

	@FindBy(linkText="New Account")
	WebElement  text;
	
	@FindBy(name="cusid")
	WebElement  cuastomerid;
	
	@FindBy(name="selaccount")
	WebElement  selecting;
	
	@FindBy(name="inideposit")
	WebElement  deposite;
	
	@FindBy(name="button2")
	WebElement  button;
	
	public Newaccount() {
		PageFactory.initElements(driver, this);
	}
	
	public void newacc() {
		
		text.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		cuastomerid.sendKeys(pro.getProperty("customerid"));
		
		Select sel=new Select(selecting);
		sel.selectByIndex(1);
		
		deposite.sendKeys("1000");
		button.click();
		
	}
	
	
}
