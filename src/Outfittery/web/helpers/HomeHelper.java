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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

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
	
	
	/*
	 * Test to click on customer login
	 * Then enter the loginid and password from sheet
	 * The case try to enter one login and one non login user
	 */

	@Test(priority=0)
		public  void customerlogin()  
		{
		driver.get(baseUrl);

		WebElement customerlogin = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a"));
		customerlogin.click();
		
		WebDriverWait wt=new WebDriverWait(driver, 5);
		 wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='login']/div/div/div/div[2]/div[2]/h4")));
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
	
	@Test(priority=1)
		
		public  void flagclick()
		{	
			WebElement flagicon = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/a/span[2]"));
			flagicon.click();
			
			WebElement c1 =driver.findElement(By.xpath("//*[@id='menu-23']"));
			place1=c1.getText();
				if(place1.contentEquals(d1)){System.out.println(place1);}
			WebElement c2 =driver.findElement(By.xpath("//*[@id='menu-172']"));
			place2=c2.getText();
				if(place2.contentEquals(d2)){System.out.println(place2);}
			WebElement c3 =driver.findElement(By.xpath("//*[@id='menu-285']"));
			place3=c3.getText();
				if(place3.contentEquals(d3)){System.out.println(place3);}
			WebElement c4 =driver.findElement(By.xpath("//*[@id='menu-397']"));
			place4=c4.getText();
				if(place4.contentEquals(d4)){System.out.println(place4);}
			WebElement c5 =driver.findElement(By.xpath("//*[@id='menu-500']"));
			place5=c5.getText();
				if(place5.contentEquals(d5)){System.out.println(place5);}
			WebElement c6 =driver.findElement(By.xpath("//*[@id='menu-1169']"));
			place6=c6.getText();
				if(place6.contentEquals(d6)){System.out.println(place6);}
			WebElement c7 =driver.findElement(By.xpath("//*[@id='menu-835']"));
			place7=c7.getText();
				if(place7.contentEquals(d7)){System.out.println(place7);}
			WebElement c8 =driver.findElement(By.xpath("//*[@id='menu-611']"));
			place8=c8.getText();
				if(place8.contentEquals(d8)){System.out.println(place8);}
			WebElement c9 =driver.findElement(By.xpath("//*[@id='menu-1271']"));
			place9=c9.getText();
				if(place9.contentEquals(d9)){System.out.println(place9);}
			
}

	@Test(priority=2)
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
		


		
@AfterTest
public void tearDown(){
	driver.quit();
}


}