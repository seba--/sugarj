<%-- Copyright 2006 Sun Microsystems, Inc. All rights reserved. You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: http://developer.sun.com/berkeley_license.html
$Id: fileuploadTest.jsp,v 1.2 2006-11-02 03:32:43 basler Exp $ --%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="com.sun.javaee.blueprints.petstore.util.PetstoreConstants"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib prefix="ui" uri="http://java.sun.com/blueprints/ui" %>

<html>
    <head>
        <title>Petstore Seller page</title>
        
<script type="text/javascript">
    var doneButton = null;
    
    function testRetFunction(type, data, evt){
        var statusServlet = "http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.servletContext.contextPath}/FileUploadResponseServlet";
        //because of iframeIO problem, initiate another ajax request to get the real response
        var bindArgs = {
            url: statusServlet,
            mimeType: "text/json",
            handle: function (type, json, http) {
                processFUResponse(type, json, http);
                }
         };
         dojo.io.bind(bindArgs);
         
        /***
        // handle successful response here
        var resultx = data.getElementsByTagName("response")[0];
        var message;
        var thumbpath;
        if(resultx) {
            message = resultx.getElementsByTagName("message")[0].childNodes[0].nodeValue;
            thumbpath = resultx.getElementsByTagName("thumbnail")[0].childNodes[0].nodeValue;
        } else {
            // resultx is not set for IE, could be some problem in dojo.iframe, node upload
            var name = document.getElementById("TestFileuploadForm:name").value;
            var firstName = document.getElementById("TestFileuploadForm:firstName").value;
            thumbpath = "";
            message = firstName + ", Thank you for submitting your pet " + name;
        }
        location.href="fileuploadstatus.jsp?message=" + message + "&thumb=" + thumbpath;
        ***/
    }
    
    function processFUResponse(type, json, http) {
        if (typeof json == "string") {
            // in case json is not an object
            json = eval('(' + json + ')');
        }
        var message = json.message;
        var thumbpath = json.thumbnail;
        var productId = json.productid;
        var itemid = json.itemid;
        if (http.status == 401) {
            // captcha error
            doneButton.disabled = false;
            alert("Authorization faild : please enter the correct captcha string");
        } else if (http.status == 500) {
            doneButton.disabled = false;
            alert("Persistence failed : please check if the address is valid");
        } else {
            // fileupload complete
            var thumbpath = json.thumbnail;
            location.href="fileuploadstatus.jsp?message=" + message + "&id=" + itemid + "&productId=" + productId + "&thumb=" + thumbpath;
        }
    }

   function storeCookie() {
       currentcap = "j_captcha_response="+document.getElementById("TestFileuploadForm:captcharesponse").value;
       document.cookie = currentcap;
   }
   
   function extractCity(citystatezip) {
       var index = citystatezip.indexOf(',');
       var nextcity = citystatezip.substring(0, index+4);
       return nextcity; 
   }

   function chooseCity(city) {
       var index = city.indexOf(',');
       var state = city.substring(index+2, index+4);
       var zip = city.substring(index+5);
       city = city.substring(0, index);
       
       document.getElementById('TestFileuploadForm:cityField').value = city;
       document.getElementById('TestFileuploadForm:stateField').value = state;
       document.getElementById('TestFileuploadForm:zipField').value = zip;
   }
   
   function fileuploadOnsubmit() {
       doneButton = this.parent.doneButton;
       doneButton.disabled = true;
       storeCookie()
       document.forms['TestFileuploadForm'].onsubmit();
   }
   
   function showFU() {
       document.getElementById("fucomponent").style.visibility = "visible";
   }
   
   
    function props(namex) {
        var listx="";
        var ob=dojo.byId(namex);
        for(xx in ob) {
            listx += xx + " = " + ob[xx] + "<br>"
        }
        document.write(listx);
        //alert(listx);
    }   
</script>
    </head>
    <body onload="showFU()">
        <jsp:include page="banner.jsp"/>
        <br/>
        <div id="fucomponent" style="visibility:hidden;">
        <f:view>
    
            <ui:fileUploadTag id="TestFileuploadForm" serverLocationDir="#{FileUploadBean.uploadImageDirectory}" 
                postProcessingMethod="#{FileUploadBean.postProcessingMethod}"
                retMimeType="text/xml" retFunction="testRetFunction" 
                progressBarDivId="progress" progressBarSize="40">
                
                <script type="text/javascript">
                    dojo.require("dojo.widget.Wizard");
                </script>
                <div id="wizard1" dojoType="WizardContainer" style="width: 100px; height: 500px;"
                     hideDisabledButtons="true" doneButtonLabel="Submit"
                     nextButtonLabel="Next >>" previousButtonLabel="<< Previous" >
                    <div dojoType="WizardPane">
                        <h:panelGrid columns="2">
                            <f:facet name="header">
                                <h:outputText value="Information about your pet"/>
                            </f:facet>
                            
                            <h:outputText value="Category"/>
                            <h:selectOneMenu id="product">
                                <f:selectItems value="#{FileUploadBean.products}"/>
                            </h:selectOneMenu>
                            
                            <h:outputText value="Pet's Name"/>
                            <h:inputText size="20" id="name"></h:inputText>
                            
                            <h:outputText value="Description"/>
                            <h:inputTextarea id="description" cols="20" rows="5"></h:inputTextarea>
                            
                            <h:outputText value="Price"/>
                            <h:inputText size="20" id="price"></h:inputText>
                            
                            <h:outputText value="Image File"/>                 
                            <input type="file" size="20" name="fileToUpload" id="fileToUploadId"/>
                        </h:panelGrid>
                    </div>
                    <div dojoType="WizardPane" canGoBack="true" doneFunction="fileuploadOnsubmit">
                        <h:panelGrid columns="2">
                            <f:facet name="header">
                                <h:outputText value="Information about yourself"/>
                            </f:facet>
                            <h:outputText value="First Name"/>
                            <h:inputText size="20" id="firstName"></h:inputText>
                            <h:outputText value="Last Name"/>
                            <h:inputText size="20" id="lastName"></h:inputText>
                            <h:outputText value="Seller Email"/>
                            <h:inputText size="20" id="email"></h:inputText>
                            <h:outputText value="Street"/>
                            <h:inputText size="20" id="street1" onclick="alert('x,y=' + event.pageX + ',' + event.pageY)"></h:inputText>
                            <h:outputText value="City"/>
                            <ui:autoComplete size="20" maxlength="100" id="cityField"
                            completionMethod="#{AutocompleteBean.completeCity}"
                            value="#{AddressBean.city}" required="true"
                            ondisplay="function(item) { return extractCity(item); }"
                            onchoose="function(item) { return chooseCity(item); }" />
                            <h:outputText value="State"/>
                            <ui:autoComplete size="2"  maxlength="100" id="stateField" 
                            completionMethod="#{AutocompleteBean.completeState}" 
                            value="#{AddressBean.state}" required="true" />
                            <h:outputText value="Zip"/>
                            <h:inputText size="5" id="zipField" value="#{AddressBean.zip}" required="true" />

                            <h:outputText value="Enter the text as it is shown below (case insensitive)"/>
                            <h:outputText />
                            <h:graphicImage id="captchaImg" url="CaptchaServlet"/>
                            <h:inputText id="captcharesponse"></h:inputText>
                          
                        </h:panelGrid>
                    </div>
                </div>
                <br><div id="progress"></div><br/>
            </ui:fileUploadTag>        
        </f:view>
        </div>
<script type="text/javascript">  

    /**
     * Start the autocompletion process, and begin asynchronous communication
     * with the host on each keystroke.
     */
    TestFileuploadForm_cityField.start = function() {
        // Calculate size and position of the menu <div> we will use
        //props("TestFileuploadForm:cityField");
        //alert("x - y = " + this._x() + " - " + this._y());
        
        //this.menu.style.left = this._x() + "px";
        this.menu.style.left = (this._x() - 9) + "px";
        //this.menu.style.left ="500px";
        
        //this.menu.style.top = this._y() + this.target.offsetHeight + 2 + "px";
        this.menu.style.top = ((this._y() + this.target.offsetHeight + 2) - 125) + "px";
        //this.menu.style.top = "155px";
        
        var width = this._width();
        if (width > 0) {
          this.menu.style.width = width + "px";
        }
        
        //alert("left - top = " + this.menu.style.left + " - " + this.menu.style.top + " - " + this.menu.style.position);
        this.started = true;
        this._callback();

    }        
    
    TestFileuploadForm_stateField.start = function() {

        // Calculate size and position of the menu <div> we will use
        //this.menu.style.left = this._x() + "px";
        this.menu.style.left = (this._x() - 9) + "px";
        
        //this.menu.style.top = this._y() + this.target.offsetHeight + 2 + "px";
        this.menu.style.top = ((this._y() + this.target.offsetHeight + 2) - 125) + "px";
        
        var width = this._width();
        if (width > 0) {
          this.menu.style.width = width + "px";
        }
        
        this.started = true;
        this._callback();

    }        
    
</script>        
    <jsp:include page="footer.jsp" />    
    </body>
</html>

