import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		RemoteWebDriver dr=new ChromeDriver();
		
=		
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		WebDriverWait wb=new WebDriverWait(driver, 10);
		
		wb.until(ExpectedConditions.presenceOfElementLocated(null));
		
		Wait wait=new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(null).ignoring(null, null);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(null);
		
		act.contextClick().build().perform();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent()); 

		alert.authenticateUsing(new UserAndPassword(**username**, **password**));
	
		
		 
		
		
	}

}
