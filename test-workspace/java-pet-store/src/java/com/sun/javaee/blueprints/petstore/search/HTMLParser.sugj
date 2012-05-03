/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: HTMLParser.java,v 1.13 2007-01-11 17:45:26 basler Exp $ */

package com.sun.javaee.blueprints.petstore.search;


import javax.swing.text.html.parser.ParserDelegator;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTML;
import javax.swing.text.MutableAttributeSet;
import java.util.logging.Level;
import com.sun.javaee.blueprints.petstore.util.PetstoreUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class can crawl a web site indexing appropriate data as best as possible
 * The best way to make use page is indexed with the correct info is to use meta tags in each page
 * and the robots.txt file to index only to appropriate pages
 *
 * @author basler
 */
public class HTMLParser {
    
    private static final boolean bDebug=false;
    
    public static void main(String[] args) {
        HTMLParser hp=new HTMLParser();
        hp.runWeb("http://localhost:8080", "petstore", "main.screen");
        //System.setProperty("http.proxyHost", "129.145.155.150");
        //System.setProperty("http.proxyPort", "8080");
        //hp.runWeb("http://www.amazon.com:80", "gp", "product/B00005UP2K/104-5359565-9034353?v=glance&n=284507&v=glance");
    }
    
    /** Creates a new instance of HTMLParser */
    public HTMLParser() {
    }
    
    public void runWeb(String beginURL, String contextRoot, String pageURI) {
        if(bDebug) System.out.println("WEB Path");
        
        // use hashset to remove like items
        List<String> vtURLs = new ArrayList<String>();
        
        // see if robots.txt file exist
        List<String> vtRobots = getRobots(beginURL, contextRoot);
        
        vtURLs.add("/" + contextRoot + "/" + pageURI);
        Indexer indexer=null;
        IndexDocument indexDoc=null;
        try {
            indexer = new Indexer("/tmp/tmp/index");    // get indexer
            for (String sxURL : vtURLs) {
                if(bDebug) System.out.println("\n\n*** INDEXING " + sxURL);
                if(bDebug) System.out.println("Have - " + sxURL);
                // check robots file
                boolean bIndexPage=true;
                if(vtRobots != null) {
                    for (String sxRobotURL : vtRobots) {
                        if(bDebug) System.out.println("Comparing to - " + sxRobotURL);
                        if(sxURL.startsWith(sxRobotURL)) {
                            // found url
                            if(bDebug) System.out.println("Found URL - " + sxRobotURL + " - " + sxURL);
                            bIndexPage=false;
                            break;
                        }
                    }
                } else {
                    // no robots.text so everything is indexed
                    bIndexPage=true;
                }
                
                // add host:port to URL
                sxURL=beginURL + sxURL;
                
                // parse, index and get forwarding urls
                ParserDelegator pd=new ParserDelegator();
                CallbackHandler cb=new CallbackHandler(vtURLs, bIndexPage,  contextRoot);
                try {
                    URLConnection urlConn=new URL(sxURL).openConnection();
                    urlConn.setUseCaches(false);
                    Date modDate=new Date(urlConn.getLastModified());
                    if(bDebug) System.out.println("\nMatch - " + sxURL + " - Modified Date - " + modDate);
                    
                    BufferedReader bfReader=new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
                    pd.parse(bfReader, cb, true);
                    
                    // check to see if the file should be index
                    if(bIndexPage) {
                        if(bDebug) System.out.println("Adding Index - " + sxURL + "\nContent:" + cb.getText() + "\nSummary:" + cb.getSummary() + "\nTitle:" + cb.getTitle());
                        indexDoc=new IndexDocument();
                        indexDoc.setUID(sxURL + modDate.toString());
                        indexDoc.setPageURL(sxURL);
                        indexDoc.setModifiedDate(modDate.toString());
                        indexDoc.setContents(cb.getText());
                        indexDoc.setTitle(cb.getTitle());
                        indexDoc.setSummary(cb.getSummary());
                        indexer.addDocument(indexDoc);
                    }
                } catch(Exception ee) {
                    PetstoreUtil.getLogger().log(Level.SEVERE, "Inner Exception" + ee);
                }
            }
        } catch (Exception e) {
            PetstoreUtil.getLogger().log(Level.SEVERE, "Outer Exception" + e);
        } finally {
            try {
                if (indexer != null) {
                    indexer.close();
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }
    
    private List<String> getRobots(String beginURL, String contextRoot) {
        List<String> vtRobots = new ArrayList<String> ();
        // read in robots.txt file
        BufferedReader bfReader=null;
        try {
            URL urlx=new URL(beginURL + "/" + contextRoot + "/" + "robots.txt");
            URLConnection urlConn=urlx.openConnection();
            urlConn.setUseCaches(false);
            bfReader=new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String sxLine="";
            while((sxLine=bfReader.readLine()) != null) {
                if(sxLine.startsWith("Disallow:")) {
                    vtRobots.add(sxLine.substring(10));
                }
            }
        } catch(Exception e) {
            PetstoreUtil.getLogger().log(Level.SEVERE, "Exception" + e);
            
            vtRobots=null;
        } finally {
            try {
                if(bfReader != null) {
                    bfReader.close();
                }
            } catch(Exception ee) {}
        }
        
        return vtRobots;
    }
    
    
    //********************************************************************************************
    // * INNER CLASSES
    //********************************************************************************************
    
    private class CallbackHandler extends HTMLEditorKit.ParserCallback {
        private String beginURL, contextRoot;
        private List<String> vtURLs;
        private StringBuffer sbText=new StringBuffer();
        private StringBuffer sbTitle=new StringBuffer();
        private StringBuffer sbSummary=new StringBuffer();
        private int iSummaryMax=200;
        private boolean bSummary=false, bIndexPage=false;
        private String tag=null;
        
        CallbackHandler(List<String> vtURLs, boolean bIndexPage, String contextRoot) {
            super();
            this.contextRoot=contextRoot;
            this.bIndexPage=bIndexPage;
            this.vtURLs=vtURLs;
        }
        
        @Override 
        public void handleSimpleTag(HTML.Tag t, MutableAttributeSet a, int pos) {
            if(bIndexPage) {
                if(t.toString().toLowerCase().equals("meta")) {
                    // meta tag look for description or summary
                    // System.out.println("Simple Tag = '" + t + "'  - attr " + a);
                    String sxName=((String)a.getAttribute(HTML.Attribute.NAME));
                    if(sxName != null) {
                        sxName=sxName.toLowerCase();
                        if(sxName.equals("summary") || sxName.equals("description")) {
                            String sxContent=((String)a.getAttribute(HTML.Attribute.CONTENT));
                            
                            // set so default summary algorythm (text on top of page) doesn't get invoked
                            bSummary=true;
                            
                            // check to make sure summary isn't too big
                            if(sbSummary.length() < iSummaryMax) {
                                if(bDebug) System.out.println("add summary - " + sxContent);
                                sbSummary.append(sxContent);
                            }
                            
                            // always add to text
                            sbText.append(sxContent);
                        } else if(sxName.equals("keywords")) {
                            // add keywords to indexed text
                            sbText.append(((String)a.getAttribute(HTML.Attribute.CONTENT)));
                        }
                    }
                }
            }
        }
        
        @Override 
        public void handleStartTag(HTML.Tag t, MutableAttributeSet a, int pos) {
            
            // if the tag is a link "<a href", if the url doesn't go off site, store it for later indexing
            tag=t.toString().toLowerCase();
            if(tag.equals("a")) {
                // see if href attribute
                // System.out.println("\nStart Tag = '" + t + "'  - attr " + a);
                
                String sxURL=(String)a.getAttribute(HTML.Attribute.HREF);
                if(sxURL != null) {
                    // check to see if URL is local && make sure it isn't a named anchor
                    if(!sxURL.startsWith("http") && !sxURL.startsWith("#")) {
                        // remove named achor portion, should index whole page
                        int iPos1=sxURL.indexOf("#");
                        if(iPos1 != -1) {
                            sxURL=sxURL.substring(0, iPos1);
                        }
                        // remove session if present
                        iPos1=sxURL.indexOf(";");
                        int iPos2=sxURL.indexOf("?");
                        // System.out.println(sxURL + "\nPOS = " + iPos1 + " - " + iPos2);
                        if(iPos1 > -1 && iPos2 > -1 && iPos2 > iPos1) {
                            // found session
                            sxURL=sxURL.substring(0, iPos1) + sxURL.substring(iPos2);
                        }
                        
                        
                        // check to see if url is relative or absolute
                        if(!sxURL.startsWith("/")) {
                            // relative
                            sxURL="/" + contextRoot + "/" + sxURL;
                        }
                        
                        // see if page already in crawler list
                        if(!vtURLs.contains(sxURL)) {
                            // local url that isn't already in list, add to crawler
                            if(bDebug) System.out.println(">>> Adding URL = " + sxURL);
                            vtURLs.add(sxURL);
                        }
                    }
                }
            }
        }
        
        
        @Override 
        public void handleEndTag(HTML.Tag t, int pos) {
            // System.out.println("End Tag = " + t + "  - pos " + pos);
            tag=null;
        }
        
        
        @Override 
        public void handleText(char[] data, int pos) {
            // System.out.println("Tag - Text - " + tag + " - -->" + new String(data) + "<-- - " + pos);
            // all text should be index against this page
            if(bIndexPage) {
                
                // clean the data incase bad html
                String cleanData=cleanParseData(data);
                if(cleanData != null) {
                    if(bDebug) System.out.println("Tag - Text - " + tag + " - -->" + cleanData + "<--");
                    // don't add tags that don't add to the pages description
                    if(tag == null || (!tag.equals("title") && !tag.equals("a") && !tag.equals("style"))) {
                        // not an style or link tag
                        //System.out.println("Tag - Text - " + tag + " - -->" + new String(data) + "<-- - " + pos);
                        sbText.append(cleanData);
                        sbText.append(" ");
                        
                        // add summary ???
                        if(!bSummary && sbSummary.length() < iSummaryMax) {
                            sbSummary.append(cleanData.substring(0, cleanData.length() > iSummaryMax ? iSummaryMax - sbSummary.length() : cleanData.length()));
                            sbSummary.append(" ");
                        }
                    } else if(tag != null && tag.equals("title")) {
                        // if in title tag, also add data to title index
                        sbTitle.append(cleanData);
                        sbTitle.append(" ");
                    }
                }
            }
        }
        
        public String cleanParseData(char[] data) {
            // need to clean up the data that is returned from the parse
            String sxTemp=new String(data).trim();
            // if parse only has one character return ""
            if(sxTemp.length() < 2) {
                sxTemp=null;
            }
            return sxTemp;
        }
        
        public String getText() {
            return sbText.toString();
        }
        public Reader getTextReader() {
            return new StringReader(sbText.toString());
        }
        
        public String getTitle() {
            return sbTitle.toString();
        }
        
        public String getSummary() {
            if(sbSummary.length() < 1) {
                return sbTitle.toString();
            } else {
                return sbSummary.toString();
            }
        }
    }
}
