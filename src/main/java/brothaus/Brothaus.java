package brothaus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brothaus {

	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
						   "/selenium-java-3.141.59/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chunyukuo88.github.io/Brothaus/");
	}
	
	public void clickDropdown() {
		WebElement dropdownMenu = driver.findElement(By.id("bread-button"));
		dropdownMenu.click();
	}

	public void changeLanguage() {
		WebElement 華語版本 = driver.findElement(By.id("chinese"));
		華語版本.click();
	}
	
	public static void main(String[] args) {
		Brothaus brothaus = new Brothaus();
		brothaus.launchBrowser();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		brothaus.clickDropdown();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		brothaus.changeLanguage();
	}
}
