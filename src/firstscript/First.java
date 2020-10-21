package firstscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class First {
	
	public static void main(String[] args) 
	{
		/*
		 * System.setProperty(
		 * "webdriver.gecko.driver","D://Selenium Training//5pmweekday//jarsanddrivers//geckodriver.exe"
		 * ); WebDriver driver=new FirefoxDriver();
		 */
		/*
		 * System.setProperty(
		 * "webdriver.ie.driver","D://Selenium Training//5pmweekday//jarsanddrivers//IEDriverServer.exe"
		 * ); WebDriver driver=new InternetExplorerDriver();
		 */		
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
