package ScreenShot_Package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class getScreenShot {
	public static void Take_ScreenShot(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File path_screenshot = new File("./ScreenShots/"+name+".png");
		Files.copy(screenshot, path_screenshot);
	}
}
