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

//                if (inputSound.equals("Lion Roaring")) {
//                    out.println("This is Lion Roaring");
//                  }

                // TODO process result here
                java.lang.String result = port.operation(inputSound);
                out.println(" " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
         <audio controls="controls"> 
             <source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176880_1/courses/NYT01_CST_4713_D770_1159_1/Lion%20Roaring%21%21.mp3" />
            <c:choose>
                <c:when test="${"Lion Roaring"}">  <source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176880_1/courses/NYT01_CST_4713_D770_1159_1/Lion%20Roaring%21%21.mp3" />  </c:when> <!-- if condition -->
                <c:when test="${"Tiger Roaring"}"><source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176881_1/courses/NYT01_CST_4713_D770_1159_1/Tiger%20Roar.mp3" /></c:when> <!-- else if condition -->
                <c:when test="${"Tiger Roaring"}"><source src="https://bbhosted.cuny.edu/bbcswebdav/pid-21935832-dt-content-rid-109176879_1/courses/NYT01_CST_4713_D770_1159_1/ElephantBaby-Mother_reunion.mp3" /></c:when>   <!-- else if condition --> 
            </c:choose>


        </audio> 
        <%-- end web service invocation --%><hr/>
    </body>
</html>
