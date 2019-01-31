package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Models 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Models model = new Models();
		model.about(driver);
		model.contactus(driver);
	}
   public void about(WebDriver driver) throws InterruptedException
	
	{  
	   // Need to comment when run a single test
	   // driver.get("https://andsons-dev.myshopify.com/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
	 // click on the hamburger
		driver.findElement(By.xpath("//a[@class='js-burger']")).click();
		Thread.sleep(2000);
		// Click on the about
		driver.findElement(By.xpath("//a[contains(text(),'About Us / FAQ')]")).click();
		Thread.sleep(2000);
		// Scrolling down the page
		 Actions a = new Actions(driver);
		  int i=0;
		  while(i<6)
		  {
		  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		  Thread.sleep(2000);
		  i++;
		  } 
		// Clicking on the FAQ
		 driver.findElement(By.xpath("//div[@id='accor2']//button[@class='btn btn-link collapsed']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[contains(text(),'Can I buy your products locally?')]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@id='accor4']//button[@class='btn btn-link collapsed']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@id='accor5']//button[@class='btn btn-link collapsed']")).click();
		 Thread.sleep(1000);
		 
		 // Scrolling at the top of the model
		 Actions b = new Actions(driver); 
		  int j=0; 
		  while(j<7)
		  {
			b.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(2000);
			j++;
		 }
			
		// Closing the model
		  driver.findElement(By.xpath("//div[@class='modal-header d-none d-md-block']//img")).click();
		 
	}
   
   public void contactus(WebDriver driver) throws InterruptedException
   {
	        //click on the hamburger
		   Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='js-burger']")).click();
			Thread.sleep(2000);
			 // Click on the Contact
			driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
			Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[@id='contact_fname']")).sendKeys("Ankush");
			  driver.findElement(By.xpath("//input[@id='contact_lname']")).sendKeys("Pawar"); 
			  driver.findElement(By.xpath("//input[@id='contact_email']")).sendKeys("ankush@gmail.com");
			  Thread.sleep(2000); 
			  Select a = new  Select(driver.findElement(By.xpath("//select[@id='contact_reason']")));
			  a.selectByVisibleText("Press");
			  driver.findElement(By.xpath("//textarea[@id='contact_message']")).sendKeys("This is for the test"); 
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[contains(text(),'send message')]")).click(); 
			  Thread.sleep(6000);
			  driver.findElement(By.xpath("//*[@id=\"thankuModal\"]/div/div/div/div/button")).click();
			
   }
   
}
