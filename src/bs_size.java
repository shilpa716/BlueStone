


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bs_size {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);

		// To find AllJewellery Path
		WebElement all_jewel = driver.findElement(By.xpath("//li[@class=\"menuparent\"]"));
		Thread.sleep(2000);

		// To Perform mouseoveraction on the AllJewellery Menu
		Actions a = new Actions(driver);
		a.moveToElement(all_jewel).perform();

		// To click on "Kadas" and click on first kada
		driver.findElement(By.xpath("//span[@data-p=\"mens-jewellery-kadas,m\"]")).click();
		driver.findElement(By.id("pid_5675")).click();
		Thread.sleep(3000);

		// To select size dropdown menu and select the kada size
		driver.findElement(By.xpath("//span[@class=\"size-box-overlay\"]")).click();
		driver.findElement(By.xpath("//li[@data-key=\"02\"]")).click();
		Thread.sleep(1000);

		// To buy the kada 
		driver.findElement(By.id("buy-now")).click();
		Thread.sleep(500);

	}

}
