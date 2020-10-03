package Lab10.Ex2;

import java.util.Scanner;

public class Main {
    public static int rec(int a, int b) {
        if (a > b + 1)
            return 0;
        if (a == 0 || b == 0)
            return 1;
        return rec(a, b - 1) + rec(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(rec(sc.nextInt(), sc.nextInt()));
    }
}