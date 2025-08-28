package com.example.project;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "c:\\Users\\DELL\\tools\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        System.out.println("Title: " + driver.getTitle());
         driver.manage().window().maximize();
        WebElement user=driver.findElement(By.id("APjFqb"));
        user.sendKeys("Hello how are you");
        user.sendKeys(Keys.ENTER);


    }
}
