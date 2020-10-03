package Lab10.Ex3;

import java.util.Scanner;

public class Main {
    public static void rec(int num){
        if (num >= 10)
            rec(num / 10);
        System.out.print(num % 10 + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        rec(N);
    }
}
