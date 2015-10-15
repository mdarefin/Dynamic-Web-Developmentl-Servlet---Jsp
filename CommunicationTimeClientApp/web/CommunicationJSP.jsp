<%-- 
    Document   : CommunicationJSP
    Created on : Oct 15, 2015, 8:58:15 AM
    Author     : WaLiD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Life Span Communicate Hours</title>
    </head>
    <body>
        <h1>Life Span Communicate Hours!</h1>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                communicationtimepackage.CommunicationTimeWS_Service service = new communicationtimepackage.CommunicationTimeWS_Service();
                communicationtimepackage.CommunicationTimeWS port = service.getCommunicationTimeWSPort();
                // TODO initialize WS operation arguments here
                java.lang.String inputAge = request.getParameter("dob");
                java.lang.String inputCommunicateTime = request.getParameter("hours");
                java.lang.String retiarementAge = request.getParameter("retireAge");;
                // TODO process result here
                java.lang.String result = port.communicationOp(inputAge, inputCommunicateTime, retiarementAge);

                String[] communicateTime = result.split(" ");

                out.println("<table border='3'>");
                out.println("<tr>");
                out.println("<th colspan=3>Communicate Time</th>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Hours</td>");
                out.println("<td>Days</td>");
                out.println("<td>Years</td>");
                out.println("</tr>");

                for (int i = 0; i < communicateTime.length - 1; i = i + 2) {
                    out.println("<tr>");

                    out.println("<td>");
                    out.println(communicateTime[i]);
                    out.println("</td>");
                    out.println("<td>");
                    out.println(communicateTime[i + 1]);
                    out.println("</td>");
                    out.println("<td>");
                    out.println(communicateTime[i + 2]);
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
