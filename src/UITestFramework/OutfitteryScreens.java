package UITestFramework;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OutfitteryScreens {
	



		
		WebDriver driver = null;
		public OutfitteryScreens(WebDriver driver) {
			this.driver = driver;
			// TODO Auto-generated constructor stub
		}

		
		
		public final int timeOut = 10;
		
		/**
		 *  method to wait for an element to be visible
		 * @param targetElement element to be visible
		 * @return true if element is visible else throws TimeoutException
		 * @throws TimeoutException 
		 */
		public boolean waitForVisibility(By targetElement) throws TimeoutException {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOfElementLocated(targetElement));
			return true;
		}
		

		public WebElement findElement(By locator){
			try {
				WebElement element = driver.findElement(locator);
				return element;
			}
			catch (NoSuchElementException e){
				System.out.println(this.getClass().getName() +"findElement Element not found" + locator);
				throw new NoSuchElementException(e.getMessage());
			}
		}

	}

