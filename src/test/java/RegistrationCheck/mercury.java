package RegistrationCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class mercury {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		   driver.get("http://demoaut.com");
		   driver.findElement(By.partialLinkText("REGISTER")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("aaa");
		   driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("bbb");
		   driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
		   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("abc@gmail.com");
		   driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("No 23,xyz street");
		   driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
	}

}