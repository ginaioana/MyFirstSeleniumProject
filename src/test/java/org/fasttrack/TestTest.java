package org.fasttrack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestTest {
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
        //driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.active.parent > a"));

        Actions actions = new Actions(driver);
        WebElement moveonmenu = driver.findElement(By.xpath("#nav > ol > li.level0.nav-1.first.active.parent > a"));
        actions.moveToElement(moveonmenu);
        actions.perform();

//        driver.findElement(By.tagName("#nav > ol > li.level0.nav-1.first.active.parent > a")).getText("#nav > ol > li.level0.nav-1.first.active.parent > ul > li.level1.nav-1-1.first > a");
//        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-left.sidebar.col-left-first > div > div.block-content > ul > li:nth-child(8) > a")).click();
//        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.buttons-set > p > a")).click();




    }
}
