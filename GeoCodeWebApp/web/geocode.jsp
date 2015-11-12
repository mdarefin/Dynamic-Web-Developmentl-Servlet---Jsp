<%-- 
    Document   : geocode
    Created on : Nov 12, 2015, 9:24:48 AM
    Author     : WaLiD
--%>

<%@page import="org.netbeans.saas.RestResponse"%>
<%@page import="org.netbeans.saas.google.GoogleGeocodingService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>GeoCode!</h1>


        <%    try {
                String q = request.getParameter("addressTxtBx");
                String output = request.getParameter("outRB");
                String outputcontent = "";
                

                RestResponse result = GoogleGeocodingService.geocode(q, output);
                if(result.getResponseCode()==200){
                    outputcontent = result.getDataAsString();
                }else{
                    out.println("not working");
                }
                    
                //TODO Dispay content
                out.println("The SaasService returned: "+result.getDataAsString());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        %>


    </body>
</html>
