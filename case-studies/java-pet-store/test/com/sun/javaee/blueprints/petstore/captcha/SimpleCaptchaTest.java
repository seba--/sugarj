/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: SimpleCaptchaTest.java,v 1.2 2006-10-11 23:27:11 inder Exp $ */

package com.sun.javaee.blueprints.petstore.captcha;

import com.sun.javaee.blueprints.petstore.util.TestUtil;
import junit.framework.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * JUnit based test 
 * @see com.sun.javaee.blueprints.petstore.captcha.SimpleCaptcha
 * @author inder
 */
public class SimpleCaptchaTest extends TestCase {
    
    public SimpleCaptchaTest(String testName) {
        super(testName);
    }
    
    protected void setUp() throws Exception {
    }
    
    protected void tearDown() throws Exception {
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite(SimpleCaptchaTest.class);
        
        return suite;
    }
    
    /**
     * Test of drawMessage method, of class com.sun.javaee.blueprints.petstore.captcha.SimpleCaptcha.
     */
    public void testDrawMessage() {
        System.out.println("drawMessage");
        
        SimpleCaptcha instance = new SimpleCaptcha();
        instance.drawMessage(TestUtil.createGraphics(), TestUtil.getRandomString());
    }
    
    /**
     * Test of drawRandomLine method, of class com.sun.javaee.blueprints.petstore.captcha.SimpleCaptcha.
     */
    public void testDrawRandomLine() {
        System.out.println("drawRandomLine");
        
        Graphics g = TestUtil.createGraphics();
        int count = TestUtil.getRandomPositiveInt(50);
        SimpleCaptcha instance = new SimpleCaptcha();
        
        instance.drawRandomLine(g, count);
    }
    
    /**
     * Test of validateResponse method, of class com.sun.javaee.blueprints.petstore.captcha.SimpleCaptcha.
     */
    public void testValidateResponse() {
        System.out.println("validateResponse");
        
        String id = TestUtil.getRandomString();
        String text = TestUtil.getRandomString();
        SimpleCaptcha instance = new SimpleCaptcha();
        instance.getCaptchaImageWithId(id);        
        assertTrue(instance.validateResponse(id, text));
    }
    
    /**
     * Test of getCaptchaImageWithId method, of class com.sun.javaee.blueprints.petstore.captcha.SimpleCaptcha.
     */
    public void testGetCaptchaImageWithId() {
        System.out.println("getCaptchaImageWithId");
        
        String id = TestUtil.getRandomString();
        SimpleCaptcha instance = new SimpleCaptcha();
        
        BufferedImage result = instance.getCaptchaImageWithId(id);
        assertNotNull(result);
    }
    
    /**
     * Test of getCaptchaImage method, of class com.sun.javaee.blueprints.petstore.captcha.SimpleCaptcha.
     */
    public void testGetCaptchaImage() {
        System.out.println("getCaptchaImage");
        
        String message = TestUtil.getRandomString();
        SimpleCaptcha instance = new SimpleCaptcha();
        
        BufferedImage result = instance.getCaptchaImage(message);
        assertNotNull(result);
    }
}
