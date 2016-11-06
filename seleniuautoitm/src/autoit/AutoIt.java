package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt {

	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		driver.findElement(By.xpath("//*[@id='photo']")).click();
		
		Runtime.getRuntime().exec("C://Users//user//workspace//seleniuautoitm//sampleAutoIt.exe");
		 
	    Thread.sleep(5000);
		
	}

}
