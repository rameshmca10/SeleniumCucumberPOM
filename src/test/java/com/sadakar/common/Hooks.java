package com.sadakar.common;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

	@Before //Cucumber Before Hook
	public static void setupDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@After // Cucumber After hook
	public static void quitDriver() throws Exception {
		driver.quit();
	}

}
