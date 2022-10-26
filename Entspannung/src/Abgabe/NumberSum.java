package Abgabe;

import java.util.Scanner;

public class NumberSum {
    /**
     * It takes a number, adds up the digits, and returns the sum
     *
     * @param numb the number to be summed
     * @return The sum of the digits of the number.
     */
    static int numberSum(int numb) {
        int sum = 0;
        while (numb != 0){
            sum += numb % 10;
            numb /= 10;
        }
        return sum;
    }
    /**
     * It takes an integer as input and returns the sum of its digits
     */
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.print("Input: ");
        int numb = scanObj.nextInt();
        if (numb < 0){
            System.out.println("Error!");
        }
        System.out.println("Ziffernsumme von der Eingabe: " + numberSum(numb) + "\n");
        int sumTen = 0;
        for (int i = 10000; i < 100001; i++) {
            int sum = numberSum(i);
            if (sum == 10){
                sumTen += 1;
                System.out.println(i + " hat eine Ziffernsumme von 10");
            }
        }
        System.out.print("\n" + "Ziffernsumme 10 kam " + sumTen + " mal vor");
    }
}
