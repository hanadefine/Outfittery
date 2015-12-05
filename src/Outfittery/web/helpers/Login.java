package Outfittery.web.helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class Login {
	
	WebElement customerlogin = driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a"));
	customerlogin.click();

}
