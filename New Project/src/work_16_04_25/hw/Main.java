package work_16_04_25.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Olga", 75));
        students.add(new Student("Dima", 62));
        students.add(new Student("Oleg", 52));
        students.add(new Student("Pavel", 30));
        students.add(new Student("Polina", 70));

        studentSorting(students);

    }

    // [Student,Student,Student,Student,Student....]
    public static void studentSorting(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGrade() > 70){
                System.out.println(students.get(i).getName());
            }

        }
    }

}
