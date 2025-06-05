package hw_18_05_2025.task28.util;

public final class MathUtils {


    private MathUtils() {

    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int num = a % b;
            a = b;
            b = num;
        }
        return a;
    }
}
