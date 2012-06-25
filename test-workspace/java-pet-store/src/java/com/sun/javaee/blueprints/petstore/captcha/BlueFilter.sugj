/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: BlueFilter.java,v 1.7 2007-01-10 23:32:28 basler Exp $ */

package com.sun.javaee.blueprints.petstore.captcha;

import java.awt.image.RGBImageFilter;

/**
 *
 * @author yuta
 */
public class BlueFilter extends RGBImageFilter {
    
    /** Creates a new instance of BlueFilter */
    public BlueFilter() {
        canFilterIndexColorModel = true;
    }
    @Override 
    public int filterRGB(int x, int y, int rgb) {
        return (rgb | 0x000000FF);
    }
}
