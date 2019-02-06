    package Assignment;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;

    public class Porsche extends TestBase {


    @Test
    public void Login() throws InterruptedException {



driver.get("https://www.porsche.com/usa/modelstart/");

        WebElement c718 = driver.findElement(By.xpath("//div[@class='b-teaser-preview-wrapper'][1]"));
        c718.click();
                                                  //4.Remember the price of 718 Cayman Model S
                                                    String pric = driver.findElement(By.xpath("(//div[@class='m-14-model-price'])[2]")).getText();
                                                    String ppp=pric.substring(pric.indexOf("$"),pric.indexOf(".")).trim();
                                                    char[] x= ppp.toCharArray();
                                                    String pricex="";
                                                    for(char xx : x){
                                                        if(Character.isDigit(xx)){
                                                            pricex+=xx;
                                                        }
                                                    }
                                                    Integer priceOne = Integer.parseInt(pricex);



//5.Click on 718 Cayman S
         WebElement click2= driver.findElement(By.xpath("//div[@class='m-14-model-series module-grid'][1]/div[2]"));
       click2.click();

                                       //handele the window
                                       String handle1=driver.getWindowHandle();
                                       Set<String> handles= driver.getWindowHandles();
                                       for(String hndd: handles) {
                                           driver.switchTo().window(hndd);
                                            }

//6.Verify that Base price displayed on the page is same as the price from step 4


                    String price2= driver.findElement(By.xpath("(//div[@class='ccaPrice'])[1]")).getAttribute("innerText").trim();
                    String pri=price2.substring(1);

                              String pr2="";
                              char[]xy=pri.toCharArray();
                              for(char yy:xy){
                                  if(Character.isDigit(yy)){
                                      pr2+=yy;

                                  }
                              }
                          Integer prii2=Integer.parseInt(pr2);

                              Assert.assertEquals(prii2,priceOne);



                             String eqp=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[6]")).getText();
                             String ll=eqp.substring(1);
                             String lk="";
                             char[]llk=ll.toCharArray();
                             for(char kkk:llk){
                                 if(Character.isDigit(kkk)){
                                     lk+=kkk;
                                 }
                             }
                        Integer eqpp=Integer.parseInt(lk);

                             String delivery=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[7]")).getText();
                              String deli=delivery.substring(1);
                              String dell="";
                              char[]deel=deli.toCharArray();
                              for(char de:deel){
                                  if(Character.isDigit(de)){
                                      dell+=de;
                                  }
                              }
                                Integer delive=Integer.parseInt(dell);

                                //the total displaye in the website
                              String total=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[8]")).getText();//70550
                                String tot=total.substring(1);
                                String tt="";
                                char[]ttt=tot.toCharArray();
                                for(char tall:ttt){
                                    if(Character.isDigit(tall)){
                                        tt+=tall;
                                    }
                                }
                        Integer totaa=Integer.parseInt(tt);



                              //overall tyotal of the car
                                Integer totalCar=eqpp+delive+prii2;
                               System.out.println(totalCar);
                                Assert.assertEquals(totaa,totalCar);


       //9.Select color “Miami Blue”
        WebElement color=driver.findElement(By.id("s_exterieur_x_FJ5"));
        color.click();


                                  //10.Verify that Price for Equipment is Equal to Miami Blue price
                                    String eqp2=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[6]")).getText();


                                    String miamiblueprice=driver.findElement(By.xpath("//div[@class='tt_price tt_cell']")).getText();
                                    Assert.assertEquals(eqp2,miamiblueprice);


                                    //11.Verify that total prices the sum of base price + Price for Equipment + Delivery, Processing and Handling Fee

                                    String eqp1=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[6]")).getText();
                                    String ll1=eqp.substring(1);
                                    String lk1="";
                                    char[]llk1=ll.toCharArray();
                                    for(char kkk:llk){
                                        if(Character.isDigit(kkk)){
                                            lk+=kkk;
                                        }
                                    }
                                    Integer eqpp1=Integer.parseInt(lk);


                                    String total1=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[8]")).getText();//70550
                                    String tot1=total.substring(1);
                                    String tt1="";
                                    char[]ttt1=tot.toCharArray();
                                    for(char tall1:ttt){
                                        if(Character.isDigit(tall1)){
                                            tt1+=tall1;
                                        }
                                    }
                                    Integer totaa1=Integer.parseInt(tt);


                                    //overall tyotal of the car
                                    Integer totalCar1=eqpp1+delive+prii2;
                                    System.out.println(totalCar1);
                                    Assert.assertEquals(totaa1,totalCar);


                    //12.Select 20" Carrera Sport Wheels
                    WebElement wheel=driver.findElement(By.xpath("(//span[@class='img-element'])[8]"));
                    wheel.click();

       // 13.Verify that Price for Equipment is the sum of Miami Blue price + 20" Carrera Sport Wheels

         //price for equipment
        String eqp12=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[6]")).getText();
        String ll2=eqp12.substring(1);
        String lk2="";
        char[]llk2=ll2.toCharArray();
        for(char kkk1:llk2){
            if(Character.isDigit(kkk1)){
                lk2+=kkk1;
            }
        }
        Integer eqpp2=Integer.parseInt(lk2);

        //price for the wheel
        String carrWheel=driver.findElement(By.xpath("(//div[@class='tt_price tt_cell'])[2]")).getText();
        String carr=carrWheel.substring(1);
        String  carrW="";
        char[]ch=carr.toCharArray();
        for(char chh:ch){
            if(Character.isDigit(chh)){
                carrW+=chh;

            }
        }
        Integer carWheel=Integer.parseInt(carrW);

               //price for maimi blue
        String miami=miamiblueprice.substring(1);
        String mi="";
        char[]ck=miami.toCharArray();
        for(char ckk:ck){
            if(Character.isDigit(ckk)){
                mi+=ckk;
            }
        }
Integer miamiBluePrice=Integer.parseInt(mi);

        Integer TotOfMiamiBluAndCarWhe=carWheel+miamiBluePrice;
        Assert.assertEquals(eqpp2,TotOfMiamiBluAndCarWhe);





 //14.Verify that total price is the sum of base price + Price for Equipment + Delivery, Processing and Handling Fee

        String total2=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[8]")).getText();//70550
        String tot2=total.substring(1);
        String tt2="";
        char[]ttt2=tot2.toCharArray();
        for(char tall2:ttt2){
            if(Character.isDigit(tall2)){
                tt2+=tall2;
            }
        }
        Integer totaa2=Integer.parseInt(tt2);


        //overall tyotal of the car
        Integer totalCar12=eqpp2+delive+prii2;
        System.out.println(totalCar12);
        Assert.assertEquals(totaa2,totalCar);



                      //15.Select seats ‘Power Sport Seats (14-way) with Memory Package’
                        Thread.sleep(2000);
                        //selnium is not seeing the page so i have to scroll down the page

                        JavascriptExecutor jse = (JavascriptExecutor)driver;    //these works but you have to see the flow of the page and didicut the number of scrolls
                        jse.executeScript("window.scrollBy(0,1000)", "");



                         WebElement seat=driver.findElement(By.xpath("//span[@id='s_interieur_x_PP06']"));
                         seat.click();

                   //and it price is ===i am going to use it for next testcase
        String ssee=driver.findElement(By.xpath("(//div[@class='pBox'])[8]")).getText();
        String sse=ssee.substring(1);
        String seatPri="";
        char []chk=sse.toCharArray();
        for(char chkk:chk){
            if(Character.isDigit(chkk)){
                seatPri+=chkk;
            }
        }
Integer seatPRice=Integer.parseInt(seatPri);
        System.out.println(seatPRice);


//         16.Verify that Price for Equipment is the sum of Miami Blue price + 20" Carrera Sport Wheels + Power Sport Seats (14-way) with Memory Package

                String eqp3=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[6]")).getText();
                String ll3=eqp12.substring(1);
                String lk3="";
                char[]llk3=ll2.toCharArray();
                for(char kkk3:llk3){
                    if(Character.isDigit(kkk3)){
                        lk3+=kkk3;
                    }
                }
                Integer eqpp3=Integer.parseInt(lk3);

                Integer equ3=miamiBluePrice + carWheel ;
                equ3+=seatPRice;
               //Assert.assertEquals(eqpp3,equ3);

        //17.Verify that total price is the sum of base price + Price for Equipment + Delivery, Processing and Handling Fee
           //totall price

        String total3=driver.findElement(By.xpath("(//div[@class='ccaPrice'])[8]")).getText();//70550
        String tot3=total.substring(1);
        String tt3="";
        char[]ttt3=tot3.toCharArray();
        for(char tall3:ttt3){
            if(Character.isDigit(tall3)){
                tt3+=tall3;
            }
        }
        Integer totaa3=Integer.parseInt(tt3);
        System.out.println(totaa3);



Integer totl3=delive;

                                //18.Click on Interior Carbon Fiber


                                JavascriptExecutor jse1 = (JavascriptExecutor)driver;    //these works but you have to see the flow of the page and didicut the number of scrolls
                               jse1.executeScript("window.scrollBy(0,1000)", "");
                               WebElement interorCrabonFiber=driver.findElement(By.xpath("(//div[@class='position_wrapper'])[15]"));
                               interorCrabonFiber.click();


//19.Select Interior Trim in Carbon Fiber i.c.w. Standard Interior
        WebElement standardInterior=driver.findElement(By.xpath("//span[@id='vs_table_IIC_x_PEKH_x_c01_PEKH']"));
        standardInterior.click();
        String standardInteriorPrice=driver.findElement(By.xpath("(//div[@class='pBox'])[117]")).getText();
        String standardInteriorPric=standardInteriorPrice.substring(1);
        String standardInteriorPri="";
        char[]chpr=standardInteriorPric.toCharArray();
        for(char chr:chpr){
            if(Character.isDigit(chr)){
                standardInteriorPri+=chr;
            }
        }

Integer standardInteriorPri1=Integer.parseInt(standardInteriorPri);
//20.Verify that Price for Equipment is the sum of Miami Blue price + 20" Carrera Sport Wheels + Power Sport Seats (14-way) with Memory Package + Interior Trim in Carbon Fiber i.c.w. Standard Interior

  String priceforEquipment=driver.findElement(By.xpath("(//div[@class='ccaLabel'])[7]")).getText();
  String pricforEquipment=priceforEquipment.substring(1);
  String priforEpmentt="";
  char []cht=pricforEquipment.toCharArray();
  for(char chtt:cht){
      if(Character.isDigit(chtt)){
          priforEpmentt+=chtt;
      }
  }
Integer priceforEquipmen=Integer.parseInt(priforEpmentt);
  Integer totalAfterStandardInterior=standardInteriorPri1+seatPRice+miamiBluePrice+ carWheel;
//Assert.assertEquals(priceforEquipmen,totalAfterStandardInterior);

       // 21.Verify that total price is the sum of base price + Price for Equipment + Delivery, Processing and Handling Fee

String totalPriceAfterStandardInterior=driver.findElement(By.xpath("//div[@class='ccaPrice']")).getText();























































    }
    }

