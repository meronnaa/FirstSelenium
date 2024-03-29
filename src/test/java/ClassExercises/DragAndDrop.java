package ClassExercises;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {

    @Test
    public void test(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));
//pass the variable in the correct order,first one is source,second one os target
        actions.dragAndDrop(source,target).perform();

    }
    @Test
    public void test2(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));

        //write the steps for doing the drag and drop operation
        //without using the dragAndDrop();method
        //when we use multiple actions we need to add build() before we perform=======build()  it is an old version in sometimes we need to add to
        actions.
                clickAndHold(source).
                moveToElement(target).
                release().perform();


    }
}
