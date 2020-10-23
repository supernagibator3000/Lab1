package Lab13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    static int quant = 6;
    static List<Student> students = new ArrayList<>();

    static void fillInStudentsInfo() {
        for (int i = 0; i < quant; i++){
            students.add(new Student());
            students.get(i).setiDNumber((int)(Math.random()*1000));
            students.get(i).setGpa((int)(Math.random()*100));
        }
    }

    static void outputStudentsInfo() {
        System.out.println(" " + "\t" + "ID" + "\t" + "GPA");
        for (int i = 0; i < quant; i++)
            System.out.println(i + "\t" + students.get(i).getiDNumber() + "\t" + students.get(i).getGpa());
    }

    public static void main(String[] args) {
        fillInStudentsInfo();
        outputStudentsInfo();

        System.out.println("Сортировка по iDNumber");
        Collections.sort(students);

        outputStudentsInfo();

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();

        System.out.println("Сортировка по GPA");
        Collections.sort(students, sortingStudentsByGPA.comparator);

        outputStudentsInfo();
    }
}
