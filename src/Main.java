import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static void printChoice() {
        System.out.println("Options:" +
                "\n 1. Print list of contacts " +
                "\n 2. Add new contact " +
                "\n 3. Update existing contact " +
                "\n 4. Find contact " +
                "\n 5. Remove contact " +
                "\n 6. Print menu again" +
                "\n 7. Quit");
    }

    public static void main(String[] args) {

        MobilePhone mobPhone =  new MobilePhone();
        boolean flag = false;
        printChoice();
        int choice = scanner.nextInt();
        while(flag ==false) {
            switch (choice) {
                case 1:
                    mobPhone.printContacts();
                    break;
                case 2:
                    mobPhone.addContact();
                    break;
                case 3:
                    mobPhone.updateContact();
                    break;
                case 4:
                    mobPhone.findContact();
                    break;
                case 5:
                    mobPhone.removeContact();
                    break;
                case 6:
                    printChoice();
                    break;
                case 7:
                    flag = true;
                    break;
            }
            if(!flag) {
                System.out.println("enter your choice, 6 to print menu");
                choice = scanner.nextInt();
            }
        }

    }
}
