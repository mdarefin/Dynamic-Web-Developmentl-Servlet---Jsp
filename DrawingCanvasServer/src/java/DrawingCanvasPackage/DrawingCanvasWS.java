//

package DrawingCanvasPackage;

import java.util.Arrays;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName="DrawingCanvasWS")
public class DrawingCanvasWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DrawingCanvasOP")
    public String DrawingCanvasOP(@WebParam(name = "shapes") String shapes, @WebParam(name = "color") String color) {
        //creating a variable to hold the values
        String colorAndShape = "";
        
        //selecting the shape color that need to be draw in the server side 
        List<String> shapeList = Arrays.asList("line", "arc", "triangle","square");
        List<String> colorList = Arrays.asList("red","white","blue","red","black");
        
        if(shapeList.contains(shapes.toLowerCase()) && colorList.contains(color.toLowerCase())){
           colorAndShape = shapes+" "+color ; 
        }else{
            colorAndShape = "Enter a valid color and shape";
        }
        
        
        
        return colorAndShape;
    }


}
