package org.java_gyan.property_demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo {

    public static void main(String[] args) throws IOException, InterruptedException {
        Properties properties=new Properties();
        properties.load(new FileReader("src/main/resources/test.properties"));
        Object testkey = properties.get("testkey");
        while (true)
        {
            System.out.println(testkey);
            Thread.sleep(5000);
        }
    }
}
