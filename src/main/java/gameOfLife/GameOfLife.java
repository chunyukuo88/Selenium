package gameOfLife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GameOfLife {

	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/selenium-java-3.141.59/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8081/");
	}
	
	public void clickTheRandomButton() {
		WebElement randomButton = driver.findElement(By.id("random-button"));
		randomButton.click();
	}
	
	public void step() {
		WebElement stepButton = driver.findElement(By.id("step"));
		stepButton.click();
	}
	
	public static void main(String[] args) {
		GameOfLife obj = new GameOfLife();
		obj.launchBrowser();
		obj.clickTheRandomButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.step();
	}
}
