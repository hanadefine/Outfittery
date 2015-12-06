package Outfittery.web.helpers;


import org.junit.Assert; 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;





import Outfittery.web.screens.HomePage;

public class HomeHelper extends HomePage{
static WebDriver driver = new FirefoxDriver();

HomePage hp;
HomeHelper hh;
String baseUrl = "https://www.outfittery.com/"; 
String expectedurl="https://www.outfittery.com/login/auth";
String currenturl;
String place1;
String place2;
String place3;
String place4;
String place5;
String place6;
String place7;
String place8;
String place9;
String d1="Deutschland";
String d2="Nederland";
String d3="Sverige";
String d4="Danmark";
String d5="International";
String d6="België";
String d7="Schweiz";
String d8="Österreich";
String d9="Luxemburg";

	public HomeHelper() 
	{
	// TODO Auto-generated constructor stub
	super(driver);
    hp = new HomePage(driver);
    driver.get(baseUrl);
  
	}
	
	

	@Test(priority=0)
	public  void profile() throws InterruptedException  
	{
	login();
//	WebDriverWait wt=new WebDriverWait(driver, 30);
//	 wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='menuLoggedIn']")));
	 Thread.sleep(10000);
	
		WebElement menu = driver.findElement(By.xpath("//*[@id='menuLoggedIn']"));
		menu.click();
	
		WebElement edit = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/ul/li[3]/a"));
		edit.click();
	/*
	 * Test to toggle the Radio button for Mr and Ms	
	 */
		WebElement radio1 = driver.findElement(By.xpath("//*[@id='profileEdit-section']/section/div/div[2]/form[1]/div/div[1]/label[1]/input"));
		WebElement radio2 = driver.findElement(By.xpath("//*[@id='profileEdit-section']/section/div/div[2]/form[1]/div/div[1]/label[2]/input"));
		boolean b = false;
		b= radio1.isSelected();
		if(b=true){  radio2.click(); }
		
		else { radio2.click(); }
		 
		/*
		 * Test to check the clothing sized from drop down menus
		 */	
		WebElement ht = driver.findElement(By.xpath("//*[@id='heightInCm']"));
		int i= (int) (Math.random()*69);
        Select selectByValue = new Select(driver.findElement(By.id("heightInCm")));
        selectByValue.selectByIndex(i);
        
    Thread.sleep(5000);
//69
    
	
	
	}

	/*
	 * 1. Test to check the functionality of customer login and Lets go button on Home.
	 * 2. Check if the customer login page appears by Matching the current url with actual url.
	 * 3. Re-turns on Home and click on Lets go button 
	 */
	
//
//	@Test(priority=1)
//		public  void customerlogin()  
//		{
//		
//
//		WebElement customerlogin = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a"));
//		customerlogin.click();
//		
//		WebDriverWait wt=new WebDriverWait(driver, 5);
//		 wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='login']/div/div/div/div[2]/div[2]/h4")));
//		 currenturl=driver.getCurrentUrl();
//		if(currenturl.contentEquals(expectedurl))
//		{
//		System.out.println("Customer login page appeared");
//		driver.navigate().back();
//		}
//		else {
//			System.out.println("Actual" +currenturl+ " Expected is  " +expectedurl);
//			
//		}
//	WebElement letsgo = driver.findElement(By.partialLinkText("LET'S GO!"));
//	letsgo.click();
//	}
//	
//	@Test(priority=2)
//		
//		public  void flagclick()
//		{	
//			WebElement flagicon = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/a/span[2]"));
//			flagicon.click();
//			
//			WebElement c1 =driver.findElement(By.xpath("//*[@id='menu-23']"));
//			place1=c1.getText();
//				if(place1.contentEquals(d1)){System.out.println(place1);}
//			WebElement c2 =driver.findElement(By.xpath("//*[@id='menu-172']"));
//			place2=c2.getText();
//				if(place2.contentEquals(d2)){System.out.println(place2);}
//			WebElement c3 =driver.findElement(By.xpath("//*[@id='menu-285']"));
//			place3=c3.getText();
//				if(place3.contentEquals(d3)){System.out.println(place3);}
//			WebElement c4 =driver.findElement(By.xpath("//*[@id='menu-397']"));
//			place4=c4.getText();
//				if(place4.contentEquals(d4)){System.out.println(place4);}
//			WebElement c5 =driver.findElement(By.xpath("//*[@id='menu-500']"));
//			place5=c5.getText();
//				if(place5.contentEquals(d5)){System.out.println(place5);}
//			WebElement c6 =driver.findElement(By.xpath("//*[@id='menu-1169']"));
//			place6=c6.getText();
//				if(place6.contentEquals(d6)){System.out.println(place6);}
//			WebElement c7 =driver.findElement(By.xpath("//*[@id='menu-835']"));
//			place7=c7.getText();
//				if(place7.contentEquals(d7)){System.out.println(place7);}
//			WebElement c8 =driver.findElement(By.xpath("//*[@id='menu-611']"));
//			place8=c8.getText();
//				if(place8.contentEquals(d8)){System.out.println(place8);}
//			WebElement c9 =driver.findElement(By.xpath("//*[@id='menu-1271']"));
//			place9=c9.getText();
//				if(place9.contentEquals(d9)){System.out.println(place9);}
//			
//}
//
//	
//		
	/*
	 * Login method to help other method call login functionality directly
	 */

	public  void login()  
	{
		WebElement customerlogin = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a"));
		customerlogin.click();
		WebElement email = driver.findElement(By.name("j_username"));
		email.sendKeys("hanank1784@gmail.com");
		WebElement password = driver.findElement(By.name("j_password"));
		password.sendKeys("outfit");
		WebElement loginbutton = driver.findElement(By.id("submit"));
		loginbutton.click();
	
		
		
		
		
	}
//		
//@AfterTest
//public void tearDown(){
//	driver.quit();
//}


}