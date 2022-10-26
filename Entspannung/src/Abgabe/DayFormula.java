package Abgabe;

import java.util.Scanner;

public class DayFormula {
    /**
     * If dayNumber is 1, return "Monday", if dayNumber is 2, return "Tuesday", and so on. If dayNumber is not between 1
     * and 7, return "Error".
     *
     * @param dayNumber The number of the day of the week.
     * @return The day of the week.
     */
    static String days(int dayNumber){
        String day = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Error";
        };
        return day;
    }

    /**
     * The function takes in an integer and returns the day of the week that corresponds to that integer
     */
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.print("Input a day: ");
        int dayNumber = scanObj.nextInt();
        System.out.println(days(dayNumber));
    }
}
