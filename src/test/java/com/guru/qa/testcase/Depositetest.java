package com.guru.qa.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.guru.qa.base.Testbase;
import com.guru.qa.pageobject.Deposite;
import com.guru.qa.pageobject.loginpage;

public class Depositetest extends Testbase{
	
	
	
	@Test
	public void goforit() {
		loginpage lp=new loginpage();
		lp.eneteru(pro.getProperty("username"));
		lp.eneterp(pro.getProperty("password"));
 		lp.eneterc();
 		
 		Deposite dd=new Deposite();
 		
 		
 		dd.accno(pro.getProperty("accountnu"));
 		dd.addbalance("500");
 		dd.discr("scholarship");
 		dd.sumbit();
 		
 		
	}
	
	
	
	
	
	
	
	
	
	

}
