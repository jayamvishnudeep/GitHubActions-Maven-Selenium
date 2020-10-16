package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {

    WebDriver driver = null;

    @BeforeTest
    public void Setup() {


        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void googleSearch() {

        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }


    @AfterTest
    public void closeBrowser() {
        driver.close();
    }


}