package com.example.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class testimonials {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "c:\\Users\\DELL\\tools\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://abhirachana-webapplication-collab.onrender.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        
        driver.findElement(By.xpath("//div[@class='_menuContainer_1lkaf_50']")).click();
        System.out.println("Berger found");
    
       driver.findElement(By.xpath("//span[contains(text(),'Testi')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-secondary _buttonText_174c2_137']")).click();

        WebElement name=driver.findElement(By.xpath("(//input[@class='_floatingInput_1js2p_34'])[1]"));
        name.sendKeys("Aditi");

        WebElement phoneNumber=driver.findElement(By.xpath("(//input[@class='_floatingInput_1js2p_34'])[2]"));
        phoneNumber.sendKeys("9888058285");


        WebElement textarea=driver.findElement(By.xpath("//textarea[@class='_textArea_91za3_5']"));
        textarea.sendKeys("Great Experience");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");

        WebElement image=driver.findElement(By.xpath("//span[contains(text(),'Click here')]"));
        image.click();
       // driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(seconds:10));
        image.sendKeys("C:\\Users\\DELL\\Downloads\\flowers.jpg");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

      


        driver.findElement(By.xpath("//button[text()='Submit Review']")).click();








        
       
    }
    
}
