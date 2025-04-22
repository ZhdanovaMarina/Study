package work_28_03_2025.hw;

import java.lang.reflect.Array;

public class ArrayOfNumbers {

    public static void main(String[] args) {

        ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers(new int[]{1,2,3,4,5,6});
        arrayOfNumbers.printArray();
        arrayOfNumbers.changeArray();
        arrayOfNumbers.printArray();
    }

    int[] array;

    public ArrayOfNumbers(int[] array) {
        this.array = array;
    }

    public void changeArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
    }

    public void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
