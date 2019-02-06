package Assignment.PristaShopIII.Cart;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartLoginTest extends TestBase {
    HomePage1 homePage1=new HomePage1();

    @Test

   public void CartTest() throws InterruptedException {


       driver.get("http://automationpractice.com/index.php");
       homePage1.blousePrdt.click();
       driver.switchTo().frame(homePage1.iframe);
       actions.moveToElement(homePage1.hoverOverCart).doubleClick().perform();
       Thread.sleep(5000);
       homePage1.proceedtocart.click();
               actions.moveToElement(homePage1.hoveroveronCart).perform();
               String pdtName=homePage1.cartDetails.getText();
               String actualName="Blouse";
               Assert.assertEquals(pdtName,actualName);

               homePage1.proceedToCheckOut.click();
     homePage1.Login("meronaa26@gmail.com","181295meron");
     actions.moveToElement(homePage1.hoveroveronCart).perform();



   }

   @Test
          public void cartLogOutTest()throws InterruptedException {
       homePage1.open();
       homePage1.sigIn.click();
       homePage1.Login("meronaa26@gmail.com", "181295meron");
       homePage1.backToHomePage.click();
       Thread.sleep(1000);
       actions.moveToElement(homePage1.addPdt2).perform();
       Thread.sleep(1000);
       homePage1.addPdt2.click();
       homePage1.addPdt2ToCart.click();
       homePage1.proceedToCheckOut2.click();
       actions.moveToElement(homePage1.hoverOverCart1).perform();
       //7.Verify that cart contains the product
       String pdtDetails="Faded Short Sleeve T-shirts";
       String cartDetails = homePage1.cartDetails2.getText();
       Assert.assertEquals(cartDetails,pdtDetails);
       System.out.println(cartDetails);
       //8.Log out
        homePage1.logout.click();
       //9.Verify word emptyis displayed in the Cart icon
       Assert.assertEquals(homePage1.emptyMessage.getText(), "Your shopping cart is empty.");
   }
       @Test
         public void cartIconDelteTest() throws InterruptedException {
        homePage1.open();
        //3.Add any product in the homepage to the cart
           actions.moveToElement(homePage1.hoveroverp2).perform();
           actions.moveToElement(homePage1.addanyPdt).click().perform();
           //4.Click on Continue shopping
           homePage1.proced.click();
           actions.moveToElement(homePage1.hoverOverCart1).clickAndHold().perform();
           //6.Click the x to delete the product
           Thread.sleep(1000);
           homePage1.xbutton.click();
          //7.Verify word emptyis displayed in the Cart icon
           System.out.println(homePage1.emtymesage.getText());
        Assert.assertTrue( homePage1.emtymesage.getAttribute("innerText").contains("empty"));







       }
       @Test
    public void CartCheckoutDeleteTest() throws InterruptedException {
           homePage1.open();
           driver.manage().window().maximize();
           //2.Add any product in the homepage to the cart
           actions.moveToElement(homePage1.hoverover1).perform();
           actions.moveToElement(homePage1.addcartNew).click().perform();
           //3.Click on Continue shopping
           homePage1.continueshopping.click();
         //  5.Add anotherproduct in the homepage to the cart
           actions.moveToElement(homePage1.hoverOver2).perform();
           actions.moveToElement(homePage1.addCartNew2).click().perform();
          // 6.Click on Proceed to checkout
          homePage1.proceedtocheekout1.click();
           //7.Verify message Your shopping cart contains: 2 Products
           String message=driver.findElement(By.xpath("//span[@class='heading-counter']")).getText();
           String actulaMessage="Your shopping cart contains: 2 Product";
           System.out.println(message);
           Assert.assertTrue(message.contains(actulaMessage));
           //8.Click the delete icon to delete one of the products
          homePage1.delete1Pdt.click();
         //  9.Verify message Your shopping cart contains: 1Product
           Thread.sleep(1000);
           String messagea1=driver.findElement(By.xpath("//div[@id='center_column']/h1/span")).getAttribute("innerText").trim();
           Assert.assertTrue(messagea1.contains("Your shopping cart contains: 1 Product"));
           //10.Click the delete icon to delete the second product
          homePage1.delete1Pdt2.click();
           //11.Verify message Your shopping cart is empty
           Assert.assertTrue(homePage1.emptymesge.getAttribute("innerText").contains("Your shopping cart is empty"));








































       }
}
