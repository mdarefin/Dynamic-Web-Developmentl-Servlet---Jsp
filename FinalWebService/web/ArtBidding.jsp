
<%@page import="java.text.DecimalFormat"%>
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
                String SQLselectArt, SQLSelectBid;
                int MinimumBid;

                int artID = Integer.parseInt(request.getParameter("ArtForm"));
                int currency = Integer.parseInt(request.getParameter("CurrencyForm"));
                double bidValue = Double.parseDouble(request.getParameter("BidValue"));


                SQLSelectBid = "SELECT MinimumBidding FROM AfricanArt WHERE ID = " + artID;
                ResultSet bidResult = statement.executeQuery(SQLSelectBid);

                //out.println(bidResult.getInt("MinimumBidding"));
                while (bidResult.next()) {
                    MinimumBid = bidResult.getInt("MinimumBidding");
                    
                    if(bidValue > MinimumBid){
                     
                     String updateMinimunBid = "UPDATE AfricanArt SET MinimumBidding ='" + bidValue + "'WHERE ID=" + artID;
                     statement.executeUpdate(updateMinimunBid);
                    }
             
                    if (currency == 00) {
                        if(MinimumBid > bidValue){
                            out.println("Your Bidding value lower then MinimumBid ");
                            
                        }else{
                            out.println("Your bid has been accepted");
                        }
                    }
                    else if (currency == 11) {
                        bidValue = bidValue / 0.6223;
                         if(MinimumBid > bidValue){
                            out.println("Your Bidding value lower then MinimumBid ");
                            
                        }else{
                            out.println("Your bid has been accepted");
                        }
                    }
                    else if (currency == 22) {
                        bidValue = bidValue / 6.31;
                         if(MinimumBid > bidValue){
                            out.println("Your Bidding value lower then MinimumBid ");
                            
                        }else{
                            out.println("Your are bid has been accepted");
                        }
                    }
                    else if (currency == 33) {
                        bidValue = bidValue / 0.7339;
                        if(MinimumBid > bidValue){
                            out.println("Your Bidding value lower then MinimumBid ");
                            
                        }else{
                            out.println("Your bid has been accepted");
                        }
                    }
                    else if (currency == 44) {
                        bidValue = bidValue / 30.15;
                         if(MinimumBid > bidValue){
                            out.println("Your Bidding value lower then MinimumBid ");
                            
                        }else{
                            out.println("Your bid has been accepted");
                        }
                    }
                    else if (currency == 55) {
                        bidValue = bidValue / 79.925;
                         if(MinimumBid > bidValue){
                            out.println("Your Bidding value lower then MinimumBid ");
                            
                        }else{
                            out.println("Your bid has been accepted");
                        }
                    }
                }


            } catch (Exception e) {
                out.print(e);
            }
        %>
    </body>
</html>
