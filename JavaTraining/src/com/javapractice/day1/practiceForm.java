package com.javapractice.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepali\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.adrosonic.com/career/apply.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Deepali");
		driver.findElement(By.id("email")).sendKeys("Deepaliswnt13@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9167219953");
		driver.findElement(By.id("relexp")).sendKeys("3");
		driver.findElement(By.id("experience")).sendKeys("3");
		driver.findElement(By.id("cemployer")).sendKeys("Creintech");
		driver.findElement(By.id("cdesignation")).sendKeys("Junior Software Tester");
		driver.findElement(By.id("education")).sendKeys("B.E IT");
		driver.findElement(By.id("plocation")).sendKeys("Mumbai");
		driver.findElement(By.name("my_file")).sendKeys("C:\\Users\\Deepali\\Desktop\\Deepali.docx");
	}

}
