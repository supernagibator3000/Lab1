package Lab1;

import java.util.Random;

import static java.util.Arrays.sort;

public class Sort
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int buff;
        for (int i = 0; i < 5; i++)
        {
            arr[i] = (int) (Math.random() * 100);
            if (i < 4)
                System.out.print(arr[i] + " ");
            else
                System.out.println(arr[i]);
        }

        sort(arr);

        for (int i = 0; i < 5; i++)
        {
            if (i < 4)
                System.out.print(arr[i] + " ");
            else
                System.out.println(arr[i]);
        }

        Random random = new Random();

        for (int i = 0; i < 5; i++)
            arr[i] = random.nextInt(100);

        for (int i = 0; i < 5; i++)
        {
            if (i < 4)
                System.out.print(arr[i] + " ");
            else
                System.out.println(arr[i]);
        }

        sort(arr);

        for (int i = 0; i < 5; i++)
        {
            if (i < 4)
                System.out.print(arr[i] + " ");
            else
                System.out.println(arr[i]);
        }
    }
}
