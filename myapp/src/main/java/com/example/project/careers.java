package com.example.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class careers {

    public static void main(String[] args) {
        System.out.println("Careers Page");
        //careers page link
        //
         System.setProperty("webdriver.chrome.driver", "c:\\Users\\DELL\\tools\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://abhirachana-webapplication-collab.onrender.com/careers");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

        driver.findElement(By.xpath("//button[text()='Submit Review']")).click();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

        //search for job role

        WebElement search=driver.findElement(By.xpath("//input[@class='_floatingInput_uxkib_36']"));
        search.sendKeys("Accountant");
        

        //click on view details
        driver.findElement(By.xpath("//button[text()='Apply Now']")).click();

        //fill name
        WebElement name=driver.findElement(By.xpath("(//input[@class='_floatingLabel_1js2p_61'])[1]"));
        name.sendKeys("Aditi");

        //fillemail
        WebElement email=driver.findElement(By.xpath("(//input[@class='_floatingLabel_1js2p_61'])[2]"));
        email.sendKeys("aditi@example.com");

        //fill phone number
        WebElement phone=driver.findElement(By.xpath("(//input[@class='_floatingLabel_1js2p_61'])[3]"));
        phone.sendKeys("9888058285");   

        //resume upload

        WebElement image=driver.findElement(By.xpath("//span[contains(text(),'Click here')]"));
        image.click();
       // driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(seconds:10));
        image.sendKeys("C:\\Users\\DELL\\Downloads\\JD- QUALITY ANALYST!.docx");

        //send resume button
        driver.findElement(By.xpath("//button[text()='Send Resume']")).click();








    
    
}
}
