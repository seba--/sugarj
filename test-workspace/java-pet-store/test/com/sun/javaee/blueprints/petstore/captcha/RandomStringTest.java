/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: RandomStringTest.java,v 1.1 2006-09-20 21:28:22 inder Exp $ */

package com.sun.javaee.blueprints.petstore.captcha;

import com.sun.javaee.blueprints.petstore.util.TestUtil;
import junit.framework.*;

/**
 * JUnit based test 
 * @see com.sun.javaee.blueprints.petstore.captcha.RandomString
 * @author inder
 */
public class RandomStringTest extends TestCase {
    
    public RandomStringTest(String testName) {
        super(testName);
    }
    
    protected void setUp() throws Exception {
    }
    
    protected void tearDown() throws Exception {
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite(RandomStringTest.class);
        
        return suite;
    }
    

    /**
     * Test of getString method, of class com.sun.javaee.blueprints.petstore.captcha.RandomString.
     */
    public void testGetString() {
        System.out.println("getString");
        
        int count = TestUtil.getRandomPositiveInt();
        RandomString instance = new RandomString();
        
        String result = instance.getString(count);
        assertNotNull("String size=" + count, result);
    }
    
    /**
     * Test of getStringfromLong method, of class com.sun.javaee.blueprints.petstore.captcha.RandomString.
     */
    public void testGetStringfromLong() {
        System.out.println("getStringfromLong");
        
        RandomString instance = new RandomString();
        
        String result = instance.getStringfromLong();
        assertNotNull(result);
    }
}
