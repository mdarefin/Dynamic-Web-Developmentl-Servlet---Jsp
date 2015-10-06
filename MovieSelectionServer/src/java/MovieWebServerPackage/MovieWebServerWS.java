//
package MovieWebServerPackage;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.io.FileInputStream;

@WebService(serviceName = "MovieWebServerWS")
public class MovieWebServerWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public void operation(@WebParam(name = "inputSound") String inputSound) {
        //getting the option choice 

        try{

             FileInputStream fis = new FileInputStream("File location.");
             //Player playMP3 = new Player(fis);

             //playMP3.play();

        }  catch(Exception e){
             System.out.println(e);
           }

        List<String> soundList = new ArrayList<>();
        soundList.add("Lion Roaring");
        soundList.add("Tiger Roaring");
        soundList.add("Elephant Mother");

        if (soundList.contains(inputSound)) {
            // inputSound;
           // mediaPlayer.play();
        }

    }

}
