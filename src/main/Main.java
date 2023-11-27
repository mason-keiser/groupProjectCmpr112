package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = initUser(new User());
        int choice = Menu.mainMenu(user);

        if (choice == 1) {
            Menu.displayMenu(user);
        } else if (choice == 2) {
            Menu.addBillMenu(user);
        } else if (choice == 3) {
            Menu.removeBillMenu(user);
        } else {
            System.out.println("You have entered an incorrect selection");
        }
    }

    public static User initUser(User user) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name...");
        user.setName(scan.nextLine());

        return user;
    }
}