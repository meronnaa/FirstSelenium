package ClassExercises;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class sleepAndImplicitWaitExample {
    WebDriver driver;
    @BeforeMethod
    public void setUp()throws  InterruptedException{
        Thread.sleep(10000);
        driver= Driver.getDriver();
    }



    @AfterMethod
    public void tearDown(){

    }
    @Test
    public void testSleep() throws InterruptedException{
       driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
       driver.findElement(By.tagName("button")).click();
       Thread.sleep(10000);//it just waits in here
       System.out.println(driver.findElement(By.id("finish")).getText());
    }
    @Test
    public void implicitWait(){
        //please wait when you are trying to find an element but cannot find it
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//these one we can do it at top anytime it will help us it jknows where to wait
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.tagName("button")).click();
        System.out.println(driver.findElement(By.id("finish")).getText());
    }
    @Test
    public void implicitWait2(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
       driver.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
       // driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));
        System.out.println(driver.findElement(By.id("message")).getText());
        driver.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
        System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
    }













}
