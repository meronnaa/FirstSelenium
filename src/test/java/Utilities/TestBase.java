package Utilities;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.sun.org.apache.bcel.internal.generic.Visitor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {

        protected WebDriver driver;
        protected SoftAssert softAssert;//it soft assert it will countinue even if one test is failing
        protected Actions actions;
        private Select select;


        @BeforeMethod
            public void setUpMethod() {

            driver = Driver.getDriver();
            softAssert = new SoftAssert();
            actions = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);




        }
            @AfterMethod
            public void tearDownMethod(){
            //Driver.closeDriver();
            softAssert.assertAll();





    }

}





