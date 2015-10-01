<%-- 
    Document   : CollegeForm
    Created on : Sep 24, 2015, 9:23:58 AM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>College that offers graduate programs</title>
    </head>
    <body>
        <h1>College that offers graduate programs</h1>

        <%-- start web service invocation --%><hr/>
        
        <%
            try {
                collogeprogramserverpackage.CollogeProgramWS_Service service = new collogeprogramserverpackage.CollogeProgramWS_Service();
                collogeprogramserverpackage.CollogeProgramWS port = service.getCollogeProgramWSPort();

                // reading input from index.html
                java.lang.String inputProgram = request.getParameter("RB");
                java.lang.String inputLocation = request.getParameter("locationList");

                // passing input to the operation
                java.lang.String result = port.collogeProgramOp(inputProgram, inputLocation);

                out.println("Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>

        <%-- end web service invocation --%><hr/>
    </body>
</html>
