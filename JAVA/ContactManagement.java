import java.util.ArrayList;
import java.util.Scanner;

class Contact{
    private final String name;
    private final String phoneNumber;
    public Contact(String name,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
class contactManager{
    private final ArrayList<Contact> contacts;
    private static Scanner scanner;
    public contactManager(){
        contacts=new ArrayList<>();
        scanner=new Scanner(System.in);
    }
    public void addContact(){
         String name,phoneNumber;
         System.out.println("Enter your Name,PhoneNumber");
         name=scanner.nextLine();
         phoneNumber=scanner.nextLine();
         if (phoneNumber.length()!=10){
             System.out.println("Give number equal to 10");
             return;
         }
         contacts.add(new Contact(name,phoneNumber));
    }
    void displayContacts(){
           if (contacts.isEmpty()){
               System.out.println("Contact is Empty");
           }
           else{
               System.out.println("Contact List:");
               for (Contact contact:contacts){
                   System.out.println(contact.getName());
                   System.out.println(contact.getPhoneNumber());
               }
           }
    }
    void searchContact(){
         System.out.println("Enter the number to find");
         String contactToFind=scanner.nextLine();
         boolean found=false;
        for (Contact contact:contacts){
             if (contact.getPhoneNumber().equals(contactToFind)){
                 System.out.println("Contact found: " + contact.getName() +"," + contact.getPhoneNumber());
                 found = true;
                 break;
             }
        }
        if(!found){
            System.out.println("Contact Not found");
        }
    }
    void deleteContact(){
        System.out.println("Enter the number to Delete");
        String contactToDelete=scanner.nextLine();
        boolean removed= contacts.removeIf(contact -> contact.getPhoneNumber().equals(contactToDelete));
        if (removed){
            System.out.println("Number deleted Successfully");
        }
        else {
            System.out.println("Number not found");
        }
    }
    public void menu() {
        int choice;
        do {
            System.out.println("\nContact Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> displayContacts();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
public class ContactManagement {
    public static void main(String[] args) {
           contactManager manager = new contactManager();
           manager.menu();
    }
}
