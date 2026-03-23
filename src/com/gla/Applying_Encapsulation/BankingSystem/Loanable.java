package Applying_Encapsulation.BankingSystem;

public interface Loanable {
    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}
