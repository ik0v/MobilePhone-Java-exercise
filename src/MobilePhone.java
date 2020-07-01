import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contact> contacts;

    private static Scanner scanner = new Scanner(System.in);

    public MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    public void printContacts() {
        if(contacts.size() ==0) {
            System.out.println("no contacts");
            //scanner.nextLine();
        } else {
            for(int i =0; i<contacts.size(); i++) {
                System.out.println(+i + ". " + contacts.get(i));
            }
        }
    }

    public void addContact() {
        System.out.print("Enter name of new contact:");
        String name = scanner.nextLine();
        if(findIndex(name)<0) {
            System.out.print("Enter phone number of new contact:");
            int number = scanner.nextInt();
            scanner.nextLine();
            contacts.add(new Contact(name, number));
            System.out.println("Added contact: " + name + " -> " + number);
        } else System.out.println(name + " already exists in our list, choose another name");
    }

    public void updateContact() {
        System.out.print("Enter name of contact u want to modify:");
        String name = scanner.nextLine();
        int indeks = findIndex(name);
        if (indeks >= 0) {
            System.out.print("Enter new name:");
            String newName = scanner.nextLine();
            contacts.get(indeks).setName(newName);
            System.out.println("Contact name " + name + " was replaced with " + newName);
        }
        else System.out.println("No valid name selected");
    }

    public boolean findContact(){
        System.out.print("Enter name of contact u want find:");;
        String name = scanner.nextLine();
        if (findIndex(name)>=0) {
            System.out.println(name + " was found in list");
            return true;
        } else {
            System.out.println(name + " was not found in list");
            return false;
        }
    }

    public boolean removeContact() {
        System.out.print("Enter name of contact u want to remove:");
        String name = scanner.nextLine();
        if (findIndex(name)>=0) {
            contacts.remove(findIndex(name));
            System.out.println("Contact with name " + name + " was removed from list");
            return true;
        } else {
            System.out.println("Selected name was not found in list");
            return false;
        }
    }

    private int findIndex(String name) {
        for(int i = 0; i<contacts.size(); i++) {
            if(name.equals(contacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

}

