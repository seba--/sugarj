<%-- Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: searchTest.jsp,v 1.3 2006-12-07 01:43:34 inder Exp $ --%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.*, com.sun.javaee.blueprints.petstore.search.SearchIndex, com.sun.javaee.blueprints.petstore.search.IndexDocument, com.sun.javaee.blueprints.petstore.search.IndexDocument, com.sun.javaee.blueprints.petstore.search.UpdateIndex, com.sun.javaee.blueprints.petstore.util.PetstoreConstants"%>

<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
  
<%
    try {
        String searchString=request.getParameter("searchString");
        String indexDirectory=request.getParameter("indexDirectory");
        if(searchString == null) searchString="cat";
        String submit=request.getParameter("submit");
        String submitTag=request.getParameter("submitTag");
        String searchTags=request.getParameter("searchTags");
        String tagKeywords=request.getParameter("tagKeywords");
        
        // perform search
        if(submit != null && searchString != null) {
            // string to search
            SearchIndex si=new SearchIndex();
            // alter search string if tagged
            String searchxx=searchString;
            if(searchTags != null && searchTags.equals("true") && searchString.indexOf(":") < 0) {
                searchxx="contents:" + searchString + " OR tag:" + searchString;
            }
            List<IndexDocument> vtHits=si.query(indexDirectory, searchxx);
            request.setAttribute("searchStringx", searchxx);
            request.setAttribute("numberOfHits", vtHits.size());
            request.setAttribute("hitsx", vtHits);
        }
        
        // perform tagging
        if(submitTag != null && tagKeywords != null) {
            String docId=request.getParameter("docId");
            UpdateIndex update=new UpdateIndex();
            update.updateDocTag(indexDirectory, "tag" , tagKeywords, docId, UpdateIndex.APPEND_FIELD);
        }
        
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>

    <h1>Search Page</h1>
    
    
    <form action="./searchTest.jsp" method="post">
        <table>
            <tr>
                <th align="left">Index File Location:</th>
                <td align="left"><input type="text" size="50" name="indexDirectory" value="<%= PetstoreConstants.PETSTORE_INDEX_DIRECTORY %>"/></td>
            </tr>
            <tr>
                <th>Search String</th>
                <td>
                    <input type="text" size="30" name="searchString" value="<%= searchString %>"/> 
                        Also Search Tags:<input type="checkbox" name="searchTags" value="true" CHECKED/>
                </td>
            </tr>
            <tr>
                <td align="center" colspan="2">
                    <input type="submit" name="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form>
    
    <c:if test="${!empty requestScope.hitsx}">
        <b>${numberOfHits} hits returned for search string:</b> "${searchStringx}"<br>
        <table border="1">
            <c:forEach items="${requestScope.hitsx}" var="docxx">
                <tr>
                    <td>
                        <form action="./searchTest.jsp" method="post">
                            <b>URL:</b>${docxx.pageURL}<br>
                            <b>Title:</b>${docxx.title}<br>
                            <b>Summary:</b>${docxx.summary}<br>
                            <b>Image:</b>${docxx.image}<br>
                            <b>Price:</b>${docxx.price}<br>
                            <b>UID:</b>${docxx.UID}<br>
                            <b>Contents:</b>${docxx.contents}<br>
                            <b>Tag:</b>${docxx.tag}<br>
                            <b>Modified Date:</b>${docxx.modifiedDate}<br><br>
                            Add Tag Keyword(s) <input name="tagKeywords" type="text" size="30"/><br>
                            <input type="hidden" name="docId" value="${docxx.UID}"/><br>
                            <input type="hidden" name="indexDirectory" value="<%= PetstoreConstants.PETSTORE_INDEX_DIRECTORY %>"/>
                            <input type="submit" name="submitTag" value="Submit"/><br><br>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    
    </c:if>
    
    
    </body>
</html>
<%
    } catch(Exception e) {
        e.printStackTrace();
    }
%>