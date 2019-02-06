package ClassExercises;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtsyWithSoftAssert extends TestBase {

    @Test
    public void test(){
        driver.get("https://etsy.com");
        driver.findElement(By.id("search-query")).sendKeys("gift"+ Keys.ENTER);
       softAssert.assertTrue(driver.getTitle().contains("gift"),"title did noit match");
        Assert.assertTrue(driver.getTitle().contains("AAA"));//ASSERT.ASS......is a hard asert it will stop when one test fail


    }
}
