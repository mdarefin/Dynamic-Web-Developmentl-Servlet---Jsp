package cst4713.review;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author WaLiD
 */
//basic java review 
public class review1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //getting the user inputs
        //using the scanner obj.
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String name = scan.nextLine();
        
        System.out.println("Hello "+name);
        
        System.out.println("What is your street number? ");
        int sNumber = scan.nextInt();
        
        if(!name.equalsIgnoreCase("John")){
            System.out.println("Hello "+name);
        }
        
        System.out.println("Your Street number "+sNumber);
        
        //Using JOption  Swing Library
        String residenceCity = JOptionPane.showInputDialog("What is your city? ");
        JOptionPane.showMessageDialog(null, residenceCity);
        
        //creating n array of numbers
        int[] numberArray = new int[3];
        numberArray[0] = 55;
        numberArray[1] = 66;
        numberArray[2] = 77;  
        
        int counter = 0;
        while(counter < numberArray.length){
            System.out.println(numberArray[counter]);
        }
    }
    
}
