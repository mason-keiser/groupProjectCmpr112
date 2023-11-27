package main;

public class Expense {
    public String expenseType;
    public int monthlyCost;
    public String details;

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public void setMonthlyCost(int monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }

    public String getDetails() {
        return details;
    }

    public String displayExpense() {
        return String.format("You have entered the following expense:\n" +
                        "===============================================\n" +
                        "Expense Type: %s\n" +
                        "Expense Monthly Cost: %d\n" +
                        "Additional Details: %s",
                expenseType, monthlyCost, details);
    }
}
