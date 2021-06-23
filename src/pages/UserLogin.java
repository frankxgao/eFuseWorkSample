package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class UserLogin {
	WebDriver driver;
	
	By userEmail = By.name("email");
	By userPassword = By.name("password");
	By loginBtn = By.className("EFRipple_ripple__1mSNN");
	By submitBtn = By.cssSelector(".LoginTemplate_formButton__1FR_X");
	By notificationMessage = By.className("notification-message");
	By notificationIcon = By.className("notification-parent");
	
	public UserLogin(WebDriver driver) {
		this.driver = driver;
	}
	// Click on login button to pull up form
	public void ClickLogin() {
		driver.findElement(loginBtn).click();
	}
	// Set user email in login box
	public void SetLoginEmail(String loginEmail) {
		driver.findElement(userEmail).sendKeys(loginEmail);
	}
	// Set user password in login box
	public void SetLoginPassword(String loginPassword) {
		driver.findElement(userPassword).sendKeys(loginPassword);
	}
	// Click on submit login button
	public void ClickSubmit() {
		driver.findElement(submitBtn).click();
	}
	
	public void LoginToEFuse(String loginEmail, String loginPassword) {
		ClickLogin();
		SetLoginEmail(loginEmail);
		SetLoginPassword(loginPassword);
		ClickSubmit();
	}
	
	public void WaitForMessage() {
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(notificationIcon));
	}
	
	public String GetNotificationMsg() {
		this.WaitForMessage();
		return driver.findElement(notificationMessage).getText();
	}
	
	

}
