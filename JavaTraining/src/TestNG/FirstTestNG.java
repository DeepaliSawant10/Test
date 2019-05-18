package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
	 WebDriver driver;
 
	/* @Test 
	  public void FirstNG() throws InterruptedException {
	     driver.findElement(By.id("txtLoginid")).sendKeys("Deepali");
		 driver.findElement(By.name("txtpassword")).sendKeys("Deep");
		 driver.findElement(By.name("btnLogin")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 driver.findElement(By.id("txtLoginid")).clear();
		 driver.findElement(By.name("txtpassword")).clear();
		 Thread.sleep(2000);
		
		 
  }*/
 
	/*@Test
	  public void Second() throws InterruptedException {
		 driver.findElement(By.id("txtLoginid")).sendKeys("Deepali");
		 //driver.findElement(By.name("txtpassword")).sendKeys("Deep");
		 driver.findElement(By.name("btnLogin")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 
	 }*/
	 
	/* @Test
	 public void Third() {
	 driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
	 driver.findElement(By.id("txtName")).sendKeys("Deepali");
			driver.findElement(By.name("txtEmail")).sendKeys("Deepaliswnt13@gmail.com");
			driver.findElement(By.id("txtContact")).sendKeys("9167219953");
			Select myselect =new Select(driver.findElement(By.id("ddlSubject")));
			//myselect.selectByValue("Complaints");
			myselect.selectByVisibleText("Feedback");
			//myselect.selectByIndex(4);
			driver.findElement(By.xpath("//*[@id=\"txtMessage\"]")).sendKeys("Automated test");
			driver.findElement(By.name("btnSubmit")).click();
	 }
	 */
	 
	//actual vs expected results
	@Test
	public void Hover() throws InterruptedException
	{
		driver.get("https://techcanvass.com/index.aspx");
		Actions myAction= new Actions(driver);
		
		WebElement ele= driver.findElement(By.linkText("Domain Training"));
		//Thread.sleep(2000);
		myAction.moveToElement(ele).build().perform();
		//Thread.sleep(2000);
		 
		WebElement au= driver.findElement(By.linkText("Business Analyst + Domain courses"));
		//Thread.sleep(2000);
		myAction.moveToElement(au).build().perform();
		//Thread.sleep(2000);
		
		WebElement se= driver.findElement(By.linkText("BA Certification with Banking"));
		se.click();
		
		Thread.sleep(2000);
		String check= driver.getTitle();  
		Assert.assertEquals(check, "Business analyst training with Banking Domain");
		
		
	}
	 
	 @BeforeTest
      public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepali\\eclipse-workspace\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://lms.techcanvass.co.in/");
  }

     @AfterTest
      public void afterTest() {
    	 driver.close();
  }
     
   
     
     

}
