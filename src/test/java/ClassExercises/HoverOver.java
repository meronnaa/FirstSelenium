package ClassExercises;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverOver extends TestBase {

    @Test
    public void test(){
        driver.get("http://www.amazon.com");
       WebElement signIn=driver.findElement(By.xpath("//span[.='Hello, Sign in']"));
       //move the mouse on top of the given element
        actions.moveToElement(signIn).perform();
        driver.findElement(By.xpath("//span[.='Your Hearts']")).click();
        Assert.assertTrue(driver.getTitle().contains("Interesting"));

    }
    @Test
    public void test2(){
        driver.get("http://www.amazon.com");
        WebElement help=driver.findElement(By.xpath("(//a[.='Help'])[2]"));
        actions.moveToElement(help).perform();

    }
}
