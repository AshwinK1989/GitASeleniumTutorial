package seleniumTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ex1aLaunch {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverFolder\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\driverFolder\\IEDriverServer.exe");
		/*System.setProperty("webdriver.gecko.driver","path of geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		WebDriver iedriver = new InternetExplorerDriver();
		WebDriver chromedriver = new ChromeDriver();
		String URL = "https://www.google.com";
		iedriver.get(URL);
		chromedriver.get(URL);
		//
		
	}

}
