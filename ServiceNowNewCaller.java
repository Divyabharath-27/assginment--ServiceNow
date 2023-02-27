package practice2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowNewCaller {
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
		
		   
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("All",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
       
		driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[text()='New']")).click();
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Divyabharath");
        driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("R");
        driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("rdivyabharath2000@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"sys_user.phone\"]")).sendKeys("Null");
        driver.findElement(By.xpath("//*[@id=\"sys_user.mobile_phone\"]")).sendKeys("1234567789");
        
        driver.findElement(By.xpath("//a[@id='lookup.sys_user.title']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandles1=new ArrayList<String>(windowHandles);
        driver.switchTo().window( windowHandles1.get(1));
        driver.findElement(By.linkText("Junior Developer")).click();
        
        Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> windowHandle3=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle3.get(0));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		WebElement Successfull = driver.findElement(By.xpath("//div[@class='outputmsg_text']"));
		System.out.println(Successfull.getText());
		
	}}