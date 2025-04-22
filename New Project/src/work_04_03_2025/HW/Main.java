package work_04_03_2025.HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Petya", 75));
        students.add(new Student("Vera", 92));
        students.add(new Student("Sveta", 69));
        students.add(new Student("Katya", 30));
        students.add(new Student("Dima", 70));

        printStudent(students);
        deleteStudent(students);


    }

    public static void deleteStudent(List<Student> students) {


    }


    public static void printStudent(List<Student> students) {
        for (Student student : students) {
            if (student.getGrade() >= 70) {
                System.out.println("Оценка выше 70 у студента по имени: " + student.getName());
            }
        }
    }
}
