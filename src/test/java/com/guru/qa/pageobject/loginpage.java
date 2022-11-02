package com.guru.qa.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru.qa.base.Testbase;

public class loginpage extends Testbase {

	
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="btnLogin")
	WebElement cc;

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")
	WebElement xpaa;
	
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void eneteru(String name) {
		username.sendKeys(name);
	}
	
	public void eneterp(String code) {
		pass.sendKeys(code);
	}
		public void eneterc() {
		cc.click();
		}
		public void eneterxx() {
			xpaa.getText();
			
			}
		
	}
	
	
