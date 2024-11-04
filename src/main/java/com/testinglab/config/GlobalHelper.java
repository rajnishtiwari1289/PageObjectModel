package com.testinglab.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalHelper {
    private static Properties frameworkProp= new Properties();

    public static void loadProperty() {
        try {
            FileInputStream propFile = new FileInputStream(new File(System.getProperty("user.dir") + File.separator  + "src" + File.separator + "main"+ File.separator+ "resources"+ File.separator + "Global.properties"));
            frameworkProp.load(propFile);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    public static String getProperty(String propName){
       return frameworkProp.getProperty(propName);
    }
}
