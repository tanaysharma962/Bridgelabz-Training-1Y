package com.bank.util;
import com.bank.util.InterestCalculator;
public class Main {
    public static void main(String[] args){
        double P = 10000, R = 5, T = 2;

        double SI = InterestCalculator.calculateSimpleInterest(P, R, T);
        double CI = InterestCalculator.calculateCompoundInterest(P, R, T);

        System.out.println("Simple Interest: " + SI);
        System.out.println("Compound Interest: " + CI);
    }
}
