
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class bs_validation {
	
	WebDriver driver;
	 @BeforeMethod
	 public void preRequistite() {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.bluestone.com/");
	 }
	 
	 @Test
	 public void goldCoin(){
		 
	 //implicit time out 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	//Instantiate Action Class    
	Actions a = new Actions(driver);
	
	//Retrieve WebElement 'Gold Coins ' to perform mouse hover
	WebElement GoldCoin = driver.findElement(By.xpath("//li[@id='goldCoins']"));
			
	 //Mouse hover menuOption 
	a.moveToElement(GoldCoin).build().perform();
	System.out.println("Mouse hover on Gold coin menu");
	
	//xpath for 1 grms		
	driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();
	
	//https://www.bluestone.com/gold+coins/1-gram-24-kt-gold-coin~5920.html
	
	//Validation -Verify 1Gm Coin is displaying or not
	String actualResult = driver.getTitle();
	System.out.println("Page url :" +actualResult);
	
	//System.out.println("Page url " +actualResult);
	String expectedResult = "1 gram 24 KT Gold Coin";

	Assert.assertEquals(actualResult, expectedResult);
	System.out.println("validate");	
	
	}

	 @AfterMethod 
	 public void closeWindow() {
		 driver.close();
	 }
	 
}



