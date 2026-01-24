package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		 //DropDownLis
		WebElement courseDDL = driver.findElement(By.id("course"));
		Select dd = new Select(courseDDL);
		//single dropdowmlist
		//dd.selectByIndex(1);
		//dd.selectByValue("java");
		//dd.selectByVisibleText("Java");
		
		//MultiValueDDL
		WebElement IDE = driver.findElement(By.id("ide"));
		Select ddl2 = new Select (IDE);
		ddl2.selectByIndex(1);
		ddl2.selectByIndex(2);
		ddl2.selectByIndex(3);
		ddl2.deselectByIndex(1);
	}

}
