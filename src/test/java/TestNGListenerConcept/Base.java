package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization(){
		System.setProperty("webdriver.chrome.driver", "D:\\Sami\\Selenium Setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	public void failed(String testMethodName) {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("D:\\Sami\\Selenium workpace\\TestNGListener\\Screenshots\\"+testMethodName+"_"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
