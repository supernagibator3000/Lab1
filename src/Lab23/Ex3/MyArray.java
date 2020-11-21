package Lab23.Ex3;

public class MyArray<E> {
    E[] array;

    public MyArray(E[] array){
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }

    public E at(int ind) throws MyArrayIndexOutOfBoundsException {
        if (ind <= 0 || ind >= array.length)
            throw new MyArrayIndexOutOfBoundsException(ind);

        return array[ind];
    }
}
