//return distance netween New York and given city
package Hwk6ServerPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Hwk6ServerWS")
public class Hwk6ServerWS {

    @WebMethod(operationName = "Hwk6ServerOp")
    public String Hwk6ServerOp(@WebParam(name = "inputCity") String inputCity) {

        //creating a variable to hold the distance
        String distanceNY = "";

        switch (inputCity) {
            case "Paris":
                distanceNY = "3625";
                break;
            case "London":
                distanceNY = "3459";
                break;
            case "Beijing":
                distanceNY = "11012";
                break;
            default:
                distanceNY = "City not in database";
        }

        return "The distance betwen NY and " + inputCity + " is "
                + distanceNY + " miles";
    }

}
