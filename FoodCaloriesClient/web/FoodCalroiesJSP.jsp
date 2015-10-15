<%-- 
    Document   : FoodCalroiesJSP
    Created on : Oct 8, 2015, 8:44:21 AM
    Author     : WaLiD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Know your Food</title>
    </head>
    <body>
        <h1>Know Your Food!</h1>


        <%-- start web service invocation --%><hr/>
        <%
            try {
                foodcaloriespackage.FoodCalorisWS_Service service = new foodcaloriespackage.FoodCalorisWS_Service();
                foodcaloriespackage.FoodCalorisWS port = service.getFoodCalorisWSPort();
                // TODO initialize WS operation arguments here
                java.lang.String inputFoodIteam = request.getParameter("fdRadio");
                // TODO process result here
                java.lang.String result = port.foodCarbServerOP(inputFoodIteam);

                String[] foodCalriesChart = result.split("-");

                out.println("<table border='3'>");
                out.println("<tr>");
                out.println("<th colspan=3>Food Calories Charts</th>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<th>Product</th>");
                out.println("<th>Sugar (gr)</th>");
                out.println("<th>Carbs (gr)</th>");
                out.println("</tr>");

                for (int i = 0; i < foodCalriesChart.length-1; i = i + 2) {
                    out.println("<tr>");

                    out.println("<td>");
                    out.println(foodCalriesChart[i]);
                    out.println("</td>");
                    out.println("<td>");
                    out.println(foodCalriesChart[i + 1]);
                    out.println("</td>");
                    out.println("<td>");
                    out.println(foodCalriesChart[i + 2]);
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
