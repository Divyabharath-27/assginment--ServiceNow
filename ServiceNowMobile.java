package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowMobile {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev140572.service-now.com/");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Service Catalog",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Service Catalog'])[1]")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("detail_bd6fa75a4f334200086eeed18110c79e")).click();
}}
