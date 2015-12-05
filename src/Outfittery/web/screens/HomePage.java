package Outfittery.web.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UITestFramework.OutfitteryScreens;

public class HomePage extends OutfitteryScreens  {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	
	
	By flag = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/a/span[2]");
}
