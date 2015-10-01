//Test1ServerWS is translation of word to a given language 
package Test1ServerPackage;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Test1ServerWS")
public class Test1ServerWS {

    /**
     * Web service operation take thank you and good morning word and translate
     * to a given language
     */
    @WebMethod(operationName = "Test1ServerOp")
    public String Test1ServerOp(@WebParam(name = "inputWord") String inputWord, @WebParam(name = "inputLanguage") String inputLanguage) {

        //Create a variable for the out put
        String translation = "";

        List<String[]> languageList = new ArrayList();
        String[] Arabic = {"Arabic", "Shukran", "saba il khayr"};
        String[] Chinese = {"Chinese", "xiexie", "zaoan"};
        String[] French = {"French", "merci", "bonjour"};
        String[] German = {"German", "danke", "guten morgen"};
        String[] Hindi = {"Hindi", "dhanyavad", "namaste"};
        String[] Japanese = {"Japanese", "domo", "ohayo gozaimasu"};
        String[] Spanish = {"Spanish", "gracias", "buenos dias"};
        String[] Portuguese = {"Portuguese", "obrigado", "bom dia"};

        languageList.add(Arabic);
        languageList.add(Chinese);
        languageList.add(French);

        for (String[] langue : languageList) {
            for (String langue1 : langue) {
                if (langue1.equalsIgnoreCase(inputLanguage)) {
                    if (inputWord.equalsIgnoreCase("Thank you ")) {
                        translation = langue[1];
                    } else if (inputWord.equalsIgnoreCase("Good Morning")) {
                        translation = langue[2];
                    }

                }

            }
        }

        return translation;
    }

}
