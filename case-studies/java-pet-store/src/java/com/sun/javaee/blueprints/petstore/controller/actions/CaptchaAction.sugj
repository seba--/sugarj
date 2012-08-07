/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: CaptchaAction.java,v 1.2 2007-01-17 18:00:06 basler Exp $ */

package com.sun.javaee.blueprints.petstore.controller.actions;

import com.sun.javaee.blueprints.petstore.captcha.SimpleCaptcha;
import com.sun.javaee.blueprints.petstore.controller.ControllerAction;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * This action class serves up captcha.
 * @author Yutaka Yoshida
 * @author Inderjeet Singh
 */
public class CaptchaAction implements ControllerAction {
    
    public static final String CAPTCHA_KEY = "captcha_key";
    public static final String CAPTCHA_STRING = "captcha_string";
    
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
        SimpleCaptcha captcha = new SimpleCaptcha();
        // just in case... not really necessary to store the session id here
        HttpSession session = request.getSession();
        session.setAttribute(CAPTCHA_KEY, session.getId());
        String cstring = captcha.generateCaptchaString(5);
        session.setAttribute(CAPTCHA_STRING, cstring);
        BufferedImage bimg = captcha.getCaptchaImage(cstring);
        
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();
        ImageIO.write(bimg, "jpeg", out);
        out.flush();
        out.close();
    }
}
