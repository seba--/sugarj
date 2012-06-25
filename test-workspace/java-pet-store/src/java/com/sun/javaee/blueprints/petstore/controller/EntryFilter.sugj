/*
 * EntryFilter.java
 *
 * Created on September 7, 2006, 11:19 AM
 */

package com.sun.javaee.blueprints.petstore.controller;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javaee.blueprints.petstore.util.PetstoreUtil;

/**
 * Main security filter
 */

public class EntryFilter implements Filter {
    
    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured.
    private FilterConfig filterConfig = null;
    private String[] entryPages=null;
    private static final boolean bDebug=false;
    
    public EntryFilter() {
    }
    
    
    /**
     *
     * @param request The servlet request we are processing
     * @param result The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        Throwable problem = null;
        try {
            
            // Implement a simple security model for now. Just make sure a session
            // exists for internally used resources except for entry pages and images.
            // This model does require cookies.
            // In the future, programtic security will
            // be needed to match sellers with their products and customers.
            HttpServletRequest httpRequest=(HttpServletRequest)request;
            if(!httpRequest.isRequestedSessionIdValid()) {
                // not a valid session, make sure pages are entry pages or access images
                PetstoreUtil.getLogger().log(Level.FINE,"Do not have Session, have page " + httpRequest.getPathInfo());
                boolean foundx=false;
                String pagex=httpRequest.getPathInfo();
                // if null page then using default welcome mechanism, assume it is an accessable page.
                if(pagex != null) {
                    for(int ii=0; ii < entryPages.length; ii++) {
                        if(pagex.toLowerCase().endsWith(entryPages[ii].toLowerCase())) {
                            foundx=true;
                            break;
                        }
                    }
                    if(!foundx) {
                        // error not an entry page
                        HttpServletResponse httpResponse=(HttpServletResponse)response;
                        httpResponse.sendError(HttpServletResponse.SC_FORBIDDEN);
                        return;
                    }
                }
            }
            
            chain.doFilter(request, response);
        } catch(Throwable t) {
            //
            // If an exception is thrown somewhere down the filter chain,
            // we still want to execute our after processing, and then
            // rethrow the problem after that.
            //
            problem = t;
            t.printStackTrace();
        }
        
        //
        // If there was a problem, we want to rethrow it if it is
        // a known type, otherwise log it.
        //
        if (problem != null) {
            if (problem instanceof ServletException) throw (ServletException)problem;
            if (problem instanceof IOException) throw (IOException)problem;
            sendProcessingError(problem, response);
        }
    }
    
    
    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }
    
    
    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        
        this.filterConfig = filterConfig;
    }
    
    /**
     * Destroy method for this filter
     *
     */
    public void destroy() {
    }
    
    
    /**
     * Init method for this filter
     *
     */
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
        
        // read in allowed access points
        String entryPagesParam=filterConfig.getServletContext().getInitParameter("entryPages");
        if(bDebug) System.out.println("\n*** entry String = " + entryPagesParam);
        // loop through pages to see if
        StringTokenizer stPages=new StringTokenizer(entryPagesParam, "|");
        int countx=stPages.countTokens();
        entryPages=new String[countx];
        for(int ii=0; ii < countx; ii++) {
            entryPages[ii]=stPages.nextToken();
        }
    }
    
    public String toString() {
        if (filterConfig == null) return ("EntryFilter()");
        StringBuffer sb = new StringBuffer("EntryFilter(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
        
    }
    
    
    
    private void sendProcessingError(Throwable t, ServletResponse response) {
        
        String stackTrace = getStackTrace(t);
        if(stackTrace != null && !stackTrace.equals("")) {
            
            try {
                
                response.setContentType("text/html");
                PrintStream ps = new PrintStream(response.getOutputStream());
                PrintWriter pw = new PrintWriter(ps);
                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N
                
                // PENDING! Localize this for next official release
                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");
                pw.print(stackTrace);
                pw.print("</pre></body>\n</html>"); //NOI18N
                PetstoreUtil.closeIgnoringException(pw);
                PetstoreUtil.closeIgnoringException(ps);
                PetstoreUtil.closeIgnoringException(response.getOutputStream());
            } catch(IOException ex){ }
        } else {
            try {
                PrintStream ps = new PrintStream(response.getOutputStream());
                t.printStackTrace(ps);
                PetstoreUtil.closeIgnoringException(ps);
                PetstoreUtil.closeIgnoringException(response.getOutputStream());
            } catch(IOException ex){ }
        }
    }
    
    public static String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        PetstoreUtil.closeIgnoringException(pw);
        PetstoreUtil.closeIgnoringException(sw);
        return sw.getBuffer().toString();
    }
}
