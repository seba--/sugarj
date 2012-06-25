<%-- Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: mapLocation.jsp,v 1.2 2006-11-02 03:32:43 basler Exp $ --%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib prefix="ui" uri="http://java.sun.com/blueprints/ui" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Map Viewer Page</title>
    </head>        
    <body>
        <f:view>
            <h1>Map Viewer Page</h1>
            <h:form id="form1">
                <table>
                    <tr>
                        <td></td>
                        <td colspan="2">
                            Proxy Host:
                            <h:inputText size="30" id="proxyHost" value="#{MapBean.proxyHost}"/>&nbsp;&nbsp;
                            Proxy Port:
                            <h:inputText size="5" id="proxyPort" value="#{MapBean.proxyPort}"/><br>
                            (if proxy necessary, the server.policy also has to be updated. See <a href="docs/mapviewer.html" target="_blank"/>docs</a> for more information)<br><br><br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Information Window Contents:  
                        </td>
                        <td colspan=2>
                            <h:inputText size="100" id="info" value="#{MapBean.info}"/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td colspan=2>
                            Enter the text (if any) for the information window to be displayed over the map center
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Map Center Location: 
                        </td>
                        <td colspan=2>
                            <h:inputText size="100" id="locationx" value="#{MapBean.location}"/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td colspan=2>            
                            Enter any combination of address, city, state, and zip code&nbsp;&nbsp;</div>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan=3>
                            <br>
                            <h:commandButton action="#{MapBean.findItAction}" id="find" type="submit" value="Find It"/>
                            <h:commandButton action="#{MapBean.mapAction}" disabled="#{MapBean.mapReady}" id="map" type="submit" value="Map It"/>
                            <br><br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Found Location: 
                        </td>
                        <td>
                            <h:outputText id="found_address" value="#{MapBean.foundLocation}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Found Coordinates: 
                        </td>
                        <td>
                            Latitude: 
                            <h:outputText id="found_latitude" value="#{MapBean.foundLatitude}"/>
                        </td>
                        <td>
                            Longitude:  
                            <h:outputText id="found_longitude" value="#{MapBean.foundLongitude}"/>                        
                        </td>
                    </tr>
                </table>
            </h:form>
        </f:view>
    </body>
</html>
