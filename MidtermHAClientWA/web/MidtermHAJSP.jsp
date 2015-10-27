<%-- 
    Document   : MidtermHAJSP
    Created on : Oct 15, 2015, 9:37:56 AM
    Author     : Class
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
                midtermha.MidtermHAServerWS_Service service = new midtermha.MidtermHAServerWS_Service();
                midtermha.MidtermHAServerWS port = service.getMidtermHAServerWSPort();
                // TODO initialize WS operation arguments here
                java.lang.String inputProgram = request.getParameter("RB");
                java.lang.String inputType = request.getParameter("VaccinationServicesTypes");
                inputProgram += request.getParameter("RC");
                inputType += request.getParameter("TestServicesType");
                // TODO process result here
                java.lang.String result = port.midtermHAOP(inputProgram, inputType);
                out.println("Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>


    </body>
</html>
