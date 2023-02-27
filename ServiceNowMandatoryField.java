package practice2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowMandatoryField {
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
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Knowledge",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Knowledge'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary']/span)[1]")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.id("lookup.kb_knowledge.kb_knowledge_base")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>  windowHandles1=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandles1.get(1));
	    driver.findElement(By.linkText("IT")).click();
	    
	    Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> windowHandle3=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle3.get(0));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("iam Divyabharath");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		

}}
