package Lab18.Ex2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Palindrome palindrome = new Palindrome();
        if (palindrome.palindromeCheck(sc.nextLine()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}