package com.automationtest.SeleniumAutomationTest_Insureme;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import java.io.File;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	@SuppressWarnings({ "deprecation" })
	public static void main(final String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe" );
		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		chromeOptions.addArguments(new String[] { "--headless" });
		chromeOptions.addArguments(new String[] { "--no-sandbox" });
		chromeOptions.addArguments(new String[] { "--disable-dev-shm-usage" });
		final WebDriver driver = (WebDriver) new ChromeDriver(chromeOptions);
		driver.get("http://15.207.54.56:8084/contact.html");
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.findElement(By.id("inputName")).sendKeys(new CharSequence[] { "VamsiKrishna" });
		driver.findElement(By.id("inputNumber")).sendKeys(new CharSequence[] { "1010101010" });
		driver.findElement(By.id("inputMail")).sendKeys(new CharSequence[] { "vamsi@gmail.com" });
		driver.findElement(By.id("inputMessage")).sendKeys(new CharSequence[] { "Welcome to the insureme" });
		driver.findElement(By.id("my-button")).click();
		final String message = driver.findElement(By.id("response")).getText();
		if (message.equals("Message Sent")) {
			System.out.println("Script executed Successfully");
		} else {
			System.out.println("Script failed");
		}
		Thread.sleep(3000L);
		driver.quit();
		}

}