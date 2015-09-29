<%-- 
    Document   : MathOperationJSP
    Created on : Sep 28, 2015, 7:48:47 PM
    Author     : WaLiD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Math Operation</title>
    </head>
    <body>
        <h1>The Math Operation</h1>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                mathoperationpackage.MathOperationWS_Service service = new mathoperationpackage.MathOperationWS_Service();
                mathoperationpackage.MathOperationWS port = service.getMathOperationWSPort();
                
                // getting the number from html files
                double inputNumOne = Double.parseDouble(request.getParameter("firstnum"));
                double inputNumTwo = Double.parseDouble(request.getParameter("secondnum"));
                java.lang.String inputChoice = request.getParameter("operationList");
                
                // compute and displaying the result
                double result = port.mathOperation(inputNumOne, inputNumTwo, inputChoice);
                out.println("Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>
        
            
         <a href="basicMath.html"> Back to the function </a>
            
        
    </body>
</html>
