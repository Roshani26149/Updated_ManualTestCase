package amazon_pages;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import amazon_util.TestBase;
import amazon_util.TestUtil;

public class _01_HomePage extends TestBase{
	
	private WebDriver driver;
	
	
	//Locators
	private By nav_hamburger_menu =By.id("nav-hamburger-menu");
	private By logo =By.xpath("//span[@class='nav-sprite nav-logo-base']");
	private By selectAddressIcon =By.id("glow-ingress-line2");
	private By search =By.id("twotabsearchtextbox");
	private By Flag_langage_Selector =By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']");
	private By nav_link_accountList =By.id("nav-link-accountList");
	private By nav_orders =By.id("nav-orders");
	private By nav_link_prime = By.id("nav-link-prime");
	private By nav_cart_count =By.id("nav-cart-count");
	private By login =By.linkText("Sign in securely");
	private By Product_of_HomePage =By.xpath("//img[@alt='Washing machines']");
	private By BackToTop =By.linkText("Back to top");
	private By NewCustomerLink =By.linkText("Start here.");
	private By langage_link =By.xpath("icp-nav-globe-img-2 icp-button-globe-2");
	
	
	
	//constructor
	public _01_HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
   //Actions
	public void elementPresentInHeader(String text) throws Exception {
		boolean b=false;
		switch(text.toLowerCase().trim()) {

		case "Hamburger Menu":
			b=driver.findElement(nav_hamburger_menu).isDisplayed();
			break;

		case "Amazon logo":
			b=driver.findElement(logo).isDisplayed();
			break;

		case "Order logo":
			b=driver.findElement(nav_orders).isDisplayed();
			break;

		case "Prime Link":
			b=driver.findElement(nav_link_prime).isDisplayed();
			break;

		case "Accound And List":
			b=driver.findElement(nav_link_accountList).isDisplayed();
			break;

		case "Add To Card Basket":
			b=driver.findElement(nav_cart_count).isDisplayed();
			break;
		case "select Address Icon" :
			b=driver.findElement(selectAddressIcon).isDisplayed();
			break;
			
		case "search ":
			b=driver.findElement(search).isDisplayed();
			break;
			
		case "Flag langage Selector":
			b=driver.findElement(Flag_langage_Selector).isDisplayed();
			break;
			
		case "login":
			b=driver.findElement(login).isDisplayed();
			break;
			
		case "langage link":
			b=driver.findElement(langage_link).isDisplayed();
			break;
			
		case "New Customer link":
			b=driver.findElement(NewCustomerLink).isDisplayed();
			break;
			
		default:
			
			throw new Exception("header link is not displayed ");
		}
		if (b) {
			
			Assert.assertEquals("Header Link displayed",true, b);
		}else {
			
			Assert.fail("Header Link is not displayed: " + text);
		}
	}
	
	public void HomePageProductClickable() {
		driver.findElement(Product_of_HomePage).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void BackToTopLink() throws Exception {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		for(int i=1;i<10;i++) {
			js.executeScript("window.scrollBy(0, 1000)");
		}
		
		driver.findElement(BackToTop).click();
		Thread.sleep(2000);;
		
	}
}
