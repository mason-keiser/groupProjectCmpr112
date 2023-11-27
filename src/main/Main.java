package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = initUser(new User());
        menuConditioning(user);
    }

    public static void menuConditioning(User user) {
        int choice = Menus.mainMenu(user);

        if (choice == 1) {
            Menus.displayMenu(user);
        } else if (choice == 2) {
            Menus.addBillMenu(user);
        } else if (choice == 3) {
            Menus.removeBillMenu(user);
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