package Lab21.Ex2;

import Lab21.Ex1.Exception2;

public class Test {
    public static void main(String[] args) {
        try{
            new Exception2().exceptionDemo();
        }
        catch (Exception e){
            System.out.println("Exception!!!");
        }
    }
}
