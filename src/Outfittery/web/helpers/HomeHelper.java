package Outfittery.web.helpers;

import org.junit.Assert; 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import Outfittery.web.screens.HomePage;

public class HomeHelper extends HomePage{
static WebDriver driver = new FirefoxDriver();
HomePage hp;
String baseUrl = "https://www.outfittery.com/"; 
String expectedurl="https://www.outfittery.com/login/auth";
String currenturl;


	public HomeHelper() 
	{
	// TODO Auto-generated constructor stub
	super(driver);
    hp = new HomePage(driver);
	}
	/*
	 * Test to click on customer login
	 * Then enter the loginid and password from sheet
	 * The case try to enter one login and one non login user
	 */


@Test
	public  void homelinks()  throws InterruptedException
	{
	driver.get(baseUrl);

	WebElement customerlogin = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a"));
		customerlogin.click();
		Thread.sleep(10000);
		
		 currenturl=driver.getCurrentUrl();
		if(currenturl.contentEquals(expectedurl))
		{
		System.out.println("Customer login page appeared");
		driver.navigate().back();
		}
		else {
			System.out.println("Actual" +currenturl+ " Expected is  " +expectedurl);
			
		}
		
		
	
}

@AfterTest
public void tearDown(){
	driver.quit();
}


}