package Lab1;

public class Sum
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            arr[i] = (int) (Math.random() * 100);
            sum += arr[i];
            if (i < 4)
                System.out.print(arr[i] + " + ");
            else
                System.out.print(arr[i] + " = ");
        }

        System.out.println(sum);
    }
}
