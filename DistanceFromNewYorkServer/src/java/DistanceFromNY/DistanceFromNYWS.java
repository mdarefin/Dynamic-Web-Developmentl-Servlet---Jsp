//this program will show the distance of other selected city from NY
package DistanceFromNY;

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
        //TODO write your implementation code here:
        return null;
    }

}
