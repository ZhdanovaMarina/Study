package work_14_03_2025.hw;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        registration(scanner);

        int price = productPrice(scanner);
        printPrice(price);




    }

    public static void registration(Scanner scanner){
        System.out.println("=== Регистрация заказа ===");
        System.out.print("Введите имя покупателя: ");
        String customerName = scanner.nextLine();
        System.out.print("Введите номер телефона покупателя: ");
        String phone = scanner.nextLine();

        // проверка на пустую строку
        if (customerName.isEmpty() || phone.isEmpty()) {
            System.out.println("Ошибка: Имя и телефон не могут быть пустыми!");
            return;
        }

        // проверка на корректный ввод телефона
        if (!phone.matches("\\+?\\d{10,}")) {
            System.out.println("Ошибка: Некорректный формат телефона!");
            return;
        }

    }

    public static int productPrice(Scanner scanner){
        System.out.println("Доступные продукты: 1) Телевизор 2) Холодильник 3) Стиральная машина");
        // сканирование выбранного товара
        System.out.print("Введите номер выбранного продукта: ");
        int productChoice = scanner.nextInt();
        return productChoice;
    }

    public static void printPrice(int productChoice){
        // поиск выбранного покупателем товара
        String productName;
        double productPrice;
        switch (productChoice) {
            case 1 -> {
                productName = "Телевизор";
                productPrice = 20000;
            }
            case 2 -> {
                productName = "Холодильник";
                productPrice = 30000;
            }
            case 3 -> {
                productName = "Стиральная машина";
                productPrice = 25000;
            }
            default -> {
                System.out.println("Ошибка: Неверный выбор продукта!");
                return;
            }
        }
    }


    public static void discount(int productPrice){
        //вычисление скидки
        double discount = 0.0;
        if (productPrice > 25000) {
            discount = 0.1; // 10%
        }
    }

    public void invoiceForPayment(int productPrice, int discount, String customerName, int phone, String productName){
        // вывод счета
        double finalPrice = productPrice - productPrice * discount;
        String invoice = String.format(
                "СЧЁТ\n" +
                        "Покупатель: %s\n" +
                        "Телефон: %s\n" +
                        "Товар: %s\n" +
                        "Цена без скидки: %.2f\n" +
                        "Скидка: %.0f%%\n" +
                        "Итого к оплате: %.2f\n",
                customerName, phone, productName,
                productPrice, discount * 100, finalPrice
        );
    }

/**    public void placeAnOrder(String customerName, int phone, String productName, int finalPrice, String invoice){
        // оформление заказа
        String orderRecord = "Покупатель: " + customerName
                + ", Телефон: " + phone
                + ", Товар: " + productName
                + ", Итого: " + finalPrice;
        ordersDB.add(orderRecord);
        System.out.println("\nЗаказ успешно оформлен!");
        System.out.println(invoice);
    }
*/










}
