package Applying_Encapsulation.BankingSystem;
import java.util.ArrayList;
public class BankingSystem {
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Rahul", 8000));
        accounts.add(new CurrentAccount("CA201", "Amit", 15000));

        for (BankAccount acc : accounts) {

            System.out.println("\nAccount Number: " + acc.getAccountNumber());
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());

            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);

            Loanable loan = (Loanable) acc;
            loan.applyForLoan(20000);
        }
    }
}
