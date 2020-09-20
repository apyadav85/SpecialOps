import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SO {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Jars\\3.141\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:81");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();

	}

}
