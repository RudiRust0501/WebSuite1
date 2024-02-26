package rudiproject.property;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class CheckPropertyRented extends BaseLoginTest {
	
	public void loginAndLogout () throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element); 
		
		//Check property rented Rumah
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='rumah disewa']")).click();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		//Back and check property rented Apartment
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element1 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element1);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='apartemen disewa']")).click();
		
		//Back and check property rented Ruko
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element2 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element2);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='ruko disewa']")).click();
		
		//Back and check property rented Tanah
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element3 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element3);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='tanah disewa']")).click();
		
		//Back and check property rented Kost
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element4 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element4);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='kost disewa']")).click();
		
		//Back and check property rented Vila
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element5 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element5);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='Villa disewa']")).click();
		
		//Back and check property rented Komersial
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element6 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element6);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='komersial disewa']")).click();
		
		//Back and check property rented Ruang Kantor
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element7 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element7);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='ruang kantor disewa']")).click();
				
		//Back and check property rented Gudang
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element8 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element8);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='gudang disewa']")).click();
		
		//Back and check property rented Hotel
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element9 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element9);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='hotel disewa']")).click();
				
		//Back and check property rented Kios
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element10 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element10);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='kios disewa']")).click();
		
		//Back and check property rented Pabrik
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element11 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element11);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='pabrik disewa']")).click();
		
		//Back and check property rented Gedung Bertingkat
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element12 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element12);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='gedung bertingkat disewa']")).click();
		
		//Back and check property rented Kondotel
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element13 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element13);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='kondotel disewa']")).click();
		
		//Back and check property rented Toko
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element14 = driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element14);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti disewa')]")).click();
		driver.findElement(By.xpath("//a[@title='toko disewa']")).click();
	}
}
