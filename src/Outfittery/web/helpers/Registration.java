//package Outfittery.web.helpers;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.*;
//
//import Outfittery.web.helpers.HomeHelper;
//import Outfittery.web.screens.HomePage;
//public class Registration {
//	
//	String baseUrl = "https://www.outfittery.com/"; 
//	static WebDriver driver = new FirefoxDriver();
//	public HomeHelper homehelper;
//	public Registration() 
//	{
//	// TODO Auto-generated constructor stub
//	//super();
//   // hp = new LoginselectOutfit(driver);
//    driver.get(baseUrl);
//    homehelper = new HomeHelper();
//  
//	}
//	@Test
//	public  void registrationFlow()  
//	{
//		WebElement customerlogin = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a"));
//		customerlogin.click();
//		WebElement reg = driver.findElement(By.xpath("//*[@id='login']/div/div/div/div[2]/div[2]/p[2]"));
//		reg.click();
//		
//		
//
//	}
//
////	@AfterTest
////	public void tearDown(){
////		driver.quit();
////	}
//}