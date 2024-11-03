package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
// Responsibility of the Class is to give the value of by Key

    public static String readKey(String key) {
        // Uses Legacy 1.2 JDK, - old
        Properties properties = new Properties();

        try{
            // Read the data.properties and give the key -> value
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/data.properties");
            properties.load(fileInputStream);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return properties.getProperty(key);
    }
}
