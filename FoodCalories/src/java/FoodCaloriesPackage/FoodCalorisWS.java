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
        foodList.put("Milk", "Sugar 14 gr and Carb 11 g");
        foodList.put("Beer", "Sugar 150	gr and Carb 13 g");
        foodList.put("Soda", "Sugar 39	gr and Carb 36 g");
        foodList.put("Bread", "Sugar 40	gr and Carb 24 g");
        
        if(foodList.containsKey(inputFoodIteam)){
            return  inputFoodIteam+" contains"+ foodList.get(inputFoodIteam);
        }
        
        return "Enter valid value";
    }


}
