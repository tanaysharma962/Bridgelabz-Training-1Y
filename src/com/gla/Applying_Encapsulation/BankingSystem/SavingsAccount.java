package Applying_Encapsulation.BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4%

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved for Savings Account: " + amount);
        } else {
            System.out.println("Loan Rejected for Savings Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 5000;
    }
}
