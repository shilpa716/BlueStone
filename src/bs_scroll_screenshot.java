
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ScreenShot_Package.getScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bs_scroll_screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-notifications");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
								
			JavascriptExecutor js =(JavascriptExecutor)driver;
			WebElement why_bs = driver.findElement(By.xpath("//div[@class=\"page-home\"]/descendant::div[@class=\"bs-promises\"]/descendant::div[@class=\"title-main\"]"));
			js.executeScript("arguments[0].scrollIntoView", why_bs);
			Thread.sleep(1000);
			getScreenShot.Take_ScreenShot(driver, "why_bs");
			
			driver.findElement(By.xpath("class=\"logo-icon\"")).click();
			Thread.sleep(1000);
			getScreenShot.Take_ScreenShot(driver, "bs_logo");
			
			
	}
}
