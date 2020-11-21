package Lab23.Ex1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new Converter().fromArrayToList(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(integerArrayList);

        ArrayList<String> stringArrayList = new Converter().fromArrayToList(new String[]{"it", "lives", "it", "breathes"});
        System.out.println(stringArrayList);
    }
}
