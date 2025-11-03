package CurrencyConverter.com;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usdToInr = 83.0;
        double eurToInr = 90.0;

        System.out.println("💱 Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double converted = 0;
        if (choice == 1) converted = amount * usdToInr;
        else if (choice == 2) converted = amount * eurToInr;
        else System.out.println("Invalid choice");

        if (converted > 0)
            System.out.println("Converted Amount: ₹" + converted);

        sc.close();
    }
}
