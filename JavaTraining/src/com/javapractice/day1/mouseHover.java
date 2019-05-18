package com.javapractice.day1;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepali\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://techcanvass.com/index.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
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
		driver.close();
		
	} 

}
