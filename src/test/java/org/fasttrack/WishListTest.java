package org.fasttrack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    @Test
    public void wishList() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
        accountButton.click();

        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("gina.crihana@scout.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("ginagina");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-left.sidebar.col-left-first > div > div.block-content > ul > li:nth-child(8) > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.buttons-set > p > a")).click();

        driver.quit();


    }
   @Test
    public void addWishList(){
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
      driver.get("https://fasttrackit.org/selenium-test/");
       WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a"));
       accountButton.click();

       WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
       loginLink.click();

       driver.findElement(By.cssSelector("#email")).sendKeys("gina.crihana@scout.ro");
       driver.findElement(By.cssSelector("#pass")).sendKeys("ginagina");
       driver.findElement(By.cssSelector("#send2")).click();
       driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
       driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > ul > li:nth-child(1) > a")).click();
       driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.buttons-set > p > a")).click();
       driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-left.sidebar.col-left-first > div > div.block-content > ul > li:nth-child(8) > a")).click();
       driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-left.sidebar.col-left-first > div > div.block-content > ul > li:nth-child(8) > a")).click();

       driver.quit();
   }
}
