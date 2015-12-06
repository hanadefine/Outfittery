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
	
	public By flag = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/a/span[2]");
	public By menu = By.xpath("//*[@id='menuLoggedIn']");
	public By edit = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/ul/li[3]/a");
	public By radio1 = By.xpath("//*[@id='profileEdit-section']/section/div/div[2]/form[1]/div/div[1]/label[1]/input");
	public By radio2 = By.xpath("//*[@id='profileEdit-section']/section/div/div[2]/form[1]/div/div[1]/label[2]/input");
	public By customerlogin = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a");
	public By email = By.name("j_username");
	public By password = By.name("j_password");
	public By submit = By.id("submit");
}
