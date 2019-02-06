package ClassExercises;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class explicitWaitExample {

    @Test
    public void explicitWait(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");
        //click to enable
        Driver.getDriver().findElement(By.xpath("//form[@id='input-example']//button")).click();
        //webdriverwait class used to explict waits

        //just creating an object waiting does not happen
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),200);
        //wait.until():this is when wait happens
        //we are waiting for certain element this xpath to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        //enter text
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World");
        Driver.getDriver().findElement(By.xpath("//button[@type='button']")).click();
    }
}
