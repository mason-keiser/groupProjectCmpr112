package main;

// Class used for bills such as water, gas, electric, trash, rent, etc.
public class Utility {
    String utilityType;
    String companyName;
    String monthlyCost;

    public void setUtilityType(String expenseType) {this.utilityType = expenseType;}
    public void setMonthlyCost(String monthlyCost) {this.monthlyCost = monthlyCost;}
    public void setCompanyName(String companyName) {this.companyName = companyName;}

    public String displayUtility() {
        return String.format("You have entered the following Utility:\n" +
                        "===============================================\n" +
                        "Utility Type: %s\n" +
                        "Utility Monthly Cost: %s\n" +
                        "Company Name: %s",
                utilityType, monthlyCost, companyName);
    }
}
