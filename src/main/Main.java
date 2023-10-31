package main;

public class Main {
    public static void main(String[] args) {
        int choice = Menu.mainMenu();

        if (choice == 1) {
            Menu.displayMenu();
        } else if (choice == 2) {
            Menu.addBillMenu();
        } else if (choice == 3) {
            Menu.removeBillMenu();
        } else {
            System.out.println("You have entered an incorrect selection");
        }
    }
}