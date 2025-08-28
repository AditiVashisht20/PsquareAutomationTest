package com.example.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class contactus {
    public static void main(String[] args) {
        System.out.println("Contact Us Page");

         System.setProperty("webdriver.chrome.driver", "c:\\Users\\DELL\\tools\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://abhirachana-webapplication-collab.onrender.com/contact");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        
        driver.findElement(By.xpath("//div[@class='_menuContainer_1lkaf_50']")).click();
        System.out.println("Berger found");

        //fill name

        WebElement name=driver.findElement(By.xpath("(//input[@class='_floatingInput_1js2p_34'])[1]"));
        name.sendKeys("Aditi");

        //fill email

        WebElement phone=driver.findElement(By.xpath("(//input[@class='_floatingInput_1js2p_34'])[2]"));
        phone.sendKeys("9888058285");

        //fill message

        WebElement textarea=driver.findElement(By.xpath("//textarea[@class='_textArea_91za3_5']"));
        textarea.sendKeys("Please call for query");

        driver.findElement(By.xpath("//button[text()='Send Message']")).click();

        //success message
        





    }
    
}
