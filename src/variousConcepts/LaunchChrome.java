package variousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChrome {
	
	// Java associated  with : 				//Class is associated with:
	//Variables / Attribute / Fields        //Method
	//Objects                               //Classes
	
	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
	}

}
