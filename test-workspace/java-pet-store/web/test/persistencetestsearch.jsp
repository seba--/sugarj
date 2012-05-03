<%-- Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: persistencetestsearch.jsp,v 1.1 2006-09-13 17:31:21 basler Exp $ --%>
<html>
    <head>
        <title>Java[tm] BluePrints Solutions Catalog: Auto ID Generation using Java persistence</title>
    </head>

    <body>
        <%@ page import="java.util.*,java.text.*" %>
        <h2>Search for an Item from the catalog
        </h2>
      
        Please enter the item id:
        <form name="finditem" action="${pageContext.request.contextPath}/persistencetest/PersistenceTestServlet" method="GET">
            <table>
                <tr>
                    <td colspan="2"><b>Item ID:</b>
                        <input type="text" size="20" name="item_id">
                    </td>
                </tr>                
                <tr>
                    <td>
                        <input type="submit" value="Search">
                    </td>
                </tr>
                <tr>                  
                    <td>
                        <input type="hidden" size="20" name="action" value="search"></td>
                </tr>
            </table>          
        </form>
    </body>
</html>