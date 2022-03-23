package com.P1.ers.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ERSTest {

	static String browserName = "chrome";
    static WebDriver driver;
    
    @BeforeAll
    public static void setup()
    {
        if(browserName.equals("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else if(browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserName.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }

    @Test
    @DisplayName("Testing Login Functionality of ERS - 1")
    public void testLoginFunctionality() {
    	driver.get("http://localhost:8080/P1-ERS-revature/login.html");
    	driver.manage().window().maximize();
    	//XPATH locators
    	driver.findElement(By.name("username")).sendKeys("Trey");
    	driver.findElement(By.name("password")).sendKeys("123789");
    	
    	driver.findElement(By.id("submit"));
    	
		assertTrue(driver.findElement(By.xpath("/html/body/form")).isDisplayed());

    }
    @Test
    @DisplayName("Testing Login Functionality of ERS - 2")
    public void testLoginFunctionality2() {
    	driver.get("http://localhost:8080/P1-ERS-revature/login.html");
    	driver.manage().window().maximize();
    	//XPATH locators
    	driver.findElement(By.name("username")).sendKeys("Trey");
    	driver.findElement(By.name("password")).sendKeys("123123");
    	
    	driver.findElement(By.id("submit"));
    	
		assertTrue(driver.findElement(By.xpath("/html/body/form")).isDisplayed());

    }
}
