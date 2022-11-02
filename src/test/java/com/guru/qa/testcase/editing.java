package com.guru.qa.testcase;

import org.testng.annotations.Test;

import com.guru.qa.base.Testbase;
import com.guru.qa.pageobject.edit;
import com.guru.qa.pageobject.loginpage;

public class editing extends Testbase{

	
	
	@Test
	public void ggggg() {
		loginpage lp=new loginpage();
		lp.eneteru(pro.getProperty("username"));
		lp.eneterp(pro.getProperty("password"));
 		lp.eneterc();
 		edit hh=new edit();
 		hh.go();
	}
	
	
	
	
	
	
	
	
	
}
