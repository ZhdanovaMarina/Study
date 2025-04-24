package hw_22_04_2025;

public class DiscountService {
    public static void main(String[] args) {
        double finalPrice = finalPrice(150, true);
        System.out.println(finalPrice);
    }


    public static double finalPrice(double price, boolean isVip) {
        double result = (isVip) ? price - ((price * 7) / 100) : price;
        return result;
    }

}
