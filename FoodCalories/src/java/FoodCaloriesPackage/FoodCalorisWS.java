//HWK9 Server side: return amount of suger and carbs amount for a given food 

package FoodCaloriesPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName="FoodCalorisWS")
public class FoodCalorisWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FoodCarbServerOP")
    public String FoodCarbServerOP(@WebParam(name = "inputFoodIteam") String inputFoodIteam) {
        
        //creating a list of food iteam
        Map foodList = new HashMap();
        foodList.put("Milk", "14-11");
        foodList.put("Beer", "150-13");
        foodList.put("Soda", "39-36");
        foodList.put("Bread", "40-24");
        
        if(foodList.containsKey(inputFoodIteam)){
            return  inputFoodIteam+"-"+ foodList.get(inputFoodIteam);
        }
        
        return "Enter valid value";
    }


}
