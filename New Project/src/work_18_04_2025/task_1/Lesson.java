package work_18_04_2025.task_1;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {

        Salesperson salesperson = new Salesperson("Pavel", 50);
        salesperson.setSales(5000);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Olga", 100));
        employees.add(salesperson);

        double result = 0;
        for (int i = 0; i < employees.size(); i++) {
             result += employees.get(i).calcSalary(168);
        }

        System.out.println(result);


        /*
        1) i = 0;
        result = 0;
        result += 18480
        2) i = 1;

         */
    }

}
