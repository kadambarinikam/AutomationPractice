package mvnDay1.BasicProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleProgram {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
//      how to maximize the launched browser
		driver.manage().window().maximize();
		
//      provide implicit wait of 20 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//     how to launch any web application in the browser
		driver.get("https://www.amazon.in/");
		
		driver.close();
		
	}

}
