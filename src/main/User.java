package main;

import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Utility> utilityList= new ArrayList<>();
    ArrayList<Expense> expenseList = new ArrayList<>();

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {return name;}

    public void addUtility (Utility utility) {
        utilityList.add(utility);
    }

    public void addExpense (Expense expense) {
        expenseList.add(expense);
    }

    public void deleteUtilityOrExpense (int index, boolean isUtility) {
        if (isUtility) {
            utilityList.remove(index);
        } else {
            expenseList.remove(index);
        }
    }

    public ArrayList<Expense> getExpenseList() {
        return expenseList;
    }

    public Expense getExpenseListItem(int index) {
        return expenseList.get(index);
    }

    public ArrayList<Utility> getUtilityList() {
        return utilityList;
    }

    public Utility getUtilityListItem(int index) {
        return utilityList.get(index);
    }
}
