package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        //this is the path to the location of the file
        String path="configuration.proprties";
        try {
            //java cannot read files directly in needs inputstream to read files
            //inputstream takes the location of the file as a constructor
            FileInputStream fileInputStream=new FileInputStream(path);

            //properties is used to read specifecally properties files,files with key value pairs
            properties=new Properties();

            //file contents are load to properties from the inputstream
            properties.load(fileInputStream);

            //all input streams must be closed
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
 //return the value
    public static String getProperty(String property){
        return properties.getProperty(property);
    }
}
