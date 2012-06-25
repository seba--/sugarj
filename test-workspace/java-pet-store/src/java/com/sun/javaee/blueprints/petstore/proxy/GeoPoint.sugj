/*
 * Copyright 2006 Sun Microsystems, Inc.  All rights reserved.
 * You may not modify, use, reproduce, or distribute this
 * software except in compliance with the terms of the License at:
 *
 *   http://developer.sun.com/berkeley_license.html
 *
 * $Id: GeoPoint.java,v 1.1 2006-12-01 03:30:12 sean_brydon Exp $
 */

package com.sun.javaee.blueprints.petstore.proxy;

/**
 * <p>JavaBean describing a single result returned by the GeoCoding service.
 * All of the properties are optional.</p>
 */
public class GeoPoint {

    private double latitude = 0.0;
    private double longitude = 0.0;
    private String address = null;
    private String city = null;
    private String state = null;
    private String zip = null;
    private String country = null;


    // -------------------------------------------------------------- Properties

    public double getLatitude() {
        return this.latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * <p>Return a concise description of the location of this point (without
     * including the latitude and longitude).</p>
     */
    public String toString() {

        StringBuffer sb = new StringBuffer();
        if (address != null) {
            sb.append(address);
        }
        if (city != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(city);
        }
        if (state != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(state);
        }
        if (zip != null) {
            if (sb.length() > 0) {
                sb.append("  ");
            }
            sb.append(zip);
        }
        return sb.toString();
    }
}
