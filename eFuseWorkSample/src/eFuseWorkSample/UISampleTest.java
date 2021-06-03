package eFuseWorkSample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class UISampleTest {
	
	
	public static void main(String[] args) {
		
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    String baseUrl = "http://www.eFuse.gg/";
	    String userEmail = "frankxgao@gmail.com";
	    String password = "Password!1234";
	    	
		
		// Launch eFuse website
	    driver.navigate().to(baseUrl);
		// Maximizes the browser window
		driver.manage().window().maximize() ;
	    
	    // Login Success/Login Failure 
	    
	    driver.findElement(By.cssSelector("span > .EFRectangleButton_rectangleButton__2QIFx > .ButtonThemes_primary__Hb-Sb > .EFRipple_ripple__1mSNN")).click();
	    // Get the WebElement corresponding to Email Address field from the login form
	    WebElement emailInput = driver.findElement(By.name("email"));
	    // Get the WebElement corresponding to the Password field from the login form
	    WebElement passwordInput = driver.findElement(By.name("password"));
	    
	    emailInput.sendKeys(userEmail);
	    passwordInput.sendKeys(password);
	    driver.findElement(By.cssSelector(".LoginTemplate_formButton__1FR_X")).click();
	 
	    // Verify if Login was successful or failed
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-2-input")));
	    
	    String actualUrl= "https://www.efuse.gg/lounge/featured";
	    String expectedUrl= driver.getCurrentUrl();
	    if (actualUrl.contentEquals(expectedUrl)){
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed");
            System.out.println(actualUrl);
            System.out.println(expectedUrl);
        
        }
	    
	    
	    // Search for user mjb
	    // Navigate to user's profile
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".css-151xaom-placeholder")));
	    driver.findElement(By.cssSelector(".css-151xaom-placeholder")).click();
	    driver.findElement(By.id("react-select-2-input")).sendKeys("@mjb");
	    //driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[contains(.,'Matthew Benson')]")));
	    driver.findElement(By.xpath("//strong[contains(.,'Matthew Benson')]")).click();
	    
	    //WebElement myElement = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-2-input")));
	    //myElement.sendKeys("@mjb", Keys.ENTER);
	  
	   	    
	    // Verify if navigation to users profile was successful
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".EFSubHeader_buttonWrapper___WWH0:nth-child(2) .EFRipple_ripple__1mSNN")));
	    String actualProfileUrl= "https://www.efuse.gg/u/mjb";
	    String expectedProfileUrl= driver.getCurrentUrl();
	    if (actualProfileUrl.contentEquals(expectedProfileUrl)){
            System.out.println("User found, Test Successful!");
        } else {
            System.out.println("User not found, Test Failed");
            System.out.println(actualProfileUrl);
            System.out.println(expectedProfileUrl);
        }
	    
	    // Navigate to Posts
	    driver.findElement(By.cssSelector(".EFSubHeader_buttonWrapper___WWH0:nth-child(2) .EFRipple_ripple__1mSNN")).click();
	    //driver.findElements(By.xpath("//*[contains(text(),'Posts')]")).click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".EFSubHeader_buttonWrapper___WWH0:nth-child(2) .EFRipple_ripple__1mSNN")));
	    String actualPostUrl= "https://www.efuse.gg/users/posts?id=5ddd9df9a3980593e6f3feaf&u=mjb";
	    String expectedPostUrl= driver.getCurrentUrl();
	    if (actualPostUrl.contentEquals(expectedPostUrl)){
            System.out.println("User's posts found, Test Successful!");
        } else {
            System.out.println("Url doesn't match, Test Failed");
            System.out.println(actualPostUrl);
            System.out.println(expectedPostUrl);
            
        }
	        
	        
	    // Navigate to Media    
	    driver.findElement(By.cssSelector(".EFSubHeader_buttonWrapper___WWH0:nth-child(5) .EFRipple_ripple__1mSNN")).click();
	    //driver.findElements(By.xpath("//*[contains(text(),'Media')]")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".EFSubHeader_buttonWrapper___WWH0:nth-child(2) .EFRipple_ripple__1mSNN")));
	    String actualMediaUrl= "https://www.efuse.gg/users/media?id=5ddd9df9a3980593e6f3feaf&u=mjb";
	    String expectedMediaUrl= driver.getCurrentUrl();
	    if (actualMediaUrl.contentEquals(expectedMediaUrl)){
            System.out.println("User's media found, Test Successful!");
        } else {
            System.out.println("Url doesn't match, Test Failed");
            System.out.println(actualMediaUrl);
            System.out.println(expectedMediaUrl);
        }
	    
	    	
	    // Navigate to Discover Page and Open an organization
	    driver.findElement(By.cssSelector(".EFHeader_navIconWrapper__1iaXt:nth-child(3) .EFRipple_ripple__1mSNN")).click();
	    
	    // Check if navigation is successful
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".GeneralCard_cardContainer__1uAIK:nth-child(1) .GeneralCard_backgroundImage__2w57_")));	  
	    String actualDiscoverUrl= "https://www.efuse.gg/discover";
	    String expectedDiscoverUrl= driver.getCurrentUrl();
	    if (actualDiscoverUrl.contentEquals(expectedDiscoverUrl)){
            System.out.println("Navigation to Discover is sucessful");
        } else {
            System.out.println("Navigation failed");
            System.out.println(actualDiscoverUrl);
            System.out.println(expectedDiscoverUrl);        
        }
	    // Click on an organization
	    driver.findElement(By.cssSelector(".GeneralCard_cardContainer__1uAIK:nth-child(1) .GeneralCard_backgroundImage__2w57_")).click();
	    
	    // Check if click was successful
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ActionButton_funBlue__18krX")));	
	    String actual1stChildUrl= "https://www.efuse.gg/org/efuse";
	    String expected1stChildUrl= driver.getCurrentUrl();
	    if (actual1stChildUrl.contentEquals(expected1stChildUrl)){
            System.out.println("Click is Sucessful");
        } else {
            System.out.println("Click Failed");
            System.out.println(actual1stChildUrl);
            System.out.println(expected1stChildUrl);       
        }
	    
	    	    
	    // Navigate to Opportunities and click on an opportunity 	    
	    driver.findElement(By.cssSelector(".EFHeader_navIconWrapper__1iaXt:nth-child(4) .EFRipple_ripple__1mSNN")).click();
	    
	    // Check if navigation is successful
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".EFCard_cardStyle__2lMoF:nth-child(2) .EFScaledImage_backgroundImage__Cn6ej")));
	    String actualOpportunityUrl= "https://www.efuse.gg/opportunities";
	    String expectedOpportunityUrl= driver.getCurrentUrl();
	    if (actualOpportunityUrl.contentEquals(expectedOpportunityUrl)){
            System.out.println("Navigation to Opportnities is Sucessful");
        } else {
            System.out.println("Navigation Failed");
            System.out.println(actualOpportunityUrl);
            System.out.println(expectedOpportunityUrl);       
        }
	    
	    // Click on an opportunity
	    driver.findElement(By.cssSelector(".EFCard_cardStyle__2lMoF:nth-child(2) .EFScaledImage_backgroundImage__Cn6ej")).click();
	    
	    // Check if click was successful
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".OpportunityFullView_profileImage__LfNJl")));
	    //String actual2ndChildUrl= "https://www.efuse.gg/o/hm-1374955";
	    String expected2ndChildUrl= driver.getCurrentUrl();
	    if (!actualOpportunityUrl.contentEquals(expected2ndChildUrl)){
            System.out.println("Click is Sucessful");
            System.out.println("new url is " + expected2ndChildUrl);   
        } else {
            System.out.println("Click Failed");
            System.out.println(expected2ndChildUrl);       
        }
	    
	    
        driver.close();
	}
	
	
}
