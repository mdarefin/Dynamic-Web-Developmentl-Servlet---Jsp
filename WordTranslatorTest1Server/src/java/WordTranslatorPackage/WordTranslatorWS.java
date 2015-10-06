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
     * This WebService contains Language arrays holding translated word It will
     * give options to translate "Thank you" and "Good morning" to given
     * languages
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

       // languageList.add(new Languages("Shukran", Arabic));

        languageList.add(Arabic);
        languageList.add(Chinese);
        languageList.add(French);
        languageList.add(Hindi);
        languageList.add(German);
        languageList.add(Japanese);
        languageList.add(Spanish);
        languageList.add(Portuguese);

        for (String[] languageArray : languageList) {
            for (String word : languageArray) {
                if (word.equalsIgnoreCase(inputLanguage)) {
                    if (inputWord.equalsIgnoreCase("Thank you")) {
                        translation = languageArray[1];
                    } else if (inputWord.equalsIgnoreCase("Good Morning")) {
                        translation = languageArray[2];
                    }

                }

            }
        }
//        //Approach while parshing through jason data. 
//        int THANK_YOU = 0;
//        int GOOD_MORNING = 1;
//
//        for (Languages l : languageList) {
//            if (l.getLanguage().equalsIgnoreCase(inputLanguage)) {
//                String s = l.getWords()[THANK_YOU];
//                translation = "Thank you";
//            }
//            return l.getWords()[THANK_YOU];
//        }
        return translation;

    }

    //different approch while prashing through jason data
    public class Languages {

        String language;
        String[] words;

        public Languages(String language, String[] words) {
            this.language = language;
            this.words = words;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String[] getWords() {
            return words;
        }

        public void setWords(String[] words) {
            this.words = words;
        }

    }

}
