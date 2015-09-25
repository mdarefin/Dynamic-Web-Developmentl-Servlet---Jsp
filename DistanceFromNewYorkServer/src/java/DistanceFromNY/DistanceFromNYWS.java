//this program will show the distance of other selected city from NY
package DistanceFromNY;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "DistanceFromNYWS")
public class DistanceFromNYWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "inputCity") String inputCity) {
        
        //creating a map with the key of city name and valu of distance 
        Map cityDistance = new HashMap();
        
        cityDistance.put("Paris",3625);
        cityDistance.put("London",3459);
        cityDistance.put("Berlin",3965);
        cityDistance.put("Mexico City",2625);
        cityDistance.put("Rio de Janeiro",4808);
        cityDistance.put("Lagos",5269);
        cityDistance.put("Cairo",5607);
        cityDistance.put("Jerusalem",5694);
        cityDistance.put("Beijing",11012);
        cityDistance.put("Tokyo",6737);
        
        return null;
    }

}
