
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

                Statement statement = dbConnection.createStatement();

                String SQLselect;

                if (request.getParameter("deleteStudentID") != "") {

                    int deleteID = Integer.parseInt(request.getParameter("deleteStudentID"));

                    String command = "DELETE FROM StudentGPARecord WHERE StudentID=" + deleteID;
// 
                    statement.executeUpdate(command);

                    //display the inserted student
                    SQLselect = "SELECT * FROM StudentGPARecord";
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
