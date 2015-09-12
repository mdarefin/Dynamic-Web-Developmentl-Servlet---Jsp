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
                align: center;
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
                <td>70<=ps<=90</td>
                <td>40<=pd<=60</td>		
                <td>Low Blood Pressure</td>
            </tr>
            <tr>
                <td>90<ps<=120</td>
                <td>60<pd<=80</td>		
                <td>Ideal Blood Pressure</td>
            </tr>
            <tr>
                <td>120<ps<=140	</td>
                <td>80<pd<=90</td>		
                <td>Pre-High Blood Pressure</td>
            </tr>
            <tr>
                <td>ps>140</td>
                <td>pd>90</td>		
                <td>High Blood Pressure</td>
            </tr>
        </table>
        <p>Today's date is <%=date%></p>
    </body>
</html>
