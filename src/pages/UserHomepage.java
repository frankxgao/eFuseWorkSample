package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserHomepage {

	WebDriver driver;
	By searchBox = By.id("react-select-2-input");
	By placeHolderText = By.cssSelector(".css-151xaom-placeholder");
	By searchResult = By.xpath("//strong[contains(.,'Matthew Benson')]");
	By userPosts = By.xpath("//*[text()='Posts']");
	By userMedia = By.xpath("//*[text()='Media']");
	By discoverBtn = By.xpath("//*[text()='Discover']");
	By opportunityBtn = By.xpath("//*[text()='Opportunity']");
	
	public UserHomepage(WebDriver driver) {
		this.driver = driver;
	}
	public void WaitForCondition() {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(placeHolderText));
	}
	public void ClickSearchBox() {
		 driver.findElement(placeHolderText).click();
	}
	public void SetSearchBox(String searchUser) {
		 driver.findElement(searchBox).sendKeys(searchUser);
	}
	public void ClickOnResult() {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(searchResult));
		 driver.findElement(searchResult).click(); 
	}
	public void ClickOnUserPosts() {
	     WebElement element = driver.findElement(userPosts);
	     Actions actions = new Actions(driver);
	     actions.moveToElement(element).click().build().perform();	
	}
	public void ClickOnUserMedia() {
	     WebElement element = driver.findElement(userMedia);
	     Actions actions = new Actions(driver);
	     actions.moveToElement(element).click().build().perform();	
	}
	public void ClickOnDiscover() {
	     WebElement element = driver.findElement(discoverBtn);
	     Actions actions = new Actions(driver);
	     actions.moveToElement(element).click().build().perform();	
	}
	public void ClickOnOpportunty() {
	     WebElement element = driver.findElement(opportunityBtn);
	     Actions actions = new Actions(driver);
	     actions.moveToElement(element).click().build().perform();	
	}
}
