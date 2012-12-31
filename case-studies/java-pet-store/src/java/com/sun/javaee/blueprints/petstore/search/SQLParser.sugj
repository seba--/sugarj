/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: SQLParser.java,v 1.10 2007-01-17 18:00:08 basler Exp $ */

package com.sun.javaee.blueprints.petstore.search;

import java.io.File;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import com.sun.javaee.blueprints.petstore.util.PetstoreUtil;
import java.sql.PreparedStatement;

/**
 *
 * @author basler
 */
public class SQLParser {

    private static final boolean bDebug=false;

    /** Creates a new instance of SQLParser */
    public SQLParser() {
    }
    
    
    public void runSQL(String sxIndexFile, Connection conn, String sql, String tagSql) {
        PetstoreUtil.getLogger().log(Level.INFO, "index.sql.statement", sql);
        
        Indexer indexer=null;
        IndexDocument indexDoc=null;
        try {
            // make sure files exist
            File indexFile=new File(sxIndexFile);
            indexFile.mkdirs();
            
            // get indexer
            indexer=new Indexer(sxIndexFile);    

            // create and execute query on provide connection
            Statement statement=conn.createStatement();
            ResultSet result=statement.executeQuery(sql);
            PreparedStatement pstatement=null;
            if(tagSql != null && !tagSql.trim().equals("")) {
                pstatement=conn.prepareStatement(tagSql);
            }
            ResultSet resultx=null;
            String title=null, summary=null, sxId=null;
            StringBuffer sbTags=null;
            while(result.next()) {
                // extract information from row
                title=result.getString("title");
                summary=result.getString("summary");
                sxId=result.getString("id");
                indexDoc=new IndexDocument();
                indexDoc.setUID(sxId);
                indexDoc.setPageURL(sxId);
                indexDoc.setImage(result.getString("image"));
                indexDoc.setPrice(result.getString("price"));
                indexDoc.setProduct(result.getString("product"));
                indexDoc.setDisabled(Integer.toString(result.getInt("disabled")));
                indexDoc.setModifiedDate(result.getString("modifiedDate"));
                indexDoc.setContents(title + " " + summary);
                indexDoc.setTitle(title);
                indexDoc.setSummary(summary);
                
                // add tags, so need to read them in from database
                if(pstatement != null) {
                    pstatement.setString(1, sxId);
                    resultx=pstatement.executeQuery();
                    sbTags=new StringBuffer();
                    while(resultx.next()) {
                        // loop through tags
                        sbTags.append(resultx.getString(1) + " ");
                    }
                }
                indexDoc.setTag(sbTags.toString().trim());
                PetstoreUtil.getLogger().log(Level.INFO, "Adding document to index: " + indexDoc.toString());

                // add doc to index
                indexer.addDocument(indexDoc);
            }

        } catch (Exception e) {
            PetstoreUtil.getLogger().log(Level.WARNING, "index.exception", e);
            e.printStackTrace();
        } finally {
            try {
                // must close file or will not be able to reindex
                if(indexer != null) {
                    indexer.close();
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        // used for unit tests
        SQLParser sp=new SQLParser();
        
        // get connection
        Properties props=new Properties();
        props.put("user", "APP" );
        props.put("password", "APP");    
        // pointbase info
        //Class.forName("com.pointbase.jdbc.jdbcDataSource");
        //Class.forName("com.pointbase.jdbc.jdbcUniversalDriver");
        String driver="org.apache.derby.jdbc.ClientDriver";
        try {
            Class.forName(driver);
            String sxJdbcURL="jdbc:derby://localhost:1527/petstore";
            Connection conn=DriverManager.getConnection(sxJdbcURL, props);        

            sp.runSQL("/tmp/tmp/index", conn, "select itemid \"id\", name \"title\", description \"summary\", imageurl \"image\", listprice \"price\", productid \"product\", '' \"modifiedDate\" from \"APP\".\"ITEM\"", null);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
