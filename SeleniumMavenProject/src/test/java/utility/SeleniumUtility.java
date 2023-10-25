package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	
	

	public WebDriver setUp(String browser, String appUrl) {
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("CHROME")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}

		if (browser.equalsIgnoreCase("EDGE")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);
		}
		
		if (browser.equalsIgnoreCase("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver(options);
		}
		
		if (browser.equalsIgnoreCase("OPERA")) {
			WebDriverManager.operadriver().setup();
			OperaOptions options = new OperaOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new OperaDriver(options);
		}	
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(appUrl);
		return driver;
	}

	public void typeInput(WebDriver driver, WebElement element, String data) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(data);
	}

	public void clickOnElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
