package mvnDay1.PropertyFileReading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {

	public static void main(String[] args) throws IOException {
//     1. Create an object of FileInputStream class and pass the properties file location in the constructor
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.properties");

//   ./ ==> F:\Acceleration\15 Jan\SeleniumMavenProject
		
//    2. Create object of properties class
		Properties prop = new Properties();
		
//   3. call load() from Properties class
		prop.load(fis);
		
//   use getProperty() method to read the required data
		System.out.println("Browser name is : " + prop.getProperty("browser"));
		
		System.out.println(" Username is : " + prop.getProperty("username"));
		System.out.println("Password is : " + prop.getProperty("password"));
		System.out.println("App Url is : " + prop.getProperty("appUrl"));
		
		
		
	   }
	
	}

