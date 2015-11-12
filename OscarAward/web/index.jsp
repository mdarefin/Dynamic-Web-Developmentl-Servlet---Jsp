<%-- 
    Document   : index
    Created on : Nov 12, 2015, 8:31:27 AM
    Author     : WaLiD
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Oscar win multiple times!</h1>
        <%
            try {
                String database = "jdbc:mysql://localhost:3306/oscarAwardDB";
                String user = "arefin";
                String password = "abc123";

                //pointer to the driver
                Class.forName("com.mysql.jdbc.Driver");

                //connecting a connection objects 
                Connection myconn = DriverManager.getConnection(database, user, password);

                //Creating a SQL command that extract record(s) where
                //actor(s) won Oscar more than once
                //running the SQL string with a Statement class
                Statement mystat = myconn.createStatement();

                String SQLselect = "select bestActor,title,year from oscarAwardTable where bestActor"
                        + " in (select bestActor from oscarAwardTable group by bestActor having count(*)>1)"
                        + "order by bestActor asc";
                String sqlSelectWitInFive = "  ";

                ResultSet result = mystat.executeQuery(SQLselect);

                while (result.next()) {
                    out.println(result.getInt("year") + " " + result.getString("bestActor")
                            + " " + result.getString("title") + "\n");

                }

            } catch (Exception e) {
            }

        %>
    </body>
</html>
