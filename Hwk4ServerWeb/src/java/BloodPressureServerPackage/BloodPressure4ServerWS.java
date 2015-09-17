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

        //crete string variable to hold BllodPressure 
        String pressureStatus = "";

        //Check the pressure range input fall into low blood pressure 
        if (inputps >= 70 && inputps < 90) {
            if (inputpd >= 40 && inputpd < 60) {
                pressureStatus = "low blood pressure";
            }
        }

        //Check the pressure range input fall into Ideal Blood Pressure 
        if (inputps >= 90 && inputps < 120) {
            if (inputpd >= 60 && inputpd < 80) {
                pressureStatus = "Ideal Blood Pressure";
            }
        }

        //Check the pressure range input fall into Pre-High Blood Pressure
        if (inputps >= 120 && inputps < 140) {
            if (inputpd >= 80 && inputpd < 90) {
                pressureStatus = "Pre-High Blood Pressure";
            }
        }

        //Check the pressure range input fall into High Blood Pressure
        if (inputps > 140 && inputpd > 90) {

            pressureStatus = "Pre-High Blood Pressure";
        }

        return "Your systolic pressure of " + inputps
                + " and your diastolic pressure of " + inputpd
                + " Your Boold Pressure Status: " + pressureStatus;
    }
}
