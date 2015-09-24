//Return list of college given 
//program choice (master/PhD) and Location (NY Borough) 
package CollogeProgramServerPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "CollogeProgramWS")
public class CollogeProgramWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CollogeProgramOp")
    public String CollogeProgramOp(@WebParam(name = "inputProgram") String inputProgram,
            @WebParam(name = "inputLocation") String inputLocation) {

        //creating a string variable to hold the list of college choice 
        String collegeChoice = "";

        if (inputProgram.equalsIgnoreCase("Master")) {
            if (inputLocation.equalsIgnoreCase("Brooklyn")) {
                collegeChoice = "Brooklyn College\n" + "Touro Collegen\n" + "NYU Polytechnic";
            } else if (inputLocation.equalsIgnoreCase("Queens")) {
                collegeChoice = "Queens College\n" + "Stony Brook University\n" + "St. John's University";
            } else if (inputLocation.equalsIgnoreCase("Manhattan")) {
                collegeChoice = "Manhattan College\n" + "CUNY Graduate Center\n" + "Columbia University";
            }
        } else if(inputProgram.equalsIgnoreCase("Doctoral")) {
            if (inputLocation.equalsIgnoreCase("Brooklyn")) {
                collegeChoice = "Brooklyn College\n" + "NYU Polytechnic";
            } else if (inputLocation.equalsIgnoreCase("Queens")) {
                collegeChoice =  "Stony Brook University\n" ;
            } else if (inputLocation.equalsIgnoreCase("Manhattan")) {
                collegeChoice =  "CUNY Graduate Center\n" + "Columbia University";
            }
        } else if(inputProgram.equalsIgnoreCase("PhD")){
             if (inputLocation.equalsIgnoreCase("Brooklyn")) {
                collegeChoice = "Brooklyn College\n" + "NYU Polytechnic";
            } else if (inputLocation.equalsIgnoreCase("Queens")) {
                collegeChoice =  "Stony Brook University\n" ;
            } else if (inputLocation.equalsIgnoreCase("Manhattan")) {
                collegeChoice =  "CUNY Graduate Center\n" + "Columbia University";
            }
        }

        return "The possible choices of Colleges that offer "+inputProgram+
                " program in "+inputLocation +" are: "+collegeChoice;
    }

}
