package com.javapractice.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepali\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("http://demo.guru99.com/test/upload/");
			driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Deepali\\Pictures\\Screenshots\\B9.png");
	}

}
