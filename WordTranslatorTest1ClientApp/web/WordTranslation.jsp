<%-- 
    Document   : WordTranslation
    Created on : Sep 29, 2015, 8:34:53 AM
    Author     : WaLiD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Word Translation</title>
    </head>
    <body>
        <h1>Translated Word</h1>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                wordtranslatorpackage.WordTranslatorWS_Service service = new wordtranslatorpackage.WordTranslatorWS_Service();
                wordtranslatorpackage.WordTranslatorWS port = service.getWordTranslatorWSPort();
                // TODO initialize WS operation arguments here
                java.lang.String inputWord = request.getParameter("engWord");
                java.lang.String inputLanguage = request.getParameter("languageList");
                // TODO process result here
                java.lang.String result = port.languaeOperation(inputWord, inputLanguage);
                out.println("The English Word " + inputWord + " in " + inputLanguage + " is " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>
    <li> <a href="wordTranslate.html"> Go Back </a> </li>

</body>
</html>
