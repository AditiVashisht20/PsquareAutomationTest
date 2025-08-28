package com.example.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        System.out.println("Login Page");
        System.setProperty("webdriver.chrome.driver", "c:\\Users\\DELL\\tools\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://abhirachana-webapplication-collab.onrender.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        
        driver.findElement(By.xpath("//div[@class='_menuContainer_1lkaf_50']")).click();
        System.out.println("Berger found");

        //login button
        driver.findElement(By.xpath("//p[contains(text(),'Login')]")).click();

        //fill name
        WebElement name=driver.findElement(By.xpath("(//input[@class='_floatingInput_1js2p_34'])[4]"));
        name.sendKeys("Aditi");

        //fill phone number
        WebElement phone=driver.findElement(By.xpath("(//input[@class='_floatingInput_1js2p_34'])[5]"));
        phone.sendKeys("9888058285");


        //click on login button
        driver.findElement(By.xpath("//button[@class='btn btn-primary _button_irlj0_99']")).click();
        


    }


    
}
