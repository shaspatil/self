package com.guru.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public Properties pro;
	
	
	
	public String browser="chrome";
	public static WebDriver driver;
	
	public static Logger logger;
	
	public Testbase() {
		
		 pro=new Properties();
		FileInputStream lp;
		try {
			lp = new FileInputStream("C:\\Users\\shash\\eclipse-workspace\\self\\src\\test\\java\\com\\guru\\config\\config.properties");
			pro.load(lp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@BeforeClass
	public  void initialwebdriver() {
		
		if (browser.equals(pro.getProperty("browser"))) {
		WebDriverManager.chromedriver().setup();
		
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		}else {
			System.out.println("not correct one");
		}
		
		 logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		driver.get(pro.getProperty("url"));
			
	}
	
	@AfterClass
	public  void teardown() {
		driver.quit();
	}

}
