//

package BloodPressureClientPackage;

import javax.jws.WebService;

@WebService(serviceName = "BloodPressure4ServerWS", portName = "BloodPressure4ServerWSPort", endpointInterface = "bloodpressureserverpackage.BloodPressure4ServerWS", targetNamespace = "http://BloodPressureServerPackage/", wsdlLocation = "WEB-INF/wsdl/BloodPressureClientWS/localhost_8080/BloodPressureServerWeb/BloodPressure4ServerWS.wsdl")
public class BloodPressureClientWS 
{

    public java.lang.String bloodPressureServerOp(double inputps, double inputpd) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
