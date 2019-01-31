package Website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalTestRun { 
  
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Calling homepage class 
		Homepage home = new Homepage();
		home.animation(driver);
		home.shop(driver);
		 
		//Calling models
		Models mode = new Models();
		mode.about(driver);
		mode.contactus(driver);
		
		// Calling checkout process
		Checkout checked = new Checkout();
		checked.shippingaddress(driver);
		checked.deliverydate(driver);
		checked.payment(driver);
		checked.reviewpage(driver); 
		
		// Closing the driver
		driver.close();
	}

}
