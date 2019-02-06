package ClassExercises;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void test1(){
        System.out.println("starting");
        Assert.assertTrue(false);
        System.out.println("done");
    }
    @Test
    public void test2(){
        SoftAssert softAssert=new SoftAssert();
        System.out.println("starting");
        softAssert.assertTrue(false);
        Assert.assertTrue(false);//cos we have hard assertion in here the test will stop in here it will not go to other tests even to the softassertAll
        System.out.println("done");
        softAssert.assertEquals(3,1);
        softAssert.assertAll();//which reports all the assertions and tell us about all the failures at the end of all tests


    }
}

