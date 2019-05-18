package com.javapractice.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class contactPage { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepali\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
			
			//get CSS property
			String size= driver.findElement(By.xpath("//*[@id=\'form1\']/table/tbody/tr/td/table/tbody/tr[2]/td/div/div/div/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/p[3]/a/b/u")).getCssValue("color");
			System.out.println(size);
			
			//wait
			WebDriverWait wait= new WebDriverWait(driver, 2);
			WebElement textlink;
			textlink= (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtName")));
			textlink.sendKeys("Deepali");
			textlink.click();
			
			//driver.findElement(By.id("txtName")).sendKeys("Deepali");
			driver.findElement(By.name("txtEmail")).sendKeys("Deepaliswnt13@gmail.com");
			driver.findElement(By.id("txtContact")).sendKeys("9167219953");
			Select myselect =new Select(driver.findElement(By.id("ddlSubject")));
			//myselect.selectByValue("Complaints");
			myselect.selectByVisibleText("Feedback");
			//myselect.selectByIndex(4);
			
			driver.findElement(By.xpath("//*[@id=\"txtMessage\"]")).sendKeys("Automated test");
			driver.findElement(By.name("btnSubmit")).click();
	}
	

}
