package MyTests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiPage extends BaseTest {

@Test
    public void wikiTestPageTitle(){

    System.out.println("Page Title displayed");
    Assert.assertEquals(driver.getTitle(), "Wikipedia, the free encyclopedia");
}

@Test
public void wikiLogoTest(){
    System.out.println("Logo is displayed");
    Assert.assertEquals(driver.findElement(By.xpath("//span[@class='mw-logo-container']")).isDisplayed(), true);
}
}
