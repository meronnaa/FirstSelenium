package ClassExercises;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExlicitWaitToo {

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //different xpath we can use tag name=====button
        //click on a biutton
        Driver.getDriver().findElement(By.xpath("//div[@id='start']/button")).click();
        //locate text
        WebElement text=Driver.getDriver().findElement(By.xpath("//div[@id='finish']/h4"));//#finish h4

        //verify test is displayed
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(
                ExpectedConditions.visibilityOf(text)
        );
        System.out.println(text.getText());
        Assert.assertTrue(text.isDisplayed());
    }
@Test
    public void test2(){
    Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
    //different xpath we can use tag name=====button
    //click on a biutton
    Driver.getDriver().findElement(By.xpath("//div[@id='start']/button")).click();
    //locate text
    WebElement text=Driver.getDriver().findElement(By.xpath("//div[@id='finish']/h4"));//#finish h4


    //TODO WAIT UNTIL LOADING MESSAGE DISAPPEAR
    //verify test is displayed
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
    wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[.='Loading...]"))
    );

    System.out.println(text.getText());
    Assert.assertTrue(text.isDisplayed());

}
























}
