
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
        <title>StudentGPA</title>
    </head>
    <body>
        <h1>Student GPA!</h1>
        <%
            try {
                String database = "jdbc:mysql://localhost:3306/StudentGPA";
                String user = "arefin";
                String password = "abc123";

                //pointer to the driver
                Class.forName("com.mysql.jdbc.Driver");

                //connecting a connection objects 
                Connection dbConnection = DriverManager.getConnection(database, user, password);

                //Creating a SQL command that extract record(s) where
                //actor(s) won Oscar more than once
                //running the SQL string with a Statement class
                Statement statement = dbConnection.createStatement();

                String SQLselect;

                if (request.getParameter("stRecodIDUpdate") != "") {

                    int updateID = Integer.parseInt(request.getParameter("stRecodIDUpdate"));
                    String updateField = request.getParameter("updateField");
                    String updateRecord = request.getParameter("updateRecord");

                    out.print(updateField+" "+ updateRecord);
                    //inserting the data
                   // String command = "UPDATE StudentGPARecord SET"+ updateField+"="+ updateRecord+"WHERE StudentID="+updateID;
                    String command = "UPDATE StudentGPARecord SET GPA = '3.3' WHERE StudentID=102";
// 
                    statement.executeUpdate(command);

                    //display the inserted student
                    SQLselect = "SELECT * FROM StudentGPARecord WHERE StudentID =" + updateID;
                } else {
                    SQLselect = "SELECT * FROM StudentGPARecord";
                }

                String studentRecord = "  ";

                ResultSet result = statement.executeQuery(SQLselect);

                out.println("<table border='3'>");
                out.println("<tr>");
                out.println("<td> ID </td>");
                out.println("<td> firstName </td>");
                out.println("<td> lastName </td>");
                out.println("<td> GPA </td>");
                out.println("</tr>");

                while (result.next()) {
                    out.println("<tr>");
                    out.println("<td>" + result.getInt("StudentID") + "</td> <td>" + result.getString("S_Firstname")
                            + "</td> <td>" + result.getString("S_Lastnam") + " </td><td>" + result.getString("GPA") + "</td>");
                    out.println("</tr>");
                }

                out.println("</table>");

            } catch (Exception e) {
                out.print(e);
            }
        %>
    </body>
</html>
