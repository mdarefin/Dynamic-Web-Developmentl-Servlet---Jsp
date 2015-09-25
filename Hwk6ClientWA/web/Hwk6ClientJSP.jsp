<%-- 
    Document   : Hwk6ClientJSP
    Created on : Sep 25, 2015, 9:08:53 AM
    Author     : WaLiD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Distance from NY</title>
    </head>
    <body>
        <h1>Distance from NY</h1>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	hwk6serverpackage.Hwk6ServerWS_Service service = new hwk6serverpackage.Hwk6ServerWS_Service();
	hwk6serverpackage.Hwk6ServerWS port = service.getHwk6ServerWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String inputCity = request.getParameter("cityList");
	// TODO process result here
	java.lang.String result = port.hwk6ServerOp(inputCity);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
