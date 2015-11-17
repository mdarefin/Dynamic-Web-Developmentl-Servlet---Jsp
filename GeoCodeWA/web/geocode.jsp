<%-- Document   : geocode.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Geocode</h1>
       
        <%@ page import="org.netbeans.saas.*, org.netbeans.saas.google.*" %>

        <%
            try {
                String q = request.getParameter("addressTxtBx");
                String output = request.getParameter("outRB");
                String outputcontent = "";

                RestResponse result = GoogleGeocodingService.geocode(q, output);
                if (result.getResponseCode()==200)
                {
                    outputcontent = result.getDataAsString();
                }
                else out.println("Not Working");
                
                //display contents
                out.println("The SaasService returned: "+result.getDataAsString());
            } catch (Exception ex) {
                ex.printStackTrace();
            }


        %>
    </body>
</html>
