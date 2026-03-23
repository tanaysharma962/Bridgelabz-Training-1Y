package strings;

import java.util.Scanner;

public class CalendarDisplay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }

        if (month == 2 && isLeap) {
            daysInMonth[1] = 29;
        }

        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int firstDay = (d + x + (31 * m0) / 12) % 7;

        System.out.println();
        System.out.println("   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth[month - 1]; day++) {

            System.out.printf("%3d ", day);

            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}

