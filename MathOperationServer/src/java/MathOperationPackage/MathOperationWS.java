//
package MathOperationPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "MathOperationWS")
public class MathOperationWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mathOperation")
    public double mathOperation(@WebParam(name = "inputNumOne") double inputNumOne, @WebParam(name = "inputNumTwo") double inputNumTwo, @WebParam(name = "inputChoice") String inputChoice) {

        double number = 0;
        //Getting the number and performation math operation of choice:
        if (inputChoice.equalsIgnoreCase("+")) {
            number = inputNumOne + inputNumTwo;
        }
        if (inputChoice.equalsIgnoreCase("-")) {
            number = inputNumOne - inputNumTwo;
        }
        if (inputChoice.equalsIgnoreCase("*")) {
            number = inputNumOne * inputNumTwo;
        }
        if (inputChoice.equalsIgnoreCase("/")) {
            number = inputNumOne / inputNumTwo;
        }
        return number;
    }

}
