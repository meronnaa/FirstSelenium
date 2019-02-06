package ClassExercises;

import Utilities.ConfigurationReader;
import Utilities.HomePage;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase {

    @Test
    public void readPropertyTest(){
       driver.get(ConfigurationReader.getProperty("url"));

        HomePage homepage=new HomePage();
        String username=ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");

    }
}
