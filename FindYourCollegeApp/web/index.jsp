<%-- 
    Document   : index
    Created on : Nov 5, 2015, 8:57:29 AM
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
        <h1>Colleges by ZipCode!</h1>
        <form name="hwk11Form">
            Enter ZipCode(first 3 digit)
            <input type="text" name="zipcodeTxtBx" size="3" />
            &nbsp; &nbsp;
            <input type="submit" value="GO" style="background:lightblue">
        </form>
        <!-- Start to connect to database-->
        <%
            
            try{
                //connecintg to myql database: collgesDB
            
            //variables that hold the parameters used for connection
            String database = "jdbc:mysql://localhost:3306/collegesDB";
            String user = "arefin";
            String password = "abc123";
            
            //pointer to the driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //connecting a connection objects 
            Connection myconn = DriverManager.getConnection(database,user,password);
            
            //reding the user input (3 digti) zip code line error
            String zipCodeInput = request.getParameter("zipcodeTxtBx");
            
            //creating a statement object
            Statement mystate = myconn.createStatement();
            
            //creating a SQL select commad 
            String sqlSelect = "select * from colleges_table where substring(zCode,1,3)='" + zipCodeInput + "'";
           
            ResultSet result = mystate.executeQuery(sqlSelect);
            
            if(!result.isBeforeFirst()){
                out.print("found");
            }else{
                out.print("not found");
            }
            //bollen for finding recod
            boolean found = false;
            
            //getting the record
            while(result.next()){
                out.println("this is ");
                found = true;
                
                //getting the college name field
                String collegename = result.getString("cName");
               
            }
                
            }catch(Exception e){
            
            }
            
        %>
        
    </body>
</html>
