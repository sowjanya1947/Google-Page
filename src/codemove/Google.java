package codemove;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Personal\\Selenium\\Browsers\\Chrome\\chromedriver_win32 (86)\\chromedriver.exe");
		
		ChromeDriver  driver = new ChromeDriver();
		          driver.get("http://www.google.com");
		         System.out.println(driver.getTitle());
		       //  System.out.println(driver.getTitle());
		          driver.quit();
		

	}

}
