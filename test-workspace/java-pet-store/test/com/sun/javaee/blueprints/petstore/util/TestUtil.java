/*
 * TestUtil.java
 *
 * Created on September 20, 2006, 12:45 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.sun.javaee.blueprints.petstore.util;
import com.sun.javaee.blueprints.petstore.captcha.RandomString;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author inder
 */
public class TestUtil {
    
    /** Creates a new instance of TestUtil */
    public TestUtil() {
    }
 
    public static Graphics createGraphics() {
        BufferedImage bufferImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);        
        return bufferImg.getGraphics();
    }
    private static int width = 200;
    private static int height = 200;
    
    public static String getRandomString() {
        String s = randomString.getString(getRandomPositiveInt());
        if (s.equals("")) {
            s = "a";
        }
        return s;
    }
    private static RandomString randomString = new RandomString();      
    
    public static int getRandomPositiveInt() {
        return getRandomPositiveInt(5000);
    }
    
    public static int getRandomPositiveInt(int range) {
        int i = rd.nextInt();
        if (i == 0) {
            i = 1;
        }
        return Math.min(range, Math.abs(i));
    }
    private static Random rd = new Random();
}
