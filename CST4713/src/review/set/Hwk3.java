//Hwk3: Implements an ArrayList
package review.set;

import java.util.ArrayList;

/**
 * @author Md Arefin
 */
public class Hwk3 
{
    public static void main(String[] args) {
        
        //creating a 2-D arrayList 
        ArrayList<PhoneBook> phoneBook = new ArrayList<PhoneBook>();
        
        //populating the arrayList name phoneBook
        PhoneBook jaime = new PhoneBook("Jhon","234232323");
        PhoneBook rob = new PhoneBook("Rob","3135235173");
        
        phoneBook.add(jaime);
        phoneBook.add(rob);
        
        for (PhoneBook phoneBook1 : phoneBook) {
            System.out.println(phoneBook1);
        }
        
    }

}
