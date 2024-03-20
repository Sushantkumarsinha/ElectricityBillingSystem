package ElectricityBillingSystem;

import java.util.Scanner;

class Customer {
    private String customerID;
    private String customerName;
    private double unitsConsumed;

    public Customer(String customerID, String customerName, double unitsConsumed) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        
        double ratePerUnit = 8.0;
        return unitsConsumed * ratePerUnit;
    }

    public void displayBill() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed + " kWh");
        System.out.println("Total Bill: Rs" + calculateBill());
    }
}

public class ElectricityBillingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        String customerID = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        double unitsConsumed = sc.nextDouble();

        Customer customer = new Customer(customerID, customerName, unitsConsumed);

        System.out.println("\nElectricity Bill Details:");
        customer.displayBill();
        sc.close();
    }
}
