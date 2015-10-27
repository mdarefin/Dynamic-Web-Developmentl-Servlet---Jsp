/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidtermHA;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @Hibba Abbas
 */
@WebService(serviceName = "MidtermHAServerWS")
public class MidtermHAServerWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MidtermHAOP")
    public Integer MidtermHAOP(@WebParam(name = "inputProgram") String inputProgram,@WebParam(name = "inputType") String inputType) 
    {
       //creating a variable to hold the output
        String type = " ";
        String typepeName = ""; 
        int typepric = 0;
        
        String [] inputPrograms = inputProgram.split(" ");
        String [] inputTypes = inputType.split(" ");
        
        for(int i = 0; i <inputPrograms.length; i++ ){
            
        if (inputPrograms[i].equalsIgnoreCase("Vaccination")||inputPrograms[i].equalsIgnoreCase("Vaccination"))
        {
            type = " Vaccination ";
            if (inputTypes[i].equalsIgnoreCase("rabbies")||inputTypes[i].equalsIgnoreCase("rabbies"))
            {
                typepeName+=" rabbies $20 ";
                typepric += 20;
            }
            else
                if (inputType.equalsIgnoreCase("distemper"))
            {
                typepeName+=" distemper $15 ";
                typepric += 20;
            }
            else
                if (inputType.equalsIgnoreCase("lyme"))
            {
                typepeName+=" lyme $25 ";
                typepric += 25;
            }
            if (inputType.equalsIgnoreCase("corona"))
            {
               // typepriceOutput=" the price is $30";
            }
            else
                if (inputType.equalsIgnoreCase("FeIV"))
            {
               // typepriceOutput=" the price is $20";
            }
            
        }
        else
        if (inputPrograms[i].equalsIgnoreCase("Test")||inputPrograms[i].equalsIgnoreCase("Test"))
        {
            if (inputTypes[i].equalsIgnoreCase("rabbies")||inputTypes[i].equalsIgnoreCase("parasites"))
            {
                typepeName+=" parasites $45 ";
                typepric += 45;
            }
            else
                if (inputType.equalsIgnoreCase("blood"))
            {
                //typepriceOutput= " the price is $55";
                 typepeName+=" blood $55 ";
                typepric += 55;
            }
            else
                if (inputType.equalsIgnoreCase("urogenital"))
            {
                //typepriceOutput=" the price is $70";
            }
        }
        else
        if (inputProgram.equalsIgnoreCase("Special"))
        {
            if (inputType.equalsIgnoreCase("spay"))
            {
                //typepriceOutput=" the price is $220";
                typepeName+=" spay $220 ";
                typepric += 220;
            }
            else
                if (inputType.equalsIgnoreCase("neuter"))
            {
                //typepriceOutput= " the price is $180";
            }
            
        }
       }
        return typepric ;
        
    }

}
