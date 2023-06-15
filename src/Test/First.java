package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public First() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "G:\\Chrome_Driver\\chromedriver_win32(1)\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.navigate().to("https://anhtester.com");

	        //3 - Lấy Title và in ra console
	        
	      System.out.println(driver.getTitle());
	      
	      

	}

}
