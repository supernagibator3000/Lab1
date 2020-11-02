package Lab18.Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class MySequence {
    private ArrayList<Integer> array;

    public MySequence(){
        array = new ArrayList<Integer>();
        this.input();
    }

    public void input(){
        if (!array.isEmpty())
            array.clear();

        Scanner sc = new Scanner(System.in);
        int buff = 0;

        buff = sc.nextInt();
        while(buff != 0) {
            array.add(buff);
            buff = sc.nextInt();
        }
    }

    public int maxNum(){
        int maxNumber = Integer.MIN_VALUE;
        for (Integer number : array)
            if (number > maxNumber)
                maxNumber = number;
        return maxNumber;
    }
}
