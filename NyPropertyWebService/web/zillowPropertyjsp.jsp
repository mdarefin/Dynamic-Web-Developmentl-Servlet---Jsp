<%-- 
    Document   : zillowPropertyjsp
    Created on : Dec 1, 2015, 8:59:51 AM
    Author     : WaLiD
--%>

<%@page import="org.xml.sax.InputSource"%>
<%@page import="java.io.StringReader"%>
<%@page import="com.sun.jersey.api.client.ClientResponse"%>
<%@page import="com.sun.jersey.api.client.WebResource"%>
<%@page import="com.sun.jersey.api.client.Client"%>
<%@page import="org.w3c.dom.Document"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%@ page import="org.netbeans.saas.*, org.netbeans.saas.zillow.*" %>

        <%

            try {
                String address = "2525 Astoria Blvd";
                String citystatezip = "11102";

                RestResponse result = ZillowRealEstateService.getSearchResults(address, citystatezip);
                if (result.getResponseCode() == 200) {

                    Client client = Client.create();
                    WebResource webResource = client.resource("http://localhost:8080/JerseyXMLExample/rest/xmlServices/send");

                     //ClientResponse response = webResource.accept("application/xml").post(ClientResponse.class, result.getDataAsString());
                    out.println(result.getClass().getName());
                    out.println(result.getDataAsString());

//                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//                    Document doc = dBuilder.parse(result.getContentType());
                    // doc.getDocumentElement().normalize();
                    //out.println("Root element :" + doc.getDocumentElement().getNodeName());
                    ///////////////////////////
                    DocumentBuilder b = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                    InputSource is = new InputSource(new StringReader(result.getDataAsString()));
                    out.println(b.parse(is)); 
                    out.println("The SaasService returned: "+result.getDataAsString());
                }
                //TODO - Uncomment the print Statement below to print result.
                //
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        %>



    </body>
</html>
