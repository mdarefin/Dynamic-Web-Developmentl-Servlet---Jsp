
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
        <title>Books Record</title>
    </head>
    <body>
        <h1>Student GPA!</h1>
        <%
            try {
                String database = "jdbc:mysql://localhost:3306/testThreeDB";
                String user = "arefin";
                String password = "abc123";

                //pointer to the driver
                Class.forName("com.mysql.jdbc.Driver");

                //connecting a connection objects 
                Connection dbConnection = DriverManager.getConnection(database, user, password);

                //running the SQL string with a Statement class
                Statement statement = dbConnection.createStatement();

                //getting the selected student
                String SQLselect;
                if (request.getParameter("lastName") != "") { //parameter need to be changed
                    int getName = Integer.parseInt(request.getParameter("lastName"));
                    String studentIDChekc = "";
                    SQLselect = "SELECT * FROM booksDb WHERE A_LastName = " + getName;

                } else {
                    SQLselect = "SELECT * FROM booksDb";
                }

                ResultSet result = statement.executeQuery(SQLselect);

                out.println("<table border='3'>");
                out.println("<tr>");
                out.println("<td> ISBN </td>");
                out.println("<td> Last Name </td>");
                out.println("<td> First Name </td>");
                out.println("<td> Title </td>");
                out.println("<td> Publisher </td>");
                out.println("<td> Year </td>");
                out.println("</tr>");

                while (result.next()) {
                    //search iteam has to change. 
                    out.println("<tr>");
                    out.println("<td>" + result.getInt("ISBN") + 
                                "</td> <td>" + result.getString("A_LastName")+ 
                                "</td> <td>" + result.getString("A_FirstName") + 
                                " </td><td>" + result.getString("Title") + 
                                " </td><td>" + result.getString("Publisher") +
                                " </td><td>" + result.getString("Year") +"</td>");
                    out.println("</tr>");
                }

                out.println("</table>");

            } catch (Exception e) {
                out.print(e);
            }
        %>
    </body>
</html>
