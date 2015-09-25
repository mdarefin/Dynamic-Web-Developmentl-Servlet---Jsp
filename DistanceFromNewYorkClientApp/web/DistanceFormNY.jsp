<%-- 
    Document   : DistanceFormNY
    Created on : Sep 24, 2015, 10:44:16 PM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Distance From NY</title>
    </head>
    <body>
        <h1>Distance From NY</h1>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                distancefromny.DistanceFromNYWS_Service service = new distancefromny.DistanceFromNYWS_Service();
                distancefromny.DistanceFromNYWS port = service.getDistanceFromNYWSPort();
                // TODO initialize WS operation arguments here
                java.lang.String inputCity = "";
                if (inputCity != null) {
                    inputCity = request.getParameter("distanceList");
                }
                
                // TODO process result here
                java.lang.String result = port.operation(inputCity);
                out.println("The Distance From New York to " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
