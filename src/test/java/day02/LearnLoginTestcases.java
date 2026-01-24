package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLoginTestcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		//driver.navigate().back();
		driver.manage().window().maximize();
		 
		//Link
		//driver.findElement(By.linkText("info@katalon.com")).click();
		//driver.findElement(By.partialLinkText("info@katalon.com")).click();

		//close browser 
		//driver.close();
		//driver.quit();
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		//GetTextfunction
		//String Title = driver.findElement(By.tagName("h2")).getText();
		//System.out.println(Title);
		
	   //DropDowmList
       //WebElement facilityDropdown = driver.findElement(By.id("combo_facility"));
       //Select select = new Select(facilityDropdown);
       //select.selectByVisibleText("Seoul CURA Healthcare Center");
	
		
	}

}
