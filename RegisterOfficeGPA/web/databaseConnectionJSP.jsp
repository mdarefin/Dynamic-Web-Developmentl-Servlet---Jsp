
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
                Connection myconn = DriverManager.getConnection(database, user, password);

                //Creating a SQL command that extract record(s) where
                //actor(s) won Oscar more than once
                //running the SQL string with a Statement class
                Statement mystat = myconn.createStatement();

                String SQLselect = "SELECT * FROM StudentGPARecord";

                String studentRecord = "  ";

                ResultSet result = mystat.executeQuery(SQLselect);

                out.println("<TABLE BORDER='1'>");

                while (result.next()) {
                    out.println(result.getInt("StudentID") + " " + result.getString("S_Firstname")
                            + " " + result.getString("S_Lastnam") + " " + result.getString("GPA") + "\n");
                }

                String[] gpa = studentRecord.split(" ");
                for (String s : gpa) {
                    out.print("working? ");

                    out.println("<tr>" + s + "</tr>");
                }
                out.println("</TABLE>");

                while (result.next()) {
        %>
        <TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                <TH>Name</TH>
            </TR>
            <TR>
                <TD> <%= result.getInt("StudentID")%> </TD>
                <TD> <%=  result.getString("S_Firstname")%> </TD>
            </TR>
        </TABLE>
        <%
                }
            } catch (Exception e) {
                out.print("in catch block " + e);
            }
        %>
    </body>
</html>
