package seleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1cNavCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driverFolder//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url= "http://www.rediff.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='signin_info']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().to(url);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}

}
