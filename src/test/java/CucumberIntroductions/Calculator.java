package CucumberIntroductions;

import org.testng.annotations.Test;


import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class Calculator {


    @Test
    public void menu(){
        Menu menu=new Menu();
        assertNotNull(menu);

    }

    @Test
    public void priceTest(){
        Menu menu=new Menu();
        assertEquals(menu.fries,1);
        assertEquals(menu.pizza,2);
        assertEquals(menu.coke,3);

    }

    @Test
    public void OrderTest(){
        Menu menu=new Menu();
        List<Integer>order=menu.createOrder("pizza","fries");

        assertNotNull(order);





    }

}