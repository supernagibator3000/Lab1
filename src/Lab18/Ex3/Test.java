package Lab18.Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MySequence mySequence = new MySequence();
        int maxSequenceNumber = mySequence.maxNum();

        if (maxSequenceNumber == Integer.MIN_VALUE)
            System.out.println("Последовательность пуста");
        else
            System.out.println("Максимальное значение последовательности: " + maxSequenceNumber);
    }
}
