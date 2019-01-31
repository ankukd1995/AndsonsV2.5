package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Checkout
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Checkout check = new Checkout();
		check.shippingaddress(driver); 
	   
	}
 
	 public void shippingaddress(WebDriver driver) throws InterruptedException
	
	{ 
		 // Shopping cart page
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='buybtn-outter']//img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='table-body']//div[1]//div[1]//div[1]//div[1]//a[1]")).click();
		Thread.sleep(2000);
		
		// Edit pop up
		driver.findElement(By.xpath("//div[contains(@class,'custom-wrapper')]//div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='plus']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'update cart')]")).click();
		Thread.sleep(3000);
		
		// Scrolling down the shopping page
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
		
		// Filling the shipping address
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("ankush");		
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("pawar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ankush_test@mailinator.com");
		 
		// Filling shipping info
		driver.findElement(By.xpath("//input[@id='sfirstname']")).sendKeys("ankush");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='slastname']")).sendKeys("pawar");
		driver.findElement(By.id("company")).sendKeys("Cemtrexlabs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("6666 U.S. 1");
		driver.findElement(By.xpath("//input[@id='street_number']")).sendKeys("Viman nagar, giga space");
		driver.findElement(By.xpath("//input[@id='locality']")).sendKeys("Port St. Lucie");
		Select b = new Select(driver.findElement(By.xpath("//select[@id='administrative_area_level_1']")));
		b.selectByVisibleText("FL");
		driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("34952");
		// Selecting the address type
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'row no-gutters')]//div[1]//div[1]//label[1]//span[1]")).click();
		Thread.sleep(2000);
		// Clciking on the delivery date
		driver.findElement(By.id("ContinueToShipping")).click();
		Thread.sleep(6000);
					
	}
	

	public void deliverydate(WebDriver driver) throws InterruptedException
	{					
		Thread.sleep(4000);
		Actions e = new Actions(driver);
		e.sendKeys(Keys.PAGE_DOWN).build().perform();
		// Selecting the date from the calender
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='js-select-delivery-date']")).click();
		Thread.sleep(4000);
		// Selecting the date
		driver.findElement(By.xpath("//td[@class='day'][contains(text(),'29')]")).click();
		Thread.sleep(6000);
		Actions b = new Actions(driver);
		int j=0;
		while(j<2)
		{
			b.sendKeys(Keys.PAGE_DOWN).build().perform();
			j++;
		}
		
		// Selecting the shipping service
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='checkout-flow pb-0']//div[@id='0']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='js-select-shipping-option-datepicker']")).click();
		Thread.sleep(2000);
		Actions c = new Actions(driver);
		c.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.id("ContinueToPay")).click();
		Thread.sleep(3000);
	}
	
	public void payment(WebDriver driver) throws InterruptedException 
	{
		
		Actions d = new Actions(driver);
		int k=0;
		while(k<2)
		{
			d.sendKeys(Keys.PAGE_DOWN).build().perform();
			k++;
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("ReviewOrder")).click();
		Thread.sleep(4000);
			
	}
	

	public void reviewpage(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		// Scrolling down the page
		Actions F = new Actions(driver);
		int k=0;
		while(k<2)
		{
			F.sendKeys(Keys.PAGE_DOWN).build().perform();
			k++;
			Thread.sleep(1000);
		}
	
		// Entering the gift message
		driver.findElement(By.xpath("//label[@class='checkContainer w-100']//span[@class='checkmark']")).click();
		driver.findElement(By.xpath("//textarea[@id='message_1']")).sendKeys("of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		driver.findElement(By.xpath("//a[@id='savemsg_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("complete_order")).click();
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector("#shopify-section-app_header > header > div > div.logo-outter > a > img")).click();
		
	}
}
