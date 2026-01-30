package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		
        String ConfAleart= driver.switchTo().alert().getText();
        System.out.println(ConfAleart);
		driver.switchTo().alert().dismiss();

	}

}
