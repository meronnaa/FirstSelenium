package ClassExercises;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
         driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        WebElement text=driver.findElement(By.xpath("//p[@id='demo']"));
        //double click on element
        //after action we need perform()
        actions.doubleClick(text).perform();
        Assert.assertTrue(text.getAttribute("style").contains("red"));

    }
}
