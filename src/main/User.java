package main;

import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Utility> utilityList = new ArrayList<>();
    ArrayList<Expense> expenseList = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addUtility(Utility utility) {
        utilityList.add(utility);
    }

    public void addExpense(Expense expense) {
        expenseList.add(expense);
    }

    public void deleteUtilityOrExpense(int index, boolean isUtility) {
        if (isUtility) {
            utilityList.remove(index);
        } else {
            expenseList.remove(index);
        }
    }

    public ArrayList<Expense> getExpenseList() {
        return expenseList;
    }

    public ArrayList<Utility> getUtilityList() {
        return utilityList;
    }

    public void displayAllExpenses() {
        System.out.println("    Here are all of your Expenses");
        System.out.println("=======================================");
        for (int i = 0; i < expenseList.size(); i++) {
            Expense expense = expenseList.get(i);
            System.out.printf("(%d) Expense Type: %s\n", i + 1, expense.getExpenseType());
            System.out.printf("    Monthly Cost: %d\n", expense.getMonthlyCost());
            System.out.printf("    Additional Details: %s\n", expense.getDetails());
            System.out.println("-------------------------------------");
        }
    }

    public void displayAllUtilities() {
        System.out.println("   Here are all of your Utilities");
        System.out.println("=======================================");
        for (int i = 0; i < utilityList.size(); i++) {
            Utility utility = utilityList.get(i);
            System.out.printf("(%d) Utility Type: %s\n", i + 1, utility.getUtilityType());
            System.out.printf("    Monthly Cost: %d\n", utility.getMonthlyCost());
            System.out.printf("    Associated Company: %s\n", utility.getCompanyName());
            System.out.println("-------------------------------------");
        }
    }

    public void displayAllBills() {
        if (utilityList.isEmpty() && expenseList.isEmpty()) {
            System.out.println("You currently have no bills or utilities entered");
            Main.menuConditioning(this);
        } else if (!utilityList.isEmpty() && expenseList.isEmpty()) {
            System.out.println("   Here are all of your Bills");
            System.out.println("=======================================");
            for (int i = 0; i < utilityList.size(); i++) {
                Utility utility = utilityList.get(i);
                System.out.printf("Utility Type: %s\n", utility.getUtilityType());
                System.out.printf("Monthly Cost: %d\n", utility.getMonthlyCost());
                System.out.printf("Associated Company: %s\n", utility.getCompanyName());
                System.out.println("-------------------------------------");
            }
        } else if (utilityList.isEmpty() && !expenseList.isEmpty()) {
            System.out.println("   Here are all of your Bills");
            System.out.println("=======================================");
            for (int i = 0; i < expenseList.size(); i++) {
                Expense expense = expenseList.get(i);
                System.out.printf("Expense Type: %s\n", expense.getExpenseType());
                System.out.printf("Monthly Cost: %d\n", expense.getMonthlyCost());
                System.out.printf("Additional Details: %s\n", expense.getDetails());
                System.out.println("-------------------------------------");
            }
        } else {
            System.out.println("   Here are all of your Bills");
            System.out.println("=======================================");
            for (int i = 0; i < utilityList.size(); i++) {
                Utility utility = utilityList.get(i);
                System.out.printf("Utility Type: %s\n", utility.getUtilityType());
                System.out.printf("Monthly Cost: %d\n", utility.getMonthlyCost());
                System.out.printf("Associated Company: %s\n", utility.getCompanyName());
                System.out.println("-------------------------------------");
            }

            for (int i = 0; i < expenseList.size(); i++) {
                Expense expense = expenseList.get(i);
                System.out.printf("Expense Type: %s\n", expense.getExpenseType());
                System.out.printf("Monthly Cost: %d\n", expense.getMonthlyCost());
                System.out.printf("Additional Details: %s\n", expense.getDetails());
                System.out.println("-------------------------------------");
            }
        }
    }
}
