package work_13_02_2025;

public class Work {
    public static void main(String[] args) {
        sumArray(new int[]{1, 2, 3, 4, 5});

        boolean a = checkEven(8);
        if (a){
            System.out.println("Число четное");
        }else {
            System.out.println("Число нечетное");
        }
        // (условие) ? (действие1) : (действие2)
        System.out.println(checkEven(7) ? "Число четное" : "Число нечетное");

    }

    static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    static boolean checkEven(int number) {
//        if(number % 2 == 0){
//            return true;
//        }
//        return false;

        return number % 2 == 0;

    }
}
