package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class globalHooks {
	WebDriver driver;
	@Before
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Test Automation\\com.adIntelle\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	   	driver =new ChromeDriver(options);
	   	driver.manage().deleteAllCookies();
	   	driver.get("https://pro.adintelle.com/v7/login");
	   	driver.manage().window().maximize();
	   	
	   	//passing the username to the app
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	driver.findElement(By.xpath("/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/input")).sendKeys("Kashmirar");
	   	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement elements=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[2]/div/div[1]/label/span")));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elements);
	    driver.findElement(By.xpath("/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button")).click();
	    
	    //passing the password to the app
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/div/input")).sendKeys("Kashmira@123$");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button/span/span")).click();
	    
	    //passing the code when the override session popup comes
	    Thread.sleep(5000);
	   	 WebElement ele =driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/m-login-warning-dialog/div[2]/div/m-spinner-button/button/span"));
	     if(ele.isDisplayed())
	        {
	    	 ele.click();
	        }
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 System.out.println("reached to home page");	
		 }
	
	@After(order=1)
	public void tearUp() throws InterruptedException
	{
	//	driver.quit();
	//	Thread.sleep(2000);
	}

	public WebDriver getDriver()
	{
		return driver;
	}
}
