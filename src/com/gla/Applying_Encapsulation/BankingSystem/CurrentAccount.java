package Applying_Encapsulation.BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02; // 2%

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved for Current Account: " + amount);
        } else {
            System.out.println("Loan Rejected for Current Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 10000;
    }
}
