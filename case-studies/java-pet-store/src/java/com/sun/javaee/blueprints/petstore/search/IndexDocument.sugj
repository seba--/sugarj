/* Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: IndexDocument.java,v 1.12 2007-01-19 21:47:31 basler Exp $ */

package com.sun.javaee.blueprints.petstore.search;

import com.sun.javaee.blueprints.petstore.model.Item;
import java.util.logging.Level;
import com.sun.javaee.blueprints.petstore.util.PetstoreUtil;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * This class is a simple stuctured used to hold petstore indexed info for indexing and search
 * @author basler
 */
public class IndexDocument {
    
    public String uid="", pageURL="", title="", summary="", image="";
    public String modifiedDate="", contents="", price="0", product="", tag="", disabled="0";
    
    
    /** Creates a new instance of indexDocuments */
    public IndexDocument() {
    }

    public IndexDocument(String pageURL, String title, String summary, String image) {
        this.pageURL=pageURL;
        this.title=title;
        this.summary=summary;
        this.image=image;
    }

    public IndexDocument(Item item) {
        this.uid=item.getItemID();
        this.pageURL=item.getItemID();
        this.image=item.getImageURL();
        this.price=item.getPrice().toString();
        this.product=item.getProductID();
        this.modifiedDate=new Date().toString();
        this.contents=item.getName() + " " + item.getDescription();
        this.title=item.getName();
        this.summary=item.getDescription();
        this.tag=item.tagsAsString();        
        this.disabled=Integer.toString(item.getDisabled());
    }
    
    public String getUID() {
        return this.uid;
    }
    public void setUID(String uid) {
        this.uid=uid;
    }
 
    public String getPageURL() {
        return this.pageURL;
    }
    public void setPageURL(String pageURL) {
        this.pageURL=pageURL;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title=title;
    }

    public String getSummary() {
        return this.summary;
    }
    public void setSummary(String summary) {
        this.summary=summary;
    }

    public String getImage() {
        return this.image;
    }
    public void setImage(String image) {
        this.image=image;
    }
    
    public String getModifiedDate() {
        return this.modifiedDate;
    }
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate=modifiedDate;
    }

    
    public String getContents() {
        return this.contents;
    }
    public void setContents(String contents) {
        this.contents=contents;
    }
    
    public float getPriceValue() {
        float fPrice=0f;
        try {
            fPrice=Float.parseFloat(price);
        } catch (NumberFormatException nfe) {
            PetstoreUtil.getLogger().log(Level.SEVERE, "Invalid Price " + nfe);
        }
        return fPrice;
    }

    public String getPrice() {
        return this.price;
    }
    public void setPrice(String price) {
        this.price=price;
    }
    public String getPriceDisplay() {
        return NumberFormat.getCurrencyInstance(Locale.US).format(getPriceValue());
    }

    public String getProduct() {
        return this.product;
    }
    public void setProduct(String product) {
        this.product=product;
    }

    public String getTag() {
        return this.tag;
    }
    public void setTag(String tag) {
        this.tag=tag;
    }
    
    public String getDisabled() {
        return this.disabled;
    }
    public void setDisabled(String disabled) {
        this.disabled=disabled;
    }
    
    
    public String toString() {
        String sxRet=" UID=" + uid + " pageURL=" + pageURL + " title=" + title +
            " summary=" + summary + " image=" + image + 
            " modifiedDate=" + modifiedDate + " contents=" + contents +
            " price=" + price + " product=" + product + " tag=" + tag + " disabled=" + disabled;
        return sxRet;
                
    }

}
