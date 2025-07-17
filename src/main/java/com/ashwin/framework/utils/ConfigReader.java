package com.ashwin.framework.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties pr ;


    static {
        try {
            FileInputStream  str = new FileInputStream("/src/test/resources/config.properties");
            pr = new Properties() ;
            pr.load(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key) {
        return pr.getProperty(key);
    }

}
