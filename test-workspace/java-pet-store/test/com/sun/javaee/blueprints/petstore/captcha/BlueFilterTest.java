/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: BlueFilterTest.java,v 1.1 2006-09-20 21:28:22 inder Exp $ */

package com.sun.javaee.blueprints.petstore.captcha;

import junit.framework.*;
import java.awt.image.RGBImageFilter;

/**
 * JUnit based test 
 * @see com.sun.javaee.blueprints.petstore.captcha.BlueFilter
 * @author inder
 */
public class BlueFilterTest extends TestCase {
    
    public BlueFilterTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(BlueFilterTest.class);
        
        return suite;
    }

    /**
     * Test of filterRGB method, of class com.sun.javaee.blueprints.petstore.captcha.BlueFilter.
     */
    public void testFilterRGB() {
        System.out.println("filterRGB");
        
        int x = 0;
        int y = 0;
        int rgb = 0x0F0F0F0F;
        BlueFilter instance = new BlueFilter();
        
        int expResult = 0x0F0F0FFF;
        int result = instance.filterRGB(x, y, rgb);
        assertEquals("[rgb,result]=[" + rgb + ", " + result + "]", expResult, result);
    }
    
}
