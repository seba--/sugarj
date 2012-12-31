/*
 * IndexerTest.java
 * JUnit based test
 *
 * Created on October 17, 2006, 2:02 PM
 */

package com.sun.javaee.blueprints.petstore.search;

import java.util.List;
import junit.framework.*;

/**
 *
 * @author basler
 */
public class IndexerTest extends TestCase {
    
    public IndexerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of addDocument method, of class com.sun.javaee.blueprints.petstore.search.Indexer.
     */
    public void testAddDocument() throws Exception {
        System.out.println("addDocument");
        try {
            // open indexer to dummy file???
            Indexer indexer=new Indexer("/tmp/petstoreIndexTest", true);
            // create dummy doc
            IndexDocument indexDoc=new IndexDocument();
            indexDoc.setUID("PetstoreIndexTest");
            indexDoc.setContents("PetstoreIndexTest");

            // index document
            indexer.addDocument(indexDoc);

            // close indexer
            indexer.close();

            // open searchIndex to see if newly added item exists
            SearchIndex si=new SearchIndex();
            // use dummy default index file for unit tests
            List<IndexDocument> items=si.query("/tmp/petstoreIndexTest", "PetstoreIndexTest");
            if(items.size() != 1) {
                // fail test if exactly one isn't returned
                fail("Index or Search test failed!! The number of items that was returned is = " + items.size());
            }
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    
}
