package main;

import java.util.Scanner;

public class Menus {

    public static final Scanner scan = new Scanner(System.in);
    public static final String PLEASE_SELECT_AN_OPTION_BELOW = "Please select an option below";
    public static final String BAR = "===========================================";
    public static final String BACK = "Enter '0' to return to the Main Menu";
    private static int input;

    public static int mainMenu(User user) {
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

    public static void displayMenu(User user) {
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
            if (user.getExpenseList().isEmpty()) {
                System.out.println("You have not entered any expenses");
                Main.menuConditioning(user);
            } else {
                user.displayAllExpenses();
                Main.menuConditioning(user);
            }
        } else if (input == 2) {
            if (user.getUtilityList().isEmpty()) {
                System.out.println("You have not entered any utilities");
                Main.menuConditioning(user);
            } else {
                user.displayAllUtilities();
                Main.menuConditioning(user);
            }
        } else {
            user.displayAllBills();
            Main.menuConditioning(user);
        }
    }

    public static void addBillMenu(User user) {
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
            addExpense(user);
        } else {
            addUtility(user);
        }
    }

    public static void removeBillMenu(User user) {
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
            if (user.expenseList.isEmpty()) {
                Main.menuConditioning(user);
            } else {
                user.displayAllExpenses();
                input = scan.nextInt();
                user.deleteUtilityOrExpense(input - 1, false);
                Main.menuConditioning(user);
            }
        } else {
            if (user.utilityList.isEmpty()) {
                Main.menuConditioning(user);
            } else {
                user.displayAllUtilities();
                input = scan.nextInt();
                user.deleteUtilityOrExpense(input - 1, true);
                Main.menuConditioning(user);
            }
        }
    }

    public static void checkIfBackSelection(int input, User user) {
        if (input == 0) {
            Main.menuConditioning(user);
        }
    }

    public static void addExpense(User user) {
        Expense expense = new Expense();
        String input1;
        String input2;
        int input;

        System.out.println("Please enter the following details for your Expense information");
        System.out.println(BAR + BAR);
        System.out.println("What is your monthly total cost for this expense?");
        input = scan.nextInt();
        scan.nextLine();
        System.out.println("What would you classify the expense type as? (rent, groceries, pets, etc.)");
        input1 = scan.nextLine();
        System.out.println("Do you have any further details to add this stored expense?");
        input2 = scan.nextLine();

        expense.setExpenseType(input1);
        expense.setDetails(input2);
        expense.setMonthlyCost(input);
        user.addExpense(expense);

        System.out.println(expense.displayExpense());
        System.out.println(BAR);
        System.out.println("returning to main menu..");
        System.out.println();
        Main.menuConditioning(user);
    }

    public static void addUtility(User user) {
        Utility utility = new Utility();
        String input1;
        String input2;
        int input;

        System.out.println("Please enter the following details for your Utility information");
        System.out.println(BAR + BAR);
        System.out.println("What is your monthly total cost for this utility?");
        input = scan.nextInt();
        scan.nextLine();
        System.out.println("What would you classify the utility type as (rent, water, electricity, etc.)?");
        input1 = scan.nextLine();
        System.out.println("What is the company name associated with this utility?");
        input2 = scan.nextLine();

        utility.setUtilityType(input1);
        utility.setCompanyName(input2);
        utility.setMonthlyCost(input);
        user.addUtility(utility);

        System.out.println(utility.displayUtility());
        System.out.println(BAR);
        System.out.println("returning to main menu..");
        System.out.println();
        Main.menuConditioning(user);
    }
}