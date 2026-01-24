package day01;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hi");
		//ClassName obj = new ClassName();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chatgpt.com/:");
	}
 
}
