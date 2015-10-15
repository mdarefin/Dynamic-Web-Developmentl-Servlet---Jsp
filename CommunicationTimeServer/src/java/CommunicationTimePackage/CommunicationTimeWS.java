//This applicaiton will calculate the user total communication time from now 
package CommunicationTimePackage;

import java.util.Calendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "CommunicationTimeWS")
public class CommunicationTimeWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CommunicationOp")
    public String CommunicationOp(@WebParam(name = "inputAge") String inputAge, @WebParam(name = "inputCommunicateTime") String inputCommunicateTime, @WebParam(name = "retiarementAge") String retiarementAge) {

        //getting today's year
        int year = Calendar.getInstance().get(Calendar.YEAR);
        //calculating how long he is in his job
        int remainingTime = (year - Integer.parseInt(inputAge))-18 ;
        //getting the remaing job time
        int remainingTimeFromRetire = Integer.parseInt(retiarementAge) - remainingTime;
        //converting year to days
        int daysToCommunicate = remainingTimeFromRetire * ((5 * 4) * 12);//5 days in a weeek 4 a month and 12 months a year
        //getting the total transit time of the user
        int communicateTime = Integer.parseInt(inputCommunicateTime) * daysToCommunicate;
        //converting the time to days
        int communicateDays = communicateTime / 24;
        //getting communicate year
        int communicateYear = communicateDays/365;

        return communicateTime+" "+communicateDays+" "+communicateYear;
    }

}
