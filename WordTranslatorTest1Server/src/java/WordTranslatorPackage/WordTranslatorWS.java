//
package WordTranslatorPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WordTranslatorWS")
public class WordTranslatorWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "languaeOperation")
    public String languaeOperation(@WebParam(name = "inputWordEng") String inputWordEng, @WebParam(name = "inputWordTranslet") String inputWordTranslet) {

        //we get word and we will translate the word to other language
        String translatedWord = "";

        if (inputWordEng.equalsIgnoreCase("Thank You") || inputWordEng.equalsIgnoreCase("Good morning")) {

            if (inputWordTranslet.equalsIgnoreCase("Arabic") && inputWordEng.equalsIgnoreCase("Thank You")) {
                translatedWord = "shukran";
            } else if (inputWordTranslet.equalsIgnoreCase("Arabic") && inputWordEng.equalsIgnoreCase("Good morning")) {
                translatedWord = "saba il khayr";
            }
            if (inputWordTranslet.equalsIgnoreCase("Chinese") && inputWordEng.equalsIgnoreCase("Thank You")) {
                translatedWord = "xiexie";
            } else if (inputWordTranslet.equalsIgnoreCase("Chinese") && inputWordEng.equalsIgnoreCase("Good morning")) {
                translatedWord = "zaoan";
            }
            if (inputWordTranslet.equalsIgnoreCase("French") && inputWordEng.equalsIgnoreCase("Thank You")) {
                translatedWord = "merci";
            } else if (inputWordTranslet.equalsIgnoreCase("French") && inputWordEng.equalsIgnoreCase("Good morning")) {
                translatedWord = "bonjour";
            }
            if (inputWordTranslet.equalsIgnoreCase("German") && inputWordEng.equalsIgnoreCase("Thank You")) {
                translatedWord = "danke";
            } else if (inputWordTranslet.equalsIgnoreCase("German") && inputWordEng.equalsIgnoreCase("Good morning")) {
                translatedWord = "guten morgen";
            }
            if (inputWordTranslet.equalsIgnoreCase("Hindi") && inputWordEng.equalsIgnoreCase("Thank You")) {
                translatedWord = "dhanyavad";
            } else if (inputWordTranslet.equalsIgnoreCase("Hindi") && inputWordEng.equalsIgnoreCase("Good morning")) {
                translatedWord = "namaste";
            }
            if (inputWordTranslet.equalsIgnoreCase("Japanese") && inputWordEng.equalsIgnoreCase("Thank You")) {
                translatedWord = "domo";
            } else if (inputWordTranslet.equalsIgnoreCase("Japanese") && inputWordEng.equalsIgnoreCase("Good morning")) {
                translatedWord = "ohayo gozaimasu";
            }
            if (inputWordTranslet.equalsIgnoreCase("Spanish") && inputWordEng.equalsIgnoreCase("Thank You")) {
                translatedWord = "gracias";
            } else if (inputWordTranslet.equalsIgnoreCase("Spanish") && inputWordEng.equalsIgnoreCase("Good morning")) {
                translatedWord = "buenos dias";
            }
            if (inputWordTranslet.equalsIgnoreCase("Portuguese") && inputWordEng.equalsIgnoreCase("Thank You")) {
                translatedWord = "obrigado";
            } else if (inputWordTranslet.equalsIgnoreCase("Portuguese") && inputWordEng.equalsIgnoreCase("Good morning")) {
                translatedWord = "bom dia";
            }

        } else {
            translatedWord = "Please Enter Thank You or Good Morning to see their Tranlation";
        }

        return translatedWord;
    }

}
