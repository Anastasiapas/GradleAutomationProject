package MyTests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchTestRedirection() throws InterruptedException {
        System.out.println("User enters search request");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Chromosome");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
      Thread.sleep(2000);
        System.out.println("Page source contains Chromosome");
        Assert.assertTrue(driver.getPageSource().contains("Chromosome"), "page is correct");
    }

    @Test
    public void searchTestPAgetitle() throws InterruptedException {
        System.out.println("User enters search request");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Chromosome");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println("Page title");

        Assert.assertTrue(driver.getTitle().contains("Wikipedia"));
        System.out.println(driver.getTitle());
    }
}
