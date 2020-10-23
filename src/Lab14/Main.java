package Lab14;

import Lab13.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static double timeStart, timeEnd;
    static int quant = 6;
    static ArrayList<Student> students = new ArrayList<>();

    static void fillInStudentsInfo() {
        for (int i = 0; i < quant; i++){
            students.add(new Student());
            students.get(i).setiDNumber((int)(Math.random()*1000));
            students.get(i).setGpa((int)(Math.random()*100));
        }
    }

    static void outputStudentsInfo() {
        System.out.println(" " + "\t" + "ID" + "\t" + "GPA");
        for (int i = 0; i < students.size(); i++) {
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

    static void time(){
        System.out.println("Время выполнения алгоритма: " + (timeEnd - timeStart) / 1000 + " секунд");
    }

    public static void main(String[] args) {
        System.out.println("Новый список");
        fillInStudentsInfo();
        outputStudentsInfo();

        Sorts sorts = new Sorts();

        sorts.setC(0);
        System.out.println("\nQuickSort");
        timeStart = System.currentTimeMillis();
        sorts.quickSort(students, 0, students.size()-1);
        timeEnd = System.currentTimeMillis();
        outputStudentsInfo();
        time();
        System.out.println("Вычислительная сложность алгоритма: " + sorts.getC() + "\n======================================\n");

        students.clear();
        System.out.println("Новый список");
        fillInStudentsInfo();
        outputStudentsInfo();

        sorts.setC(0);
        System.out.println("\nMergeSort");
        timeStart = System.currentTimeMillis();
        students = sorts.mergeSort(students);
        timeEnd = System.currentTimeMillis();
        outputStudentsInfo();
        time();
        System.out.println("Вычислительная сложность алгоритма: " + sorts.getC() + "\n======================================\n");


        Searches searches = new Searches();
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        int ind;

        searches.setC(0);
        System.out.println("\nИтеративный бинарный поиск");
        System.out.println("Введите ID искомого студента: ");
        student.setiDNumber(sc.nextInt());
        timeStart = System.currentTimeMillis();
        ind = searches.binSearchIter(students, student);
        checkInd(ind);
        timeEnd = System.currentTimeMillis();
        time();
        System.out.println("Вычислительная сложность алгоритма: " + searches.getC() + "\n======================================\n");

        searches.setC(0);
        System.out.println("\nРекурсивный бинарный поиск");
        System.out.println("Введите ID искомого студента: ");
        student.setiDNumber(sc.nextInt());
        timeStart = System.currentTimeMillis();
        ind = searches.binSearchRec(students, student, 0, students.size());
        checkInd(ind);
        timeEnd = System.currentTimeMillis();
        time();
        System.out.println("Вычислительная сложность алгоритма: " + searches.getC() + "\n======================================\n");

        students.clear();
        System.out.println("Новый список");
        fillInStudentsInfo();
        outputStudentsInfo();

        searches.setC(0);
        System.out.println("\nИтеративный линейный поиск");
        System.out.println("Введите ID искомого студента: ");
        student.setiDNumber(sc.nextInt());
        timeStart = System.currentTimeMillis();
        ind = searches.linearSearchIter(students, student);
        checkInd(ind);
        timeEnd = System.currentTimeMillis();
        time();
        System.out.println("Вычислительная сложность алгоритма: " + searches.getC() + "\n======================================\n");

        searches.setC(0);
        System.out.println("\nРекурсивный линейный поиск");
        System.out.println("Введите ID искомого студента: ");
        student.setiDNumber(sc.nextInt());
        timeStart = System.currentTimeMillis();
        ind = searches.linearSearchRec(students, student);
        checkInd(ind);
        timeEnd = System.currentTimeMillis();
        time();
        System.out.println("Вычислительная сложность алгоритма: " + searches.getC() + "\n======================================\n");
    }
}