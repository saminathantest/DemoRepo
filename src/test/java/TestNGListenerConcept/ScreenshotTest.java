package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base{
	
	@BeforeMethod
	public void setUP() {
		initialization();
	}
	
	@AfterMethod
	public void driverquit() {
		driver.quit();
	}
	
	@Test
	public void loginTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void searchTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void createContact() {
		Assert.assertEquals(false, true);
	}
	
	
}
