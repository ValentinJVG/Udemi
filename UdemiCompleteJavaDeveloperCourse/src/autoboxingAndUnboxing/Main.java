package autoboxingAndUnboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank("Some bank");
        bank.addBranch("Saue");
        bank.addCustomer("Saue", "Gleb", 300);
        bank.addCustomer("Saue", "Jegor", 200);
        bank.addCustomer("Saue", "Lev", 100);

        bank.addBranch("Laagri");
        bank.addCustomer("Laagri", "Lena", 10_000);

        bank.addCustomerTransaction("Saue", "Gleb", 12);
        bank.addCustomerTransaction("Saue", "Gleb", 15);
        bank.addCustomerTransaction("Saue", "Jegor", 9);
        bank.addCustomerTransaction("Saue", "Lev", 8);

        bank.listCustomers("Saue", true);
        bank.listCustomers("Laagri", true);

        if (!bank.addCustomer("Tallinn", "Valentin", 1000)) {
            System.out.println("Error, Tallinn branch does not exist");
        }

        if (!bank.addBranch("Saue")) {
            System.out.println("Saue branch already exists");
        }
        if (!bank.addCustomerTransaction("Saue", "KoKoKo", 52.33)) {
            System.out.println("Customer does not exist at that branch");
        }
        if (!bank.addCustomer("Saue", "Gleb", 250)) {
            System.out.println("Customer Gleb already exists");
        }
    }
}
