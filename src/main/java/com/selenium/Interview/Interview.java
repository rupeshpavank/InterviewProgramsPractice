package com.selenium.Interview;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interview {

	public static void main(String[] args) throws IOException, ClassNotFoundException 	 {
		
		WebDriver driver=new ChromeDriver();
		
		RemoteWebDriver driver1=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById(‘Login').value=Test text without sendkeys");
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	


		 Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);
			       
		 
		 Properties pro=new Properties();
		 FileInputStream fp=new FileInputStream("");
		 pro.load(fp);
		 pro.getProperty("name");
		 
Actions act=new Actions(driver);		 
act.contextClick(driver.findElement(By.xpath(""))).build().perform();
act.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		 

Alert al=driver.switchTo().alert();
al.accept();
		 
	}

}
