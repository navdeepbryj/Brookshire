package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.*;

public class Brookshire_Login_Logout {

	static Scanner input = new Scanner(System.in);
	static AppiumDriver<MobileElement> driver; 
	
	public static void main(String[] args) {
		
	try {
		openCalculator();
		
	}catch(Exception exp) {
		System.out.println(exp.getCause());
		System.out.println(exp.getMessage());
		exp.printStackTrace();
		
	}

	}
	
	public static void openCalculator() throws MalformedURLException, Exception {
	

	  DesiredCapabilities cap = new DesiredCapabilities();
		
	  cap.setCapability("deviceName", "Pixel 2");
	  cap.setCapability("udid", "HT7AE1A01673");
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("platformVersion", "11"); 
	  cap.setCapability("appPackage", "com.brookshire.brothers.app");
	  cap.setCapability("appActivity", "com.follow.brookshirebrothers.MainActivity");
	 
	  URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
	  driver = new AppiumDriver<MobileElement>(url, cap);
	  
	  System.out.println("Application Started.....");
	  
	  TimeUnit.SECONDS.sleep(14);
	  
	  //Explicit wait needs to be added
	  
	  System.out.println("Waiting to find the Username box and clicking in the box");
	  
	  MobileElement username = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]"));
	  
	
	  System.out.println("Username Field found clicking on it now");
	  
	  username.click(); 
	  
	  System.out.println("Enter the Username");
	  
	  Actions action1 = new Actions(driver);
	  action1.sendKeys("Kenzie.herring@gmail.com").perform();
	  
	  System.out.println("Waiting to find the Password box and clicking in the box");
	  
	  
	  TimeUnit.SECONDS.sleep(4);
	  
	  MobileElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
	  
	  
	  System.out.println("Password Field found clicking on it now");
	  
	  password.click(); 
	  
	  Actions action2 = new Actions(driver);
	  action2.sendKeys("Parkerb4!").perform();
	  
	  System.out.println("Clicking on Login Button");
	  
	  //Add code for Login Button
	  
	  TimeUnit.SECONDS.sleep(2);
	  
	  MobileElement Login = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
	  
	  
	  System.out.println("Clicking on Login");
	  
	  Login.click(); 
	  
	  System.out.println("Login Successful");
	  
	  //Code to add explicit wait time - Need to be reworked
	  
	  // WebDriverWait wait = new WebDriverWait(driver,30);
	  // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\\\"Navbar button\\\"])[1]")));
	  // click on the Hamburger menu as soon as the it is visible
	  //  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\\\"Navbar button\\\"])[1]")).click();
	  
	  
	  TimeUnit.SECONDS.sleep(16);
	  
	  System.out.println("Locating and Clicking on Hamburger Menu");
	  
	  MobileElement hamburgermenu = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Navbar button\"])[1]"));
	  
	  hamburgermenu.click();
	  
	  TimeUnit.SECONDS.sleep(2);
	  
	  System.out.println("Locating and Clicking on Signout Button");
	  
	  MobileElement signout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[9]/android.widget.TextView"));
	  
	  signout.click();

	  System.out.println("Signout Successful");
	  
	}
	
}



