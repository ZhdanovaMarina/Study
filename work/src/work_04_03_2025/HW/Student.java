package work_04_03_2025.HW;

import java.util.List;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public void printStudent(List<Student> students) {
        if (students.contains(grade >= 70)) {
            System.out.println(students);
        } else {
            students.remove(grade < 70);
        }
    }
}
