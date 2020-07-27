package NewLearning1.NewLearning1.actuator.log4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("good");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		

	}

}
