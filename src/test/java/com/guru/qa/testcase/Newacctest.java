package com.guru.qa.testcase;

import org.testng.annotations.Test;

import com.guru.qa.base.Testbase;
import com.guru.qa.pageobject.Newaccount;
import com.guru.qa.pageobject.loginpage;

public class Newacctest extends Testbase{

	
	
	@Test
	public void nnn() {
		loginpage lp=new loginpage();
		lp.eneteru(pro.getProperty("username"));
		lp.eneterp(pro.getProperty("password"));
 		lp.eneterc();
 		
 		Newaccount nm=new Newaccount();
 		nm.newacc();
 		
	}
	
	
	
	
	
}
