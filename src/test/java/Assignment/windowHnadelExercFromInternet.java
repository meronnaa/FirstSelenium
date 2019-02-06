package Assignment;

import Utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class windowHnadelExercFromInternet extends TestBase {

    @Test
    public void test1(){
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        String handel=driver.getWindowHandle();
       System.out.println(handel);

        WebElement button=driver.findElement(By.xpath("//button[@onclick='newMsgWin()']"));
        button.click();

        Set<String>windo=driver.getWindowHandles();
       System.out.println(windo);
        for(String hndd:windo){
           System.out.println(hndd);
            driver.switchTo().window(hndd);

        }
        driver.close();


    }
}