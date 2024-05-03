package RajTensile.RajTensile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RajTensileSturucture {
	                   String driverPath = "C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe";

	                   WebDriver driver = new ChromeDriver();
	                   
	@BeforeTest
	void Home() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
		driver.get("https://rajtensilestructure.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	void homepage() throws InterruptedException {
		WebElement carparking = driver.findElement(By.xpath("//a[contains(@title,'Car Parking Tensile Structure')][normalize-space()='Car Parking Tensile Structure']"));
		carparking.click();
		driver.navigate().back();
		Thread.sleep(1000);
	    WebElement walkway = driver.findElement(By.xpath("//a[contains(@title,'Walkway Tensile Structure')][normalize-space()='Walkway Tensile Structure']"));
		walkway.click();
		driver.navigate().back();
		WebElement auditorium = driver.findElement(By.xpath("//a[contains(@title,'Auditorium Tensile Structure')][normalize-space()='Auditorium Tensile Structure']"));
		auditorium.click();
		driver.navigate().back();
		WebElement gazebo = driver.findElement(By.xpath("//a[contains(@title,'Gazebo Tensile Structure')][normalize-space()='Gazebo Tensile Structure']"));
		gazebo.click();
		driver.navigate().back();
		WebElement swimming = driver.findElement(By.xpath("//a[contains(@title,'Swimming Pool Tensile Covering')][normalize-space()='Swimming Pool Tensile Covering']"));
		swimming.click();
		driver.navigate().back();
		WebElement stadium = driver.findElement(By.xpath("//a[contains(@title,'Stadium Tensile Structure')][normalize-space()='Stadium Tensile Structure']"));
		stadium.click();
		driver.navigate().back();
		
	}
}


