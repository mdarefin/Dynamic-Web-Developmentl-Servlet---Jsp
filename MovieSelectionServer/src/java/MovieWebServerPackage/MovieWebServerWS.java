//

package MovieWebServerPackage;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName="MovieWebServerWS")
public class MovieWebServerWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "inputSound") String inputSound) {
        //getting the option choice 
        
        List<String> soundList = new ArrayList<>();
        soundList.add("Lion Roaring");
        soundList.add("Tiger Roaring");
        soundList.add("Elephant Mother");
        
        if(soundList.contains(inputSound)){
          return inputSound;
        }
        
        return "return a valid value";
    }


}
