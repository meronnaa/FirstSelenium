package Assignment;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Olympics2016 extends TestBase {
    @BeforeMethod
    public void openBrowser(){
        driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table");
    }

    @Test

    public void olpmp() {
       // driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table");
        List<WebElement> medal = new ArrayList(driver.findElements(By.xpath("(//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[1])[position()<11]")));
        for (int i = 0; i < medal.size() - 1; i++) {
            Integer x = Integer.parseInt(medal.get(i).getText());
            Integer x1 = Integer.parseInt(medal.get(i + 1).getText());
            Assert.assertTrue(x < x1);

        }

        WebElement Noc = driver.findElement(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/thead/tr/th[2]"));
        Noc.click();


        List<WebElement> cont = driver.findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th"));
        for (int i = 0; i < cont.size() - 1; i++) {
            String mm = cont.get(i).getText();
            String kk = cont.get(i + 1).getText();
            System.out.println(cont.get(i).getText());
            Assert.assertTrue(mm.compareTo(kk) < 0);
        }


        List<WebElement> rank = new ArrayList(driver.findElements(By.xpath("(//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[1])[not(td[8])]")));
        for (int i = 0; i < rank.size(); i++) {
            Integer x12 = Integer.parseInt(rank.get(i).getText());
            Integer x13 = Integer.parseInt(rank.get(i + 1).getText());
            Assert.assertFalse(x12 < x13, "assert it is not in assending order");
        }
    }


         @Test
         public String countryOfGreatMedals (String columnName){
          int columnNo = 0;
            switch (columnName.toLowerCase()) {
                case "Gold":
                    columnNo = 3;
                    break;
                case "Silver":
                    columnNo = 4;
                    break;
                case "Bronze":
                    columnNo = 5;
                    break;
                case "Total":
                    columnNo = 6;
                    break;
                    default:
                        System.out.println("Is not a medal");

            }
            WebElement colmun = driver.findElement(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/thead/tr/th[" + columnNo + "]"));
            colmun.click();
            colmun.click();

            return driver.findElement(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th[1]")).getText();
        }


    }









