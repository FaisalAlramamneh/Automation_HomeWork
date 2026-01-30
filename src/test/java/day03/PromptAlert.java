package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();

        String PrAleart= driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Faisal");
		driver.switchTo().alert().accept();


	}

}
