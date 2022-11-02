package com.guru.qa.testcase;

import org.testng.annotations.Test;

import com.guru.qa.base.Testbase;
import com.guru.qa.pageobject.Homepage;
import com.guru.qa.pageobject.loginpage;

public class addingdetails extends Testbase{

	
	
	@Test
	public void deatils() {
		
		loginpage lp=new loginpage();
		lp.eneteru(pro.getProperty("username"));
		lp.eneterp(pro.getProperty("password"));
 		lp.eneterc();
 		
 		Homepage ab=new Homepage();
 		ab.sett();
 		
	}
	
}
