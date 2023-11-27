package main;

import java.util.Scanner;

public class Menu {

    public static Scanner scan = new Scanner(System.in);
    public static final String PLEASE_SELECT_AN_OPTION_BELOW = "Please select an option below";
    public static final String BAR = "===========================================";
    public static final String BACK = "Enter '0' to return to the Main Menu";
    private static int input;
    public static int mainMenu (User user) {
        System.out.printf("  Welcome to the best Bill Manager %s!\n", user.getName());
        System.out.println(BAR);
        System.out.println();
        System.out.println("Please select an option below to get started");
        System.out.println("1.) Display Bills");
        System.out.println("2.) Add Bill");
        System.out.println("3.) Remove Bill");
        input = scan.nextInt();

        return input;
    }

    public static void displayMenu (User user) {
        System.out.println("            Display Bills Menu");
        System.out.println(BAR);
        System.out.println();
        System.out.println(PLEASE_SELECT_AN_OPTION_BELOW);
        System.out.println("1.) Display Expenses");
        System.out.println("2.) Display Utilities");
        System.out.println("3.) Display All");
        System.out.println(BACK);
        input = scan.nextInt();
        checkIfBackSelection(input, user);

        if (input == 1) {
            System.out.println("display expense logic");
        } else if (input == 2){
            System.out.println("display utility logic");
        } else {
            System.out.println("display all logic");
        }
    }

    public static int addBillMenu (User user) {
        System.out.println("              Add Bill Menu");
        System.out.println(BAR);
        System.out.println();
        System.out.println(PLEASE_SELECT_AN_OPTION_BELOW);
        System.out.println("1.) Add Expense");
        System.out.println("2.) Add Utility");
        System.out.println(BACK);
        input = scan.nextInt();
        checkIfBackSelection(input, user);

        if (input == 1) {
            System.out.println("add expense logic");
            addExpense(user);
        } else {
            System.out.println("add utility logic");
        }

        return input;
    }

    public static int removeBillMenu (User user) {
        System.out.println("            Remove Bill Menu");
        System.out.println(BAR);
        System.out.println();
        System.out.println(PLEASE_SELECT_AN_OPTION_BELOW);
        System.out.println("1.) Remove Expense");
        System.out.println("2.) Remove Utility");
        System.out.println(BACK);
        input = scan.nextInt();
        checkIfBackSelection(input, user);

        if (input == 1) {
            System.out.println("remove expense logic");
        } else {
            System.out.println("remove utility logic");
        }

        return input;
    }

    public static void checkIfBackSelection (int input, User user) {
        if (input == 0) {
            mainMenu(user);
        }
    }

    public static void addExpense(User user) {
        Expense expense = new Expense();
        String input1, input2;
        int num;
        System.out.println("Please enter the following details for your expense information");
        System.out.println(BAR + BAR);
        System.out.println("What would you classify the expense type as? (rent, groceries, pets, etc.)");
        input1 = scan.next();
        System.out.println("What is your monthly total cost for this expense?");
        num = scan.nextInt();
        System.out.println("Do you have any further details to add this stored expense?");
        input2 = scan.nextLine();

        try {
            expense.setExpenseType(input1);
            expense.setDetails(input2);
            expense.setMonthlyCost(num);

            user.addExpense(expense);
        } catch(Exception e) {
            System.out.println("adding user");
        }

        // Display entered expense back to user
        System.out.println(expense.displayExpense());
        System.out.println("returning to main menu..");
        System.out.println();
        mainMenu(user);
    }
}
