package Lab23.Ex3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] strings = {"it", "lives", "it", "breathes"};
        Integer[] integers = {1, 2, 3, 4};

        MyArray<String> stringMyArray = new MyArray<>(strings);
        MyArray<Integer> integerMyArray = new MyArray<>(integers);

        System.out.println(Arrays.toString(stringMyArray.getArray()));
        System.out.println(Arrays.toString(integerMyArray.getArray()));

        int ind = 1;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MyArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        ind = -1;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MyArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        ind = 10;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringMyArray.at(ind));
        }
        catch (MyArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
