//Hwk4: given blood pressure (duastolic and systolic) service return medical status
package BloodPressureServerPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "BloodPressure4ServerWS")
public class BloodPressure4ServerWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BloodPressureServerOp")
    public String BloodPressureServerOp(@WebParam(name = "inputps") double inputps, @WebParam(name = "inputpd") double inputpd) {
        //TODO write your implementation code here:
        return null;
    }
}
