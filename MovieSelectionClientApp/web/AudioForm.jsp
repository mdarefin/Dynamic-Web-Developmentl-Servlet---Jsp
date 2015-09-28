<%-- 
    Document   : AudioForm.jsp
    Created on : Sep 26, 2015, 5:42:58 PM
    Author     : WaLiD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Audio Selection</title>
    </head>
    <body>
        <h1>Audio Selection</h1>

        <%-- start web service invocation --%><hr/>
        <%
            try {
                moviewebserverpackage.MovieWebServerWS_Service service = new moviewebserverpackage.MovieWebServerWS_Service();
                moviewebserverpackage.MovieWebServerWS port = service.getMovieWebServerWSPort();

                // getting the audio list from the server 
                String inputSound = "audioList";

                if (inputSound.equals("Lion Roaring")) {
        %>
            <embed src="lionKing.mp3" width="240" height="160">;
        <%    }

                // TODO process result here
                java.lang.String result = port.operation(inputSound);
                out.println("Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>
    </body>
</html>
