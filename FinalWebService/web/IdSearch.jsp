
<%@page import="org.omg.PortableInterceptor.SYSTEM_EXCEPTION"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>African Art</title>
    </head>
    <body>
        <h1>African Art!</h1>
        <%
            try {
                String database = "jdbc:mysql://localhost:3306/FinalDatabase";
                String user = "arefin";
                String password = "abc123";

                //pointer to the driver
                Class.forName("com.mysql.jdbc.Driver");

                //connecting a connection objects 
                Connection dbConnection = DriverManager.getConnection(database, user, password);

                //running the SQL string with a Statement class
                Statement statement = dbConnection.createStatement();

                //getting the selected student
                String SQLselectArt,SQLSelectCurrency;
                if (request.getParameter("id") != "") {
                    int getID = Integer.parseInt(request.getParameter("id"));
                    String studentIDChekc = "";
                    SQLselectArt = "SELECT * FROM AfricanArt WHERE ID = " + getID;
                   
                    ResultSet result = statement.executeQuery(SQLselectArt);

                    out.println("<table border='3'>");
                    out.println("<tr>");
                    out.println("<td> ID </td>");
                    out.println("<td> NAME </td>");
                    out.println("<td> Minimum Bidding Value (US$) </td>");
                    out.println("</tr>");

                    while (result.next()) {

                        out.println("<tr>");
                        out.println("<td>" + result.getInt("ID")
                                + "</td> <td>" + result.getString("NAME")
                                + "</td> <td>" + result.getString("MinimumBidding")
                                + "</td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");

                } else {
                    SQLSelectCurrency = "SELECT * FROM CurrencyConversion";
                    ResultSet result = statement.executeQuery(SQLSelectCurrency);

                    out.println("<table border='3'>");
                    out.println("<tr>");
                    out.println("<td> Country Code </td>");
                    out.println("<td> Local Currency (1 unit) </td>");
                    out.println("<td>  US$ </td>");
                    out.println("</tr>");

                    while (result.next()) {

                        out.println("<tr>");
                        out.println("<td>" + result.getInt("CountryCode")
                                + "</td> <td>" + result.getString("LocalCurrency")
                                + "</td> <td>" + result.getString("US")
                                + "</td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");

                }

                String studentRecord = "  ";

            } catch (Exception e) {
                out.print(e);
            }
        %>
    </body>
</html>
