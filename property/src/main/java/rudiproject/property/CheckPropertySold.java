package rudiproject.property;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class CheckPropertySold extends BaseLoginTest {
	
	public void loginAndLogout () throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element); 
		
		//Check property sale Rumah
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='rumah dijual']")).click();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		//Back and check property sale Apartment
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element1 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element1);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='apartemen dijual']")).click();
		
		//Back and check property sale Ruko
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element2 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element2);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='ruko dijual']")).click();
		
		//Back and check property sale Tanah
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element3 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element3);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='tanah dijual']")).click();
		
		//Back and check property sale Kios
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element4 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element4);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='kios dijual']")).click();
		
		//Back and check property sale Vila
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element5 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element5);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='Villa dijual']")).click();
		
		//Back and check property sale Komersial
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element6 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element6);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='komersial dijual']")).click();
		
		//Back and check property sale Ruang Kantor
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element7 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element7);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='ruang kantor dijual']")).click();
				
		//Back and check property sale Gudang
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element8 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element8);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='gudang dijual']")).click();
		
		//Back and check property sale Hotel
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element9 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element9);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='hotel dijual']")).click();
				
		//Back and check property sale Kost
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element10 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element10);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='kost dijual']")).click();
		
		//Back and check property sale Pabrik
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element11 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element11);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='pabrik dijual']")).click();
		
		//Back and check property sale Gedung Bertingkat
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element12 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element12);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='gedung bertingkat dijual']")).click();
		
		//Back and check property sale Kondotel
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element13 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element13);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='kondotel dijual']")).click();
		
		//Back and check property sale Toko
		driver.findElement(By.xpath("//div[@class='Headerv2__container-back']")).click();
		Thread.sleep(10000);
		WebElement element14 = driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]"));
		jse.executeScript("window.scrollBy(0,2500)","arguments[0].scrollIntoView(true);", element14);
		driver.findElement(By.xpath("//div//span[contains(text(),'properti dijual')]")).click();
		driver.findElement(By.xpath("//a[@title='toko dijual']")).click();
	}
}
