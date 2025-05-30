package work_30_05_2025;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson {

    /*
    - try
    - catch
     */
    public static void main(String[] args) {
//        try{
//            // блок кода, в котором возможно исключение
//        }catch (RuntimeException e){// тип исключения объект
//            // обработка исключения
//        }catch (Exception e){// тип исключения объект
//            // обработка исключения
//        }



//        test1();

//        test2();

//        test3();

        try (Scanner scanner = new Scanner(System.in);){

            int a = 5;

            try{
                a = 15/0;
            }catch (Exception e){
                throw new CustomException("произошла ошибка в нашем главном методе");
            }

        } catch (CustomException e) {
            System.out.println("Ошибка в методе customEx : "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Непонятная ошибка: "+ e.getMessage());
        }

        System.out.println("Эту строчку уже увидим!");
    }

    private static void test3() {
        Scanner scanner = new Scanner(System.in);
        try {

            int a = 5;

            try{
                 a = 15/0;
            }catch (Exception e){
                throw new CustomException("произошла ошибка в нашем главном методе");
            }


        } catch (CustomException e) {
            System.out.println("Ошибка в методе customEx : "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Непонятная ошибка: "+ e.getMessage());
        }finally {

            scanner.close();
        }

        System.out.println("Эту строчку уже увидим!");
    }

    private static void test2() {
        Scanner scanner = new Scanner(System.in);


        try {
            int a = 5;

            System.out.println("введи второе число: ");
            int b = scanner.nextInt();

            System.out.println(a/b);

            customEx();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за пределы массива: "+ e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("Проблема в вычислениях: "+ e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println("Проблема при чтении из консоли: "+ e.getMessage());
        } catch (CustomException e) {
            System.out.println("Ошибка в методе customEx : "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Непонятная ошибка: "+ e.getMessage());
        }

        System.out.println("Эту строчку уже увидим!");
    }


    private static void customEx(){
        try{
            int a = 15/0;
        }catch (Exception e){
            throw new CustomException("произошла ошибка в нашем главном методе customEx");
        }
    }

    private static void test1() {
        int[] nums = new int[3];

        try {
            System.out.println("Скоро будет исключение");
            nums[10] = 10;

            System.out.println("Эту строчку не увидим");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива: "+ e.getMessage());
        }

        System.out.println("Эту строчку уже увидим!");
    }


}
