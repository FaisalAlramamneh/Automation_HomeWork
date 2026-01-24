package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
	//	driver.findElement(By.id("//button[@id='submit']")).click();
	//	driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("student");
	//	driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("student");
	//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
