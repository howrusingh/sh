import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class AppMain {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables

    	System.setProperty("webdriver.gecko.driver","C:\\work\\project\\llb\\selenium\\browser-drivers\\geckodriver\\v0.16.0\\geckodriver.exe");
//    	System.setProperty("webdriver.chrome.driver", "C:\\work\\project\\llb\\selenium\\browser-drivers\\chromedriver\\v2.9-win32\\chromedriver.exe");

    	WebDriver driver ;
    	driver = new FirefoxDriver();
//    	driver = new HtmlUnitDriver();
//    	driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    	String baseUrl = "https://capmdashboardqa.int.net.nokia.com";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        System.out.println("Current page title : "+driver.getTitle());
       
        WebElement userNameField = driver.findElement(By.id("txtUser"));
        System.out.println(userNameField.getTagName());
        
        WebElement pwdField = driver.findElement(By.id("txtPassword"));
        System.out.println(pwdField.getTagName());
        
        WebElement submitSSOButton = driver.findElement(By.cssSelector("button#submit"));
        		
        userNameField.sendKeys("xxxxxxx");
        pwdField.sendKeys("xxxxxx");
        submitSSOButton.click();
        
        System.out.println("Current page title : "+driver.getTitle());
        
        //close Fire fox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
        
        
  
    }

}
