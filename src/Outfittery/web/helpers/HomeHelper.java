package Outfittery.web.helpers;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Outfittery.web.screens.HomePage;

public class HomeHelper extends HomePage{
static WebDriver driver = new FirefoxDriver();
HomePage hp;
String baseUrl = "https://www.outfittery.com/";   


	public HomeHelper() 
	{
	// TODO Auto-generated constructor stub
	super(driver);
    hp = new HomePage(driver);
	}


@Test
	public  void login()  throws InterruptedException
	{
	driver.get(baseUrl);
	WebElement customerlogin = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a"));
		customerlogin.click();
		Thread.sleep(10000);
 
	
}

@AfterTest
public void tearDown(){
	driver.quit();
}


}