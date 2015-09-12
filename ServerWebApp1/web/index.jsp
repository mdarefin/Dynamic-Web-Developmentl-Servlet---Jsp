<%-- 
    Document   : index
    Created on : Sep 12, 2015, 6:03:14 PM
    Author     : WaLiD
--%>
<%@page import="java.util.Date" %>  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assignment One</title>
        <style>
            table {
                width:50%;
                float: center;
            }
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
                text-align: left;
            }
            table#t01 tr:nth-child(even) {
                background-color: #eee;
            }
            table#t01 tr:nth-child(odd) {
                background-color:#fff;
            }
            table#t01 th	{
                background-color: black;
                color: white;
            }
        </style>
    </head>
    <%
        Date date = new Date();
    %>
    <body>
        <h1>Systolic Blood Pressure</h1>
        <table id="t01">
            <tr>
                <th>Systolic(ps)</th>
                <th>Diastolic(pd)</th>		
                <th>Reading</th>
            </tr>
            <tr>
                <td>Jill</td>
                <td>Smith</td>		
                <td>50</td>
            </tr>
            <tr>
                <td>Eve</td>
                <td>Jackson</td>		
                <td>94</td>
            </tr>
            <tr>
                <td>John</td>
                <td>Doe</td>		
                <td>80</td>
            </tr>
        </table>
        <p>Today's date is <%=date%></p>
    </body>
</html>
