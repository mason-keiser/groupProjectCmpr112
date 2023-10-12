package main;

import static main.logger.Log.LOGGER;

//Class used to manipulate user's bills and present data
public class BillManager {
    public Object bills;

    public static double getTotalBillCost(Object bills) {return 0;}

    public static void printBillList(Object bills) {}

    public static void deleteBill() {}

    public void setBills(Object bills) {
        this.bills = bills;
    }
}
