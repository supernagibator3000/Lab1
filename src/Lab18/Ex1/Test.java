package Lab18.Ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrimeFactorization primeFactorization = new PrimeFactorization();
        primeFactorization.work(sc.nextInt());
    }
}