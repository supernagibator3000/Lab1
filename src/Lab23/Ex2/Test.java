package Lab23.Ex2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] strings = {"it", "lives", "it", "breathes"};
        Integer[] integers = {1, 2, 3, 4};

        MyArray<String> stringMyArray = new MyArray<>(strings);
        MyArray<Integer> integerMyArray = new MyArray<>(integers);

        System.out.println(Arrays.toString(stringMyArray.getArray()));
        System.out.println(Arrays.toString(integerMyArray.getArray()));
    }
}
