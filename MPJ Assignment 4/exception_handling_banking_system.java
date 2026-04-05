import java.io.*;
import java.util.*;

class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

class Customer {
    int cid;
    String cname;
    double amount;

    Customer(int cid, String cname, double amount) {
        this.cid = cid;
        this.cname = cname;
        this.amount = amount;
    }
}

public class BankSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 3);
    }

    static void createAccount() throws Exception {
        System.out.print("Enter Customer ID (1-20): ");
        int cid = sc.nextInt();

        if (cid < 1 || cid > 20)
            throw new BankException("CID must be between 1 and 20");

        System.out.print("Enter Name: ");
        String cname = sc.next();

        System.out.print("Enter Amount (>=1000): ");
        double amount = sc.nextDouble();

        if (amount < 1000)
            throw new BankException("Minimum balance should be 1000");

        if (amount <= 0)
            throw new BankException("Amount must be positive");

        Customer c = new Customer(cid, cname, amount);

        FileWriter fw = new FileWriter("bank.txt", true);
        fw.write(c.cid + " " + c.cname + " " + c.amount + "\n");
        fw.close();

        System.out.println("Account Created Successfully!");
    }

    static void withdraw() throws Exception {
        System.out.print("Enter withdrawal amount: ");
        double wth_amt = sc.nextDouble();

        if (wth_amt <= 0)
            throw new BankException("Amount must be positive");

        System.out.print("Enter current balance: ");
        double total = sc.nextDouble();

        if (wth_amt > total)
            throw new BankException("Insufficient Balance");

        total = total - wth_amt;
        System.out.println("Withdrawal Successful! Remaining balance: " + total);
    }
}
