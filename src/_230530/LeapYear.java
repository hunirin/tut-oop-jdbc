package _230530;

public class LeapYear {
    public static void main(String[] args) {
        int i = 1700;
        if ( checkLeapYear(i) )
            System.out.println(i + " O");
        else
            System.out.println(i + " X");
    }

    public static boolean checkLeapYear(int year) {

        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

    }
}