package seleniumTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverFolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url= "http://www.rediff.com/";
		driver.get(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title: "+ title + "\n Title Length: " + title.length());
		String pageurl = driver.getCurrentUrl();
		System.out.println("getCurrentUrl(): "+ pageurl);
		if(pageurl.equals(url)) System.out.println("Correct Page is opened");
		else System.out.println("Incorrect Page is opened.Please correct the URL");
		String psrc = driver.getPageSource();
		System.out.println("Page Source Length:"+ psrc.length());
		driver.close(); 
		driver.quit();
	}

}
