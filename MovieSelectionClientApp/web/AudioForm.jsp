<%-- Document : Hwk7JSP --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Animal Sounds</title>
    </head>
    <body>
        <h1> Animal Sounds</h1>
        <%
        //reading the input from index.html
            String animalSound = request.getParameter("animalSounds");
        %>
        <!-- playing the sounds with the <audio> tag in case the file is in video format (for example mp4
        then only the sound of the video will be played. If want to play video then use <video> tag -->
        <audio controls>
            <source src ="<% out.println(animalSound);%> ">
        </audio>
    </body>
</html>