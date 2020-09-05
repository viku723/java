package com.codewithvivek;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int principleAmount = getInputValue("Principle amount:");
        float interestRate = getInterestRate();
        int periodInYears = getInputValue("Period (years):");
        double mortgage = getMortgage(principleAmount, interestRate, periodInYears);
        System.out.println("Mortage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

    private static float getInterestRate() {
        System.out.print("Annual Interest rate:");
        float interestRate = scanner.nextFloat();
        return interestRate;
    }

    private static int getInputValue(String s) {
        System.out.print(s);
        return scanner.nextInt();
    }

    private static double getMortgage(int principleAmount, float interestRate, int periodInYears) {
        final byte MONTHS_IN_YEARS = 12;
        float monthlyInterestRate = interestRate / 100 / MONTHS_IN_YEARS;
        double powOfOnePlusInterestRate = Math.pow((1 + monthlyInterestRate), periodInYears * MONTHS_IN_YEARS); // (1+r)^n
        return principleAmount * ((monthlyInterestRate * powOfOnePlusInterestRate) / (powOfOnePlusInterestRate - 1));
    }
}
