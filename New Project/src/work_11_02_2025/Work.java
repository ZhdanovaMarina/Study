package work_11_02_2025;

public class Work {
    public static void main(String[] args) {


//        task1();
//        task2();
        int[] c = {-1, 2, -3, 4, 5};
        int f = 0;

        for (int i = 0; i < c.length; i++){
            if(c[i] >=0){
                f++;
            }

        }
        System.out.println(f);

    }

    private static void task2() {
        int b = 7;
        if (b % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    private static void task1() {
    /*

  1) i = 0, a = 0
      a = a + number[0] //0 -> 1
  2) i = 1, a = 1
      a = a + number[1] //1 -> 3
  3) i = 2, a = 3
      a = a + number[2] //3 -> 6
  4) i = 3, a = 6
      a = a + number[3] //6 -> 10
  5) i = 4, a = 10
      a = a + number[4] //10 -> 15



  1) i = 0
      a = a + 1 //0 -> 1
  2) i = 1
      a = a + 1 //1 -> 2
  3) i = 2
      a = a + 1 //2 -> 3
  4) i = 3
      a = a + 1 //3 -> 4
  5) i = 4
      a = a + 1 //4 -> 5

      Выходим из цикла, и a = 5

       [2, 7, 4, 3, 6] -> 22
  * */

        int[] number = {1, 2, 3, 4, 5};

        int a = 0;
        for (int i = 0; i < number.length; i++) {
            a = a + number[i];
        }
        System.out.println(a);
    }
}
