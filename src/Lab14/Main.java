package Lab14;

import Lab13.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int quant = 6;
    static ArrayList<Student> students = new ArrayList<>();

    static void fillInStudentsInfo() {
        System.out.println("Новый список");
        for (int i = 0; i < quant; i++){
            students.add(new Student());
            students.get(i).setiDNumber((int)(Math.random()*1000));
            students.get(i).setGpa((int)(Math.random()*100));
        }
    }

    static void outputStudentsInfo() {
        System.out.println(" " + "\t" + "ID" + "\t" + "GPA");
        for (int i = 0; i < quant; i++) {
            System.out.print(i);
            System.out.print("\t" + students.get(i).getiDNumber());
            System.out.print("\t" + students.get(i).getGpa() + "\n");
        }
    }

    static void checkInd(int ind){
        if (ind < 0)
            System.out.println("Студент не найден");
        else
            System.out.println("Итоговая оценка студента: " + students.get(ind).getGpa());
    }

    public static void main(String[] args) {
        fillInStudentsInfo();
        outputStudentsInfo();

        Sorts sorts = new Sorts();

        System.out.println("QuickSort");
        sorts.quickSort(students, 0, students.size()-1);
        outputStudentsInfo();

        fillInStudentsInfo();
        outputStudentsInfo();

        System.out.println("MergeSort");
        students = sorts.mergeSort(students);
        outputStudentsInfo();
        System.out.println(students.size());

//        Searches searches = new Searches();
//        Student student = new Student();
//        Scanner sc = new Scanner(System.in);
//        int ind = -1;
//        System.out.println("Итеративный бинарный поиск");
//        System.out.println("Введите ID искомого студента: ");
//        student.setiDNumber(sc.nextInt());
//        ind = searches.binSearchIter(students, student);
//        checkInd(ind);
//
//        System.out.println("Рекурсивный бинарный поиск");
//        System.out.println("Введите ID искомого студента: ");
//        student.setiDNumber(sc.nextInt());
//        ind = searches.binSearchRec(students, student, 0, students.size());
//        checkInd(ind);
//
//        fillInStudentsInfo();
//        outputStudentsInfo();
//
//        System.out.println("Итеративный линейный поиск");
//        System.out.println("Введите ID искомого студента: ");
//        student.setiDNumber(sc.nextInt());
//        ind = searches.linearSearchIter(students, student);
//        checkInd(ind);
//
//        System.out.println("Рекурсивный линейный поиск");
//        System.out.println("Введите ID искомого студента: ");
//        student.setiDNumber(sc.nextInt());
//        ind = searches.linearSearchRec(students, student);
//        checkInd(ind);
    }
}
