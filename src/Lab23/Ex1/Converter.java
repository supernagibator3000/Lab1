package Lab23.Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {
    public <E> ArrayList<E> fromArrayToList(E[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
