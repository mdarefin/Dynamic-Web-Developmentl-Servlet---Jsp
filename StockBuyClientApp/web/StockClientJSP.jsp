<%-- 
    Document   : StockClientJSP
    Created on : Oct 13, 2015, 9:05:32 AM
    Author     : WaLiD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buy Stock</title>
    </head>
    <body>
        <h1>Buy Stock!</h1>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                stockserverpackage.StockServerWS_Service service = new stockserverpackage.StockServerWS_Service();
                stockserverpackage.StockServerWS port = service.getStockServerWSPort();
                // initialize WS operation arguments here
                java.lang.String priceRange = request.getParameter("pricelist");
                // Passing the price range string to the operation 
                java.lang.String result = port.stockRangeOP(priceRange);
                out.println("Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
