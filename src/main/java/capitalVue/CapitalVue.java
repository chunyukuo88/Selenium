package capitalVue;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CapitalVue {

	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/selenium-java-3.141.59/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chunyukuo88.github.io/company-stats/");
	}
	
	public void getSearchBox() {
		WebElement searchBox = driver.findElement(By.id("input"));
		searchBox.sendKeys("MMM"); //Stock symbol for the 3M company
	}
	
	public void clickButton() {
		WebElement button = driver.findElement(By.id("button"));
		button.click();
	}
	
	public void clickCompanyWebsite() {
		WebElement officialSite = driver.findElement(By.linkText("http://www.3m.com")); //URL for company site
		officialSite.click();
	}
	
	public static void main(String[] args) {
		CapitalVue obj = new CapitalVue();
		obj.launchBrowser();
		obj.getSearchBox();
		obj.clickButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.clickCompanyWebsite();
	}
}
