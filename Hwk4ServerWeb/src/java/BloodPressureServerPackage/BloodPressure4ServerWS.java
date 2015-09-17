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
        if ((inputps >= 70 && inputps < 90) && (inputpd >= 40 && inputpd < 60)) {
            pressureStatus = "low blood pressure";
        } //Check the pressure range input fall into Ideal Blood Pressure 
        else if ((inputps >= 90 && inputps < 120) && (inputpd >= 60 && inputpd < 80)) {

            pressureStatus = "Ideal Blood Pressure";

        } //Check the pressure range input fall into Pre-High Blood Pressure
        else if ((inputps >= 120 && inputps < 140) && (inputpd >= 80 && inputpd < 90)) {

            pressureStatus = "Pre-High Blood Pressure";

        } //Check the pressure range input fall into High Blood Pressure
        else if (inputps > 140 && inputpd > 90) {

            pressureStatus = "Pre-High Blood Pressure";
        } else {
            pressureStatus = "Unkonwn Status";
        }

        return "Your systolic pressure of " + inputps
                + " and your diastolic pressure of " + inputpd
                + " Your Boold Pressure Status: " + pressureStatus;
    }
}
