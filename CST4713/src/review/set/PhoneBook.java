//
package review.set;

public class PhoneBook {
    
    private String name, phoneNumber;
    
    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public PhoneBook(PhoneBook entry){
        this.name = entry.getName();
        this.phoneNumber = entry.getPhoneNumber();
    }

    private String getName() {
        return name;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }
}
