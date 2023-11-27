package main;

public class Utility {
    String utilityType;
    String companyName;
    int monthlyCost;

    public void setUtilityType(String expenseType) {
        this.utilityType = expenseType;
    }

    public void setMonthlyCost(int monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUtilityType() {
        return utilityType;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String displayUtility() {
        return String.format("You have entered the following Utility:\n" +
                        "===============================================\n" +
                        "Utility Type: %s\n" +
                        "Utility Monthly Cost: %d\n" +
                        "Company Name: %s",
                utilityType, monthlyCost, companyName);
    }
}
