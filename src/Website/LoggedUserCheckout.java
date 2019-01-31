package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoggedUserCheckout {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Homepage home = new Homepage();
		home.animation(driver);
		home.shop(driver);
		
		//  Shopping cart page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='buybtn-outter']//img")).click();
		Thread.sleep(4000);
		
		// Scrolling on the shop page
		
		Actions a = new Actions(driver);
		int i=0;
		while(i<2)
		{
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
			i++;
		}
		
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("[class='link-btn']")).click();
		 Thread.sleep(2000);
		 
		 //Logging the user
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='CustomerEmail']")).sendKeys("anuptest@mailinator.com");
		 driver.findElement(By.xpath("//input[@id='CustomerPassword']")).sendKeys("123456");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='sign in']")).click();
		 Thread.sleep(3000);
		 
		 
		 // Selecting the saved address
		 driver.findElement(By.xpath("//div[contains(@class,'selct-date-box mb-3')]//div[1]//div[1]//div[1]//label[1]//span[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='ContinueToShipping']")).click();
		 Thread.sleep(7000);
		 
		 // Selecting the delivery date
		 
		 driver.findElement(By.xpath("//label[@class='rdoContainer']//span[@class='checkmark']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='ContinueToPay']")).click();
		 Thread.sleep(4000);
		  
		 // Selecting the payment method
		 
		 
		 driver.findElement(By.xpath("//div[@id='5']//span[@class='checkmark']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		 Thread.sleep(4000);
		 
		 // Completing the order
		 Actions b = new Actions(driver);
		 int c=0;
		 while(c<4)
		 {
			 b.sendKeys(Keys.PAGE_DOWN).build().perform();
			 c++;
		 }
		 
		 driver.findElement(By.xpath("//button[@id='complete_order']")).click();
		 
		 
		 
		 
	}

	
	
}
