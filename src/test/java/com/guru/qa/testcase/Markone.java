package com.guru.qa.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru.qa.base.Testbase;
import com.guru.qa.pageobject.loginpage;
import com.guru.qa.utility.XLUtils;

public class Markone extends Testbase{

	@Test
	public void goon() throws InterruptedException {
		loginpage lp=new loginpage();
		lp.eneteru(pro.getProperty("username"));
		lp.eneterp(pro.getProperty("password"));
		lp.eneterc();
		
		if(isalertpresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		else {
			String ab=driver.getTitle();
			System.out.println(ab);
			driver.findElement(By.linkText("Log out")).click();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
		}
		
	}
	public boolean isalertpresent() {
		try {
			
		driver.switchTo().alert();
		return true;
				
		}catch(Exception e){
			return false;
		}
		
	}
	
	
	
}
