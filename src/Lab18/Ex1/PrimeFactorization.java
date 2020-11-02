package Lab18.Ex1;

public class PrimeFactorization {
    public void work(int number) {
        for (int i = 2; i <= Math.sqrt(number);){
            if(number % i ==0){
                System.out.print(i);
                number /= i;
                if(number > 1)
                    System.out.print(' ');
            }
            else
                i++;
        }

//        int i = 2;
//
//        while (i <= Math.sqrt(number)) {
//            if(number % i ==0){
//                System.out.print(i);
//                number /= i;
//                if(number > 1)
//                    System.out.print(' ');
//            }
//            else
//                i++;
//        }

        if(number > 1)
            System.out.print(number);
    }
}