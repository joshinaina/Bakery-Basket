package basket;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class automate {
@Test
	
	public void auto() throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LittleMonkey\\Desktop\\software\\chromedriver_win32 (5)\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		
		 driver.manage().window().maximize();
		 

		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.get("http://bakerybasket.littlemonkey.info/");
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 

		 // for scroll down home page
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(6000,1200)");
		 
		// for click on blueberry muffins
		 
		 driver.findElement(By.className("portfolio-title")).click();
		 
		 //for clear quantity
		 
		 driver.findElement(By.id("AddProductForm_Form_Quantity")).clear();
		 
		 //put value
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.id("AddProductForm_Form_Quantity")).sendKeys("5");
		 
				
	Thread.sleep(3000);
		 driver.findElement(By.id("AddProductForm_Form_action_addtocart")).click();

		 // Tap on continue
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Continue Shopping")).click();
		 
		// for scroll down home page
		 
				 JavascriptExecutor jss=(JavascriptExecutor)driver;
				 
				 jss.executeScript("window.scrollBy(3000,1000)");
				 
				 
				 //for another order
				 
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 driver.findElement(By.xpath("//*[@id=\"Products\"]/div[1]/div[1]/a/img")).click();
				 
				 //for click Add to cart
				 
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driver.findElement(By.name("action btn")).click();
			    
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    
			    
			    		
				 
				 
				 
				 
				 
		 	 
		 
		 
}
}
	
	
 
		
	
	
	
	
	
	
	
	 
	 
		
		
	

