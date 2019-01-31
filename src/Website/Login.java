package Website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public final class Login {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Login log = new Login();
		log.account(driver);
		log.profile(driver);
		log.storedcaed(driver);
		log.ordehistory(driver);
		log.addressbook(driver);

	}

	public void account(WebDriver driver) throws InterruptedException
	{
		driver.get("https://andsons-dev.myshopify.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='js-burger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		
		/*
		// Checking the forgot password functionality
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RecoverEmail']")).sendKeys("oabtest@cemtrexlabs.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'send email')]")).click();
		Thread.sleep(7000);
		*/
		
		// Login 
		
		driver.findElement(By.xpath("//input[@id='CustomerEmail']")).sendKeys("anuptest@mailinator.com");
		driver.findElement(By.xpath("//input[@id='CustomerPassword']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='sign in']")).click();
		Thread.sleep(3000);		
				
	}
	
	public void profile(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//span[contains(text(),'Profile')]")).click();
		Thread.sleep(3000);	
		
		//Updating the name
		driver.findElement(By.xpath("//a[@href='https://andsons-dev.myshopify.com/pages/edit-name']")).click();
		Thread.sleep(1500);	
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();
		driver.findElement(By.xpath("//input[@id='last_name']")).clear();
		Thread.sleep(1500);	
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Andrew");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Kelly");
		driver.findElement(By.xpath("//button[@value='update name']")).click();
		Thread.sleep(2500);	
		
		// password
		driver.findElement(By.xpath("//a[@href='https://andsons-dev.myshopify.com/pages/edit-password']")).click();
		Thread.sleep(2500);	
		driver.findElement(By.xpath("//a[contains(text(),'Back to profile')]")).click();
		Thread.sleep(2500);
		
		// Updating the mobile Number
		
		driver.findElement(By.xpath("//a[@href='https://andsons-dev.myshopify.com/pages/edit-phone']")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).clear();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("4343433568");
		driver.findElement(By.xpath("//button[@value='update phone number']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[@class='action-control flex-row-reverse flex-md-row']//a")).click();
		Thread.sleep(2500);
		
	}
	
	public void storedcaed(WebDriver driver) throws InterruptedException
	
	{
		driver.findElement(By.xpath("//span[contains(text(),'stored cards')]")).click();
		Thread.sleep(2500);
		// Adding the new card
		driver.findElement(By.xpath("//a[contains(text(),'add a new credit card')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("38520000023237");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("12343");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='add address']")).click();
		Thread.sleep(4000);
		// Deleting the added card
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'stored-info-wrap card-info')]//div[4]//div[2]//a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='delete-card']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'action-control mt-3')]//a[1]")).click();
		Thread.sleep(1500);
	}
	 
	public void ordehistory(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//span[contains(text(),'order history')]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//tbody//tr[1]//td[1]")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='action-control mt-4']//a[@href='javascript:void(0)']")).click();
		Thread.sleep(2000);
		Actions b = new Actions(driver);
		int i=0;
		while(i<2)
		
		{
			b.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			i++;
		}		
 
		driver.findElement(By.xpath("//div[@class='action-control mt-4']//a")).click();
		Thread.sleep(2000);
		
	}
	
	public void addressbook(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[contains(text(),'address book')]")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//a[@class='link-btn address-new-toggle']")).click();
		Thread.sleep(3000);
		// Adding new address
		
		driver.findElement(By.xpath("//input[@id='AddressFirstNameNew']")).sendKeys("ankush");
		driver.findElement(By.xpath("//input[@id='AddressLastNameNew']")).sendKeys("pawar");
		driver.findElement(By.id("AddressCompanyNew")).sendKeys("Cemtrexlabs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='AddressAddress1New']")).sendKeys("35th Street");
		driver.findElement(By.xpath("//input[@id='AddressAddress2New']")).sendKeys("08977");
		driver.findElement(By.xpath("//input[@id='AddressCityNew']")).sendKeys("Gobles");
		Select b = new Select(driver.findElement(By.xpath("//select[@id='AddressCountryNew']")));
		b.selectByVisibleText("MI");
		Thread.sleep(2000);
		driver.findElement(By.id("AddressZipNew")).sendKeys("49055");
		// Selecting the address type
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'row no-gutters')]//div[2]//div[1]//label[1]//span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@value,'add address')]")).click();
		Thread.sleep(3000);
		Actions c = new Actions(driver);
		c.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'stored-info-wrap')]//div[7]//div[2]//a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirm-modal_7\"]/div/div/div[4]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='action-control mt-3']//a[1]")).click();
		Thread.sleep(2000);
		// Logout
		driver.findElement(By.xpath("//span[contains(text(),'log out')]")).click();
	}
	
	
}
