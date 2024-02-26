package rudiproject.property;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SearchLocationBandungRent {
	
	public void searchlocationRent () throws InterruptedException {
		
		WebDriver driver;
		String city = "Bandung";
				  
	    driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.99.co/id/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--2 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--3 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--4 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--5 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();	
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--6 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--7 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--8 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--9 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--10 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--11 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back and Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--12 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back and Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--13 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
		
		//Back and Select Property Type
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();	
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/form/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-molecules-select searchBarHome--main__filter_select']")).click();
		driver.findElement(By.xpath("//li[@class='field-option field-option--14 truncated']")).click();
		driver.findElement(By.xpath("//input[@name='search-bar']")).sendKeys(city);
		driver.findElement(By.xpath("//span[@class='ui-atomic-button__text' and text()='Cari Properti']")).click();
	}	
}
