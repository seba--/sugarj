/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: ImageAction.java,v 1.5 2007-01-17 18:00:06 basler Exp $ */

package com.sun.javaee.blueprints.petstore.controller.actions;

import com.sun.javaee.blueprints.petstore.controller.ControllerAction;
import com.sun.javaee.blueprints.petstore.util.PetstoreConstants;
import com.sun.javaee.blueprints.petstore.util.PetstoreUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Level;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This action class serves up images. The care is taken to serve images that are user-generated
 * @author Mark Basler
 * @author Inderjeet Singh
 */
public class ImageAction implements ControllerAction {
    
    public static final String GIF_SUFFIX = ".gif";
    public static final String JPG_SUFFIX = ".jpg";
    public static final String PNG_SUFFIX = ".png";
    
    private ServletContext context;
    
    public ImageAction(ServletContext context) {
        this.context = context;
    }
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        String pathInfo=request.getPathInfo();
        
        // set proper contentType
        if (pathInfo.endsWith(GIF_SUFFIX)) {
            response.setContentType("image/gif");
        } else if (pathInfo.endsWith(JPG_SUFFIX)) {
            response.setContentType("image/jpeg");
        } else if (pathInfo.endsWith(PNG_SUFFIX)) {
            response.setContentType("image/x-png");
        }
        
        // look for file in default location
        String imagePath=context.getRealPath(pathInfo);
        //if(bDebug) System.out.println("Image path = " + imagePath);
        File imageFile=new File(imagePath);
        if(!imageFile.exists()) {
            
            // not in default location, look in upload location
            imageFile=new File(PetstoreConstants.PETSTORE_IMAGE_DIRECTORY + pathInfo);
            //if(bDebug) System.out.println("Image alter path = " + PetstoreConstants.PETSTORE_IMAGE_DIRECTORY + pathInfo);
            if(!imageFile.exists()) {
                PetstoreUtil.getLogger().log(Level.SEVERE, "image_does_not_exist", PetstoreConstants.PETSTORE_IMAGE_DIRECTORY + pathInfo);
                return;
            }
        }
        
        FileInputStream fis = null;
        FileChannel in = null;
        WritableByteChannel out = null;
        
        // serve up image from proper location
        try {
            fis = new FileInputStream(imageFile);
            in = fis.getChannel();
            out = Channels.newChannel(response.getOutputStream());
            in.transferTo(0, in.size(), out);
        } finally {
            PetstoreUtil.closeIgnoringException(in);
            PetstoreUtil.closeIgnoringException(fis);
            PetstoreUtil.closeIgnoringException(out);
        }
    }
}
