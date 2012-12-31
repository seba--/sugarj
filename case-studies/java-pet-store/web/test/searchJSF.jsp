<%-- Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: searchJSF.jsp,v 1.2 2006-12-07 01:43:34 inder Exp $ --%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.*, com.sun.javaee.blueprints.petstore.search.UpdateIndex, com.sun.javaee.blueprints.petstore.util.PetstoreConstants"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib prefix="ui5" uri="http://java.sun.com/blueprints/ui" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>   
        <jsp:include page="banner.jsp" />
        <center>

            <script type="text/javascript">
                function checkAll() {
                    var elems=dojo.byId("resultsForm").elements;
                    for(ii=0; ii < elems.length; ii++) {
                        if(elems[ii].name.indexOf("mapSelectedItems") >= 0) {
                            elems[ii].checked=true;
                        }
                    }
                    return false;
                }
    
                function uncheckAll() {
                    var elems=dojo.byId("resultsForm").elements;
                    for(ii=0; ii < elems.length; ii++) {
                        if(elems[ii].name.indexOf("mapSelectedItems") >= 0) {
                            elems[ii].checked=false;
                        }
                    }
                    return false;
                }
            </script>        
  
            <f:view>
        
                <ui5:popupTag id="pop1" xmlHttpRequestURL="../lookup.jsp?popupView=2&itemId=" 
                    elementNamePairs="name=value1,description=value2,price=value3,image=imageId">
                    <!-- Used as spaces to center the table, this could be done programmatically,
                    but browser diff, so I left it in the hands of the component user.  The image is located 
                    in the component jar so for retrieval, push it through the faces servlet -->
                    <img id="spaceImage" height="10px" width="5px" src="${pageContext.request.contextPath}/faces/static/META-INF/popup/images/spacer.gif" align="left">
                    <table border="0" width="270px" bgcolor="#ffffff" cellpadding="5" cellspacing="5">
                        <tr>
                            <td align="left" valign="top"><b>Name:</b>
                            <span id="value1">Loading Data...</span></td>
                        </tr>
                        <tr>
                            <td align="left" valign="top"><b>Seller Address:</b>
                            <span id="value2">Loading Data...</span></td>
                        </tr>
                        <tr>
                            <td align="left" valign="top"><b>Price:</b>
                            <span id="value3">Loading Data...</span></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center"><img name="image" id="imageId" src="" 
                            alt="[Loading Image...]" border="2"/></td>
                        </tr>
                    </table>                    
                </ui5:popupTag>            
        
                <h1>Search Page</h1>
                <h:form id="searchForm">
                    <table border="1" cellpadding="5" cellspacing="5" style="border-style:double; width:600px; border-color:darkgreen; padding:5px">
                        <tr>
                            <th>Search String</th>
                            <td>
                                <h:inputText size="50" id="searchString" value="#{SearchBean.searchString}"/>
                                <!-- 
                                Also Search Tags:<h:selectBooleanCheckbox id="searchTags" value="#{SearchBean.searchTags}"/>
                                -->
                            </td>
                        </tr>
                        <tr>
                            <td align="center" colspan="2">
                                <h:commandButton action="#{SearchBean.searchAction}" id="searchSubmit" type="submit" value="Submit"/>
                                <h:commandButton id="searchReset" type="reset" value="Reset"/>
                            </td>
                        </tr>
                    </table>
                    <h:messages/>
                </h:form>
                <br/>
            
                <h:form id="resultsForm">
                    <h:dataTable id="results" border="1" 
                        value="#{SearchBean.hits}" var="item" rendered="#{SearchBean.showResults}"
                        style="border-style:double; width:600px; border-color:darkgreen; padding:5px"
                        cellpadding="5px" cellspacing="5px" >
                
                        <h:column >
                            <f:facet name="header">
                                <h:panelGroup>
                                    <h:outputText value="Map"/><br/>
                                    <h:commandButton image="../images/check_all.gif" onclick="return checkAll()"/>
                                    <h:commandButton image="../images/uncheck_all.gif" onclick="return uncheckAll()"/>
                                </h:panelGroup>
                            </f:facet>
                        
                            <input type="checkbox" name="mapSelectedItems" value="<h:outputText value='#{item.UID}'/>"/>                        
                        
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Name"/>
                            </f:facet>
                            <a href="${pageContext.request.contextPath}/faces/catalog.jsp?pid=<h:outputText value='#{item.product}'/>&itemId=<h:outputText value='#{item.UID}'/>"
                                onmouseover="bpui.popup.show('pop1', event, '<h:outputText value='#{item.UID}'/>')" onmouseout="bpui.popup.hide('pop1')">
                                <h:outputText value="#{item.title}"/>
                            </a>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Description"/>
                            </f:facet>
                            <h:outputText value="#{item.summary}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Price"/>
                            </f:facet>
                            <h:outputText id="price" value="#{item.priceValue}" style="text-align: right">
                                <f:convertNumber type="currency"/>
                            </h:outputText>                        
                        </h:column>
                        <f:facet name="footer">
                            <h:panelGroup>
                                <br/>
                                <center>
                                    <table border=1 cellpadding="5" cellspacing="5">
                                        <tr>
                                            <th align="right">Center Point Address:</th>
                                            <td>
                                                <h:inputText id="centerAddress" value="#{MapBean.centerAddress}" size="50"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th align="right">Area (in Miles):</th>
                                            <td>
                                                <h:inputText id="radius" value="#{MapBean.radius}" size="5"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="center" colspan="2">
                                                <h:commandButton action="#{MapBean.findAllByIDs}" id="mapSubmit" type="submit" 
                                                value="Map Checked Item(s)" rendered="#{SearchBean.showResults}"/>
                                            </td>
                                        </tr>
                                    </table>
                                </center>
                                <br/>
                            </h:panelGroup>
                        </f:facet>
                    </h:dataTable>
                
                    <h:messages/>
                </h:form>
                <br/><br/><br/>
            </f:view>
        </center>
        <jsp:include page="footer.jsp" />
    </body>
</html>
