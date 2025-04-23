package hw_22_04_2025;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        boolean result = isSorted(array);
        System.out.println(result);

        rotateLeft(array, 2);
    }

    public static boolean isSorted(int[] arr) {

        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
               result = false;
            }else {
                result = true;
            }
        }
        return result;
    }

    public static void rotateLeft(int[] arr, int k){

        int numOne = 0;
        int numTwo = 0;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {
                numOne = arr[j];
                numTwo = arr[j] = arr[arr.length-1];


            }
        }

    }


}
