package com.javapractice.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepali\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("http://lms.techcanvass.co.in/");
			driver.findElement(By.id("txtLoginid")).sendKeys("Deepali");
			driver.findElement(By.name("txtpassword")).sendKeys("Deep");
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.findElement(By.id("txtLoginid")).clear();
			driver.findElement(By.name("txtpassword")).clear();
	}

}
