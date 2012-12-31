/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: PetStoreWebBlackBoxTest.java,v 1.1 2006-10-11 23:27:12 inder Exp $ */

package com.sun.javaee.blueprints.petstore.httpunit;

import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.HttpUnitOptions;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebForm;
import com.meterware.httpunit.WebLink;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.httpunit.WebTable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ConnectException;
import junit.framework.*;

/**
 * Black box testing for the Web 2.0 petstore. 
 * This application walks through the various pages of a deployed petstore 
 * application and verifies if they work okay. 
 * @author inder
 */
public class PetStoreWebBlackBoxTest extends TestCase {
    
    private String serverHost;
    private int serverPort;
    private String context;
    
    public PetStoreWebBlackBoxTest(String testName) {
        super(testName);
    }
    
    protected void setUp() throws Exception {
        serverHost = "localhost";
        serverPort = 8080;
        context = "petstore";
    }
    
    protected void tearDown() throws Exception {
    }
    
    public void testBrowseCatalog() throws Exception {
        try {
            // Disable scripting support until HttpUnit has better support for AJAX, Dojo...
            HttpUnitOptions.setScriptingEnabled(false);
            HttpUnitOptions.setExceptionsThrownOnScriptError(false);
            
            // Start with the home page
            WebConversation wc = new WebConversation();
            WebRequest req = new GetMethodWebRequest("http://" + serverHost + ":" + serverPort + "/" + context);
            WebResponse resp = wc.getResponse(req);
            
            testMainPage(wc, resp);
            testSellerPage(wc, resp);
            testSearchPage(wc, resp);
            testCatalogPage(wc, resp);
            testMapPage(wc, resp);
            testTagsPage(wc, resp);
        } catch (ConnectException e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            fail("Could not connect to the server. Received Exception: \n" + sw.toString());
        }
    }
    
    private void testMainPage(WebConversation wc, WebResponse resp) throws Exception {
            // Test the Map page
            WebLink wl = resp.getLinkWith("Enter the Store");
            wl.click();
            resp = wc.getCurrentPage();        
    }
    
    private void testSellerPage(WebConversation wc, WebResponse resp) throws Exception {
            // Test the Map page
            WebLink wl = resp.getLinkWith("Seller");
            wl.click();
            resp = wc.getCurrentPage();        
    }
    
    private void testCatalogPage(WebConversation wc, WebResponse resp) throws Exception {
            // Test the Map page
            WebLink wl = resp.getLinkWith("Catalog");
            wl.click();
            resp = wc.getCurrentPage();        
    }
    
    private void testMapPage(WebConversation wc, WebResponse resp) throws Exception {
            // Test the Map page
            WebLink wl = resp.getLinkWith("Map");
            wl.click();
            resp = wc.getCurrentPage();        
    }
    
    private void testTagsPage(WebConversation wc, WebResponse resp) throws Exception {
            // Test the Tags page
            WebLink wl = resp.getLinkWith("Tags");
            wl.click();
            resp = wc.getCurrentPage();        
    }
    
    /** This method tests the search Page. It also submits a query for cats and 
     * verifies that the result has at least two items */
    private void testSearchPage(WebConversation wc, WebResponse resp) throws Exception {
        // Test the search page
        WebLink wl = resp.getLinkWith("Search");
        wl.click();
        resp = wc.getCurrentPage();
        // check if the search returns more than one result for "cat
        WebForm form = resp.getForms()[0];
        assertEquals("on", form.getParameterValue("searchForm:searchTags"));
        String searchText = "cat";
        form.setParameter("searchForm:searchString", searchText);
        form.submit();
        resp = wc.getCurrentPage();
        WebTable resultTable = resp.getTableStartingWithPrefix("Map");
        assertTrue(resultTable.getRowCount() > 2);
    }
}
