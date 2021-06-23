package test;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import pages.UserLogin;


public class eFuseTests {
	
	  private WebDriver driver;	  
	  private String baseUrl = "http://www.eFuse.gg/";
	  private String driverPath = "C:\\WebDriver\\chromedriver.exe";
	  private UserLogin objUserLogin;
	  
	  
	  @Before
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get(baseUrl);

	  }
	  @After
	  public void tearDown() {
		  
	      driver.quit();
	  }
	  
	  @Test
	  public void login_Test_Failure() {
		  // create login page
		  objUserLogin = new UserLogin(driver);
		  // Login using wrong credentials 
		  objUserLogin.LoginToEFuse("wrongemail@email.com", "wrongPassword");	
		  // get notification message
		  String notificationMessage = objUserLogin.GetNotificationMsg();
		  // verify notification message
		  assertEquals(notificationMessage, "Invalid Email or Password" );
		  
	  }
	  @Test
	  public void login_Test_Sucess() {
		  // create login page
		  objUserLogin = new UserLogin(driver);
		  // Login using correct credentials 
		  objUserLogin.LoginToEFuse("Frankxgao@gmail.com", "Password!1234");
		  // get notification message
		  String notificationMessage = objUserLogin.GetNotificationMsg();
		  // verify notification message
		  assertEquals(notificationMessage, "Logged in successfully!" );
		  	  
	  }
	

}
