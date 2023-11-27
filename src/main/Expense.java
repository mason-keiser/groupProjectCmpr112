package main;

//Class used for bills such as groceries, pets, etc.
public class Expense {
    public String expenseType;
    public int monthlyCost;
    public String details;

    public void setExpenseType(String expenseType) {this.expenseType = expenseType;}
    public void setMonthlyCost(int monthlyCost) {this.monthlyCost = monthlyCost;}
    public void setDetails(String details) {this.details = details;}

    public String displayExpense() {
        return String.format("You have entered the following expense:\n" +
                "===============================================\n" +
                "Expense Type: %s\n" +
                "Expense Monthly Cost: %d\n" +
                "Additional Details: %s",
                expenseType, monthlyCost, details);
    }
}
