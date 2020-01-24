package capitalVue;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class CapitalVue {

	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/selenium-java-3.141.59/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chunyukuo88.github.io/company-stats/");
	}
	
	public static void main(String[] args) {
		CapitalVue obj = new CapitalVue();
		obj.launchBrowser();
	}
}
