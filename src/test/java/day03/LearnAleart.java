package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAleart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//simpleAlert
/*		driver.findElement(By.id("OKTab")).click();
		String simplealert= driver.switchTo().alert().getText();
		System.out.println(simplealert);
		driver.switchTo().alert().accept();
		                                                             */
		//confarmationAlert
/*		
		driver.findElement(By.partialLinkText("Alert with OK ")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().dismiss();
		*/
		
		//Prompt Alert
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.id("Textbox")).click();
		driver.switchTo().alert().sendKeys("Faisal");
		driver.switchTo().alert().accept();
	}

}
