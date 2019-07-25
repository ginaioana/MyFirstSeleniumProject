package org.fasttrack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    @Test
    public void register(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Ioana");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Gina");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Crihana");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("gina.crihana@scout.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("ginagina");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("ginagina");

        driver.findElement(By.cssSelector("#is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();

        driver.quit();
    }
}
