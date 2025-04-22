# Задача 1
```java
import java.util.Scanner;

public class PrimesAllInOne {
    public static void main(String[] args) {

        // считываем число с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        
        
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
```

# Задача 2
```java
import java.util.Scanner;

public class MatrixAllInOne {
    public static void main(String[] args) {

        // считываем с клавиатуры число строк и сболбцов
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите число столбцов: ");
        int cols = scanner.nextInt();


        // создаем двухмерный массив
        int[][] matrix = new int[rows][cols];


        // ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //  вывод сумм по строкам
        System.out.println("Суммы по строкам:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Строка " + i + ": " + rowSum);
        }


        System.out.println("Суммы по столбцам:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Столбец " + j + ": " + colSum);
        }

        scanner.close();
    }
    
}



# Задача 2


public static void processOrder() {

    // создание сканера
    Scanner scanner = new Scanner(System.in);

    //регистрация заказа, ввод имени и номера телефона
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
    // Вывод на эран товара
    System.out.println("Доступные продукты: 1) Телевизор 2) Холодильник 3) Стиральная машина");

    // сканирование выбранного товара
    System.out.print("Введите номер выбранного продукта: ");
    int productChoice = scanner.nextInt();

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

    //вычисление скидки
    double discount = 0.0;
    if (productPrice > 25000) {
        discount = 0.1; // 10%
    }

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
    
    // оформление заказа
    String orderRecord = "Покупатель: " + customerName
            + ", Телефон: " + phone
            + ", Товар: " + productName
            + ", Итого: " + finalPrice;
    ordersDB.add(orderRecord);
    System.out.println("\nЗаказ успешно оформлен!");
    System.out.println(invoice);
}

```
