package rudiproject.property;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SignUp {
	public void signup () throws InterruptedException {
		 
	WebDriver driver;
	String fullname = "Rudi Rustandi";
	String username = "RudiRust99";
	String email = "roottest99@mail.com";
	String password = "1234abcd";
	String retypepass = "1234abcd";
			  
    driver = new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.99.co/id/");
			   
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[normalize-space()='Daftar']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.findElement(By.xpath("//*[@id=\"register_full_name\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"register_full_name\"]")).sendKeys(fullname);
	driver.findElement(By.xpath("//*[@id=\"register_username\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"register_username\"]")).sendKeys(username);   
	driver.findElement(By.xpath("//*[@id=\"register_email\"]")).sendKeys(email);
	driver.findElement(By.xpath("//*[@id=\"register_password\"]")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"register_confirm_password\"]")).sendKeys(retypepass);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div/div/div[1]/form/button")).click();
	
	//Logout
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.findElement(By.xpath("//img[@src='https://www.99.co/id/img-regional/40/40/crop/false']")).click();
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div/div[2]/div[3]/button")).click();			   
	}	
}
