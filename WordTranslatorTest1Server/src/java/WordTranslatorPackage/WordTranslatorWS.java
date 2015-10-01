//
package WordTranslatorPackage;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WordTranslatorWS")
public class WordTranslatorWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "languaeOperation")
    public String languaeOperation(@WebParam(name = "inputWord") String inputWord, @WebParam(name = "inputLanguage") String inputLanguage) {

        //we get word and we will translate the word to other language
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
        languageList.add(Hindi);
        languageList.add(Japanese);
        languageList.add(Spanish);
        languageList.add(Portuguese);

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
