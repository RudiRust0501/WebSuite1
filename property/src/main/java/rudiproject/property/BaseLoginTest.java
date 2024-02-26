package rudiproject.property;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseLoginTest {

	WebDriver driver;
	
	@BeforeTest
	public void login99 () throws InterruptedException {
	
		String username = "RudiRust99";
		String password = "1234abcd";
		
	    driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.99.co/id/");
				   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='Headerv2User']//button[text()='Masuk']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//button[@type='submit' and @data-cy='login-username-button-selanjutnya']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit' and @data-cy='login-password-button-selanjutnya']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterTest
	public void TearDown () {
		//Logout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//img[@src='https://www.99.co/id/img-regional/40/40/crop/false']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div/div[2]/div[3]/button")).click();	
	}
}

