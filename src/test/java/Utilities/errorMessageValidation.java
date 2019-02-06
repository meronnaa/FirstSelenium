package Utilities;

import org.testng.Assert;
import org.testng.annotations.Test;


    public class errorMessageValidation extends TestBase {



        @Test
        public void wrongEmailTest(){
            HomePage homepage = new HomePage();


            driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
            homepage.username.sendKeys("admin");
            homepage.password.sendKeys("test");
            homepage.loginButton.click();


            String error = "Invalid Login or Password.";
            String actualError = homepage.errorMessage.getText();
            Assert.assertEquals(error,actualError);


        }



        @Test
        public void wrongPasswordTest(){
            HomePage homepage = new HomePage();
            driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
            homepage.username.sendKeys("Tester");
            homepage.password.sendKeys("test");
            homepage.loginButton.click();

            String expectedError = "Invalid Login or Password.";
            String actualError=homepage.errorMessage.getText();
            Assert.assertEquals(expectedError,actualError);


        }

        @Test
        public void blankUserName(){
            HomePage homepage = new HomePage();
            homepage.open();
            homepage.login("","test");

            String expectedError = "Invalid Login or Password.";
            String actualError=homepage.errorMessage.getText();
            Assert.assertEquals(expectedError,actualError);



        }
    }

