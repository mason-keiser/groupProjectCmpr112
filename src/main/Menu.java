package main;

import java.util.Scanner;

public class Menu {

    private static final Scanner scan = new Scanner(System.in);
    public static final String PLEASE_SELECT_AN_OPTION_BELOW = "Please select an option below";
    public static final String BAR = "===========================================";
    public static final String BACK = "Enter '0' to return to the Main Menu";
    private static int input;
    public static int mainMenu () {
        System.out.println("     Welcome to the best Bill Manager!");
        System.out.println(BAR);
        System.out.println();
        System.out.println("Please select an option below to get started");
        System.out.println("1.) Display Bills");
        System.out.println("2.) Add Bill");
        System.out.println("3.) Remove Bill");
        input = scan.nextInt();

        return input;
    }

    public static int displayMenu () {
        System.out.println("            Display Bills Menu");
        System.out.println(BAR);
        System.out.println();
        System.out.println(PLEASE_SELECT_AN_OPTION_BELOW);
        System.out.println("1.) Display Expenses");
        System.out.println("2.) Display Utilities");
        System.out.println("3.) Display All");
        System.out.println(BACK);
        input = scan.nextInt();
        checkIfBackSelection(input);

        return input;
    }

    public static int addBillMenu () {
        System.out.println("              Add Bill Menu");
        System.out.println(BAR);
        System.out.println();
        System.out.println(PLEASE_SELECT_AN_OPTION_BELOW);
        System.out.println("1.) Add Expense");
        System.out.println("2.) Add Utility");
        System.out.println(BACK);
        input = scan.nextInt();
        checkIfBackSelection(input);

        return input;
    }

    public static int removeBillMenu () {
        System.out.println("            Remove Bill Menu");
        System.out.println(BAR);
        System.out.println();
        System.out.println(PLEASE_SELECT_AN_OPTION_BELOW);
        System.out.println("1.) Remove Expense");
        System.out.println("2.) Remove Utility");
        System.out.println(BACK);
        input = scan.nextInt();
        checkIfBackSelection(input);

        return input;
    }

    public static void checkIfBackSelection (int input) {
        if (input == 0) {
            mainMenu();
        }
    }

}
