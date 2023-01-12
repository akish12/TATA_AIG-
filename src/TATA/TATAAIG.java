package TATA;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TATAAIG {

	public static void main(String[] args) {
		
		//driver.get("https://www.google.com/");
		
		
	//	@Test
		//public void Flipkart()
		{
	      //  WebDriverManager.chromedriver().setup();

			System.setProperty("webdriver.chrome.driver","C:/Users/Akash/OneDrive/Desktop/Seleniumsetup/new selenium/chromedriver.exe");
		//	WebDriver driver=new ChromeDriver();

		WebDriver driver= new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title="REDMI 9i Sport ";
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Redmi mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='_3uDYxP']/child::select[@class='_2YxCDZ']"));
		dropdown.click();
		Select s= new Select(dropdown);
		s.selectByIndex(1);
		driver.findElement(By.xpath("//div[@class='_4rR01T' and text()='REDMI 9i Sport (Coral Green, 64 GB)']")).click();
		Set<String> set = driver.getWindowHandles();
	        Iterator<String> it = set.iterator();

	        while (it.hasNext()) {
		          String wID = it.next();
		          driver.switchTo().window(wID);
		          String currentWindowTitle = driver.getTitle();
		          if(currentWindowTitle.contains(title)) {
		        	  break;
		          }
	    	}
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	       driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	       driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("7974387903");
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
	       driver.close();
	}
		
		

	}

}