<%-- 
    Document   : FoodCalroiesJSP
    Created on : Oct 8, 2015, 8:44:21 AM
    Author     : WaLiD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	foodcaloriespackage.FoodCalorisWS_Service service = new foodcaloriespackage.FoodCalorisWS_Service();
	foodcaloriespackage.FoodCalorisWS port = service.getFoodCalorisWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String inputFoodIteam = "";
	// TODO process result here
	java.lang.String result = port.foodCarbServerOP(inputFoodIteam);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
