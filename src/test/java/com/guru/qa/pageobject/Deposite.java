package com.guru.qa.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.qa.base.Testbase;

public class Deposite extends Testbase{

	
	@FindBy(linkText="Deposit")
	WebElement  depth;
	
	@FindBy(name="accountno")
	WebElement  acc;
	
	@FindBy(name="balance")
	WebElement  bala;
	
	@FindBy(name="desc")
	WebElement  disc;
	
	@FindBy(name="AccSubmit")
	WebElement  subb;
	
	public Deposite() {
		PageFactory.initElements(driver, this);
	}
	
	public void accno(String nsme) {
		depth.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		acc.sendKeys(nsme);
	}
	
	
	public void addbalance(String balance) {
		bala.sendKeys(balance);
	}
	public void discr(String diss) {
		disc.sendKeys(diss);
	}
	public void sumbit() {
		subb.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
