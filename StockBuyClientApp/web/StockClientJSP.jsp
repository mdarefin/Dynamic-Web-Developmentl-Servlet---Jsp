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
                
                 String result = port.stockRangeOP(priceRange);
                //out.println("Result = " + result);
                
                // Passing the price range string to the operation 
                String outStirng[] = result.split("-");
                
                out.println("<table border='3'>");
                out.println("<tr>");
                out.println("<th colspan=2>Stock</th>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Name</td>");
                out.println("<td>Price(S)</td>");
                out.println("</tr>");
                
                for (int i = 0; i <outStirng.length;i++ ){
                    out.println("<tr>");
                    out.println("<td>");
                    out.println(outStirng[i]);
                    out.println("</td>");
                    out.println("</tr>");
                    
                }
              
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
            
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
