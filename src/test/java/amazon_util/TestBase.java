package amazon_util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase extends TestUtil {

public static WebDriver driver;
public static Properties prop;

public TestBase() {
	
	try {
		prop=new Properties();
		FileInputStream fis =new FileInputStream("D:\\CucumberProjects\\Amaon_TestCases_Automation\\src\\test\\java\\amzon_config\\config.properties");
		prop.load(fis);
	}catch(IOException e) {
		e.getMessage();
	}
}

public static void initialization() {
	String browserName =prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\projects\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("FF")) {
		System.setProperty("webdriver.gecko.driver", "D:\\web driver\\gickoDriver\\geckodriver.exe");
		driver =new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}

}
