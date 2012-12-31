<%-- Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: persistencetestadd.jsp,v 1.1 2006-09-13 17:31:21 basler Exp $ --%>
<html>
    <head>
        <title>Java[tm] BluePrints Solutions Catalog: Auto ID Generation using Java persistence</title>
    </head>

    <body>
        <%@ page import="java.util.*,java.text.*" %>
        <h2>Add an Item to the catalog
        </h2>
      
        Please enter the item details:
        <form name="additem" action="${pageContext.request.contextPath}/persistencetest/add.do" method="GET">
            <table>
                <tr>
                    <td colspan="2"><b>Item Name:</b></td>
                    <td>
                        <input type="text" size="20" name="item_name">
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><b>Description :</b></td>
                    <td>
                        <input type="text" size="20" name="item_desc">
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><b>Price:</b></td>
                    <td>
                        <input type="text" size="20" name="item_price" ></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add Item">
                    </td>
                </tr>
                <tr>                  
                    <td>
                        <input type="hidden" size="20" name="action" value="add"></td>
                </tr>

            </table>          
        </form>
    </body>
</html>