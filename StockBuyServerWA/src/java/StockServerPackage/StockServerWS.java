//retrun stock list at given price range  
package StockServerPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "StockServerWS")
public class StockServerWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "StockRangeOP")
    public String StockRangeOP(@WebParam(name = "priceRange") String priceRange) {

        //creating string array and variable
        String outStocks = "";

        //creating a 2D string array to hold stocks name and price
        String stockNamePrice[][] = new String[7][7];

        //populatino the 2D string array
        stockNamePrice[0][0] = "Apple";
        stockNamePrice[0][1] = "112";
        stockNamePrice[1][0] = "Shell";
        stockNamePrice[1][1] = "55";
        stockNamePrice[2][0] = "Bayer";
        stockNamePrice[2][1] = "126";
        stockNamePrice[3][0] = "Google";
        stockNamePrice[3][1] = "644";
        stockNamePrice[4][0] = "Microsoft";
        stockNamePrice[4][1] = "47";
        stockNamePrice[5][0] = "Facebook";
        stockNamePrice[5][1] = "93";
        stockNamePrice[6][0] = "Boeing";
        stockNamePrice[6][1] = "140";

        //checking the stock(s) that match the user's price
        if (priceRange.equalsIgnoreCase("lt50")) {
            for (int i = 0; i < stockNamePrice.length; i++) {
                if (Integer.parseInt(stockNamePrice[i][1]) < 50) {
                    outStocks += stockNamePrice[i][0] + " " + stockNamePrice[i][1]+"-";
                }
            }
        }
        else if (priceRange.equalsIgnoreCase("gte50lt100")) {
            for (int i = 0; i < stockNamePrice.length; i++) {
                if (Integer.parseInt(stockNamePrice[i][1]) > 50 && Integer.parseInt(stockNamePrice[i][1]) <100) {
                    outStocks += stockNamePrice[i][0] + " " + stockNamePrice[i][1]+"-";
                }
            }
        }
        else if (priceRange.equalsIgnoreCase("gte100lt200")) {
            for (int i = 0; i < stockNamePrice.length; i++) {
                if (Integer.parseInt(stockNamePrice[i][1]) >= 100 && Integer.parseInt(stockNamePrice[i][1]) <200) {
                    outStocks += stockNamePrice[i][0] + " " + stockNamePrice[i][1]+"-";
                }
            }
        }
        else if (priceRange.equalsIgnoreCase("gte200")) {
            for (int i = 0; i < stockNamePrice.length; i++) {
                if (Integer.parseInt(stockNamePrice[i][1]) >= 200) {
                    outStocks += stockNamePrice[i][0] + " " + stockNamePrice[i][1]+"-";
                }
            }
        }

        return outStocks;
    }

}
