package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class topic1_check_enviroment {

	WebDriver driver; 
	String projectPath = System.getProperty("user.dir");
	String osPath = System.getProperty("os.name");
	
	@BeforeClass
	public void beforeClass() {
		if(osPath.contains("window")){
			System.setProperty("webdriver.chrome.driver",projectPath+"\\chromedriver_win32\\chromedriver.exe");
		} else {
			System.setProperty("webdriver.chrome.driver",projectPath + "/chromedriver_win32/chromedriver.exe");
		}
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void TC_01_Url() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@Test
	public void TC_02_Logo() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.fb_logo")).isDisplayed());
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	
	//update
	

}
