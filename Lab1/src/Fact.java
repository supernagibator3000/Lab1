import java.util.Scanner;

public class Fact
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, res = 0;
        num = sc.nextInt();
        for (int i = 1; i < num; i++)
            res *= num;
    }
}
