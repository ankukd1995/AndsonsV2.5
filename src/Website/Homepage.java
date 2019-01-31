package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homepage
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Homepage home = new Homepage();
	home.animation(driver);
	home.shop(driver);
		
	}
	
	public void animation(WebDriver driver) throws InterruptedException
	{
	 
		driver.get("https://andsons-dev.myshopify.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nxt-page-link js-nxtpage-link1']//img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='nxt-page-link js-nxtpage-link2']//img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='nxt-page-link js-nxtpage-link3']//img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='js-logo-link']//img")).click();
		Thread.sleep(2000);
		
	}
      
	 public void shop(WebDriver driver) throws InterruptedException
	{
	 // click on hamburguer menu
	  driver.findElement(By.xpath("//a[@class='js-burger']")).click();
	 Thread.sleep(2000);
	 // click on shop menu
	 driver.findElement(By.xpath("//a[@href='#'][contains(text(),'Shop')]")).click();
	 Thread.sleep(2000);
	 // Scrolling down the model
	  Actions a = new Actions(driver);
	  int i=0;
	  while(i<6)
	  {
	  a.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(1000);
	  i++;
	  } 
	  
	 
	 //Scrolling up the model
	  Actions b = new Actions(driver); 
	  int j=0;
	  while(j<4)
	  {
		b.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		j++;
	 }
		
	  // Adding the product into the card(Signature)
	  // Adding 12-signature
	  driver.findElement(By.xpath("//input[@id='plus']")).click();
	  driver.findElement(By.xpath("//input[@value='add to cart']")).click();
	  Thread.sleep(3000);
	// Adding 36-signature
	  driver.findElement(By.xpath("//label[@for='variant-15409286250530']")).click();
	  driver.findElement(By.xpath("//input[@id='plus']")).click();
	  driver.findElement(By.xpath("//input[@value='add to cart']")).click();
	  Thread.sleep(3000); 
	// Adding the product into the card(Holiday)
	  // Adding 54-holiday
	  driver.findElement(By.xpath("//label[@for='variant-15409286283298']")).click();
	  driver.findElement(By.xpath("//label[contains(text(),'Holiday Box')]")).click();
	  driver.findElement(By.xpath("//input[@value='add to cart']")).click();
	  Thread.sleep(3000); 
	  //Adding 84-holiday
	  //driver.findElement(By.xpath("//label[@for='variant-15409286316066']")).click();
	  //driver.findElement(By.xpath("//input[@value='add to cart']")).click();
	  //Thread.sleep(3000); 
		 
	  // Closing the shop model
	  
	  Actions c = new Actions(driver);
	  int k=0;
	  while(k<4)
	  {
	  a.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(1000);
	  k++;
	    } 
	  
	  driver.findElement(By.xpath("//span[@class='monogran-outter']//img")).click();
	  
	}
}




