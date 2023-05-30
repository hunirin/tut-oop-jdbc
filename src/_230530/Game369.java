package _230530;

public class Game369 {
    public static void main(String[] args) {
        game369();
    }

    private static void game369() {
        for (int cnt = 0; cnt < 100; cnt++) {
            System.out.print(cnt + "");
            int a = cnt / 10;
            int b = cnt % 10;
            if (a % 3 == 0 && a != 0)
                System.out.print("*");
            if (b % 3 == 0 && b != 0)
                System.out.print("*");
            System.out.println();
        }
    }

    public static String is369(int cnt) {
        int a = cnt / 10;
        int b = cnt % 10;
        String str = (b % 3 == 0 && b != 0) ? "*" : "";
        if (a == 0)
            return str;
        return str + is369(a);
    }

}
