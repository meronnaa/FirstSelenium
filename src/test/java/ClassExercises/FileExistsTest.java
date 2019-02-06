package ClassExercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExistsTest {

    @Test
    public void test(){
        //get the current folder
        String current=System.getProperty("user.dir");
        System.out.println(current);
//get the user Folder
        String userFolder=System.getProperty("user.home");
        System.out.println(userFolder);
//these iis to find the locatrion of the file
        String path=userFolder  + "/Downloads/classNotes(1)";//these is any file which is under downlaods folder
        System.out.println(path);
//when you use File=====use that comes from java

        //Files.exists(Paths.get):returns true if file exists in the parameter provided
        Assert.assertTrue(Files.exists(Paths.get(path)));

    }
}
