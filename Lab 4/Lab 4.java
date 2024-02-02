/*
Aliaa Abobakr Elshiekh
120210151
CSE 3
*/

// Classes and OOP in Java.

import java.util.Scanner;

public class Roman {
    private String romanNum;
    private int decimalNum;

    public Roman(String romanNum) {
        this.romanNum = romanNum;
        this.decimalNum = convertToDecimal();
    }

    private int convertToDecimal() {
        int result = 0;
        int prevValue = 0;

        for (int i = romanNum.length() - 1; i >= 0; i--) {
            char num = romanNum.charAt(i);
            int value = 0;

            if (num == 'I') value = 1;
            else if (num == 'V') value = 5;
            else if (num == 'X') value = 10;
            else if (num == 'L') value = 50;
            else if (num == 'C') value = 100;
            else if (num == 'D') value = 500;
            else if (num == 'M') value = 1000;

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public String toRoman() {
        return romanNum;
    }

    public int toDecimal() {
        return decimalNum;
    }

    public void display(boolean isRoman) {
        if (isRoman) {
            System.out.println("Roman Numeral: " + toRoman());
        } else {
            System.out.println("Decimal Number: " + toDecimal());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String input = scanner.nextLine();

        Roman romanNumeral = new Roman(input);

        System.out.println("Choose how to display the number:\n 1. Roman Numeral\n 2. Decimal Number");
        int choice = scanner.nextInt();
        if (choice == 1) {
            romanNumeral.display(true);
        } else if (choice == 2) {
            romanNumeral.display(false);
        }
    }
}