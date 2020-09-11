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

        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length - 1; j++)
                if (arr[j] < arr[j + 1])
                {
                    buff = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buff;
                }

        for (int i = 0; i < 5; i++)
        {
            if (i < 4)
                System.out.print(arr[i] + " ");
            else
                System.out.println(arr[i]);
        }

    }
}
