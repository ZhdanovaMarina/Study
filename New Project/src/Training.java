import java.lang.reflect.Array;
import java.util.Arrays;

public class Training {

    public static void main(String[] args) {

//1 Перевод числа в строку:
        //  numToStr();
//2 «Вы играете на банджо?». Если ваше имя начинается с буквы «R» или строчной «r», вы играете на банджо!
        // playsBanjo("Ron");
//3 Напишите функцию, которая будет брать количество лепестков каждого цветка и возвращать true, если они влюблены, и false, если нет.
        evenOrNot(5);

    }

    public static boolean evenOrNot(int petal){
        boolean result;
        if (petal % 2 == 0){
            result = true;
        }else {
            result = false;
        }
        return result;
    }










    public static void playsBanjo(String name){
        if (name.contains("R")){
            System.out.println("Вы играете на банджо!");
        } else {
            System.out.println("Вы не играете на банджо!");
        }
    }

    private static void numToStr() {
        int  num = 123;

        String numString1 = String.valueOf(num);
        String numString2 = Integer.toString(num);
        String numString3 = "" + num;
        System.out.println(numString2 + "," + numString1 + "," + numString3);
    }


}
