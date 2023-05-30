package _230530;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        checkLeapyear();
    }

    private static void checkLeapyear() {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println(year + " O");
        } else {
            System.out.println(year + " X");
        }
    }
}
