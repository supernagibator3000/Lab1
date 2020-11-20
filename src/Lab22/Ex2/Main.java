package Lab22.Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    final String endingWord = "END";
    List<GettersSetters> students = new ArrayList<>();

    GettersSetters findByName(String fullName){
        try{
            for (GettersSetters student: students)
                if (student.getFullName().equals(fullName))
                    return student;

            throw new MyException(fullName);
        }
        catch (MyException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    Student randomStudent(){
        String fullName = "";

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 6; j++){
                if (j == 0)
                    fullName += (char)(1040 + Math.random() * 32);
                else
                    fullName += (char)(1072 + Math.random() * 32);
            }

            if (i < 2)
                fullName += " ";
        }

        return new Student(fullName, (int)(Math.random()*1000), (int)(Math.random()*100));
    }

    void fillInStudentsRandom(int n) {
        for (int i = 0; i < n; i++)
            students.add(randomStudent());
    }

    void fillInStudents(){
        String[] infoBuff = new String[5];
        String buff = sc.nextLine();
        while (!buff.equals(endingWord)){
            infoBuff = buff.split(" ");
            if (infoBuff.length == 5)
                students.add(new Student(infoBuff[0] + " " + infoBuff[1] + " " + infoBuff[2], Integer.parseInt(infoBuff[3]), Integer.parseInt(infoBuff[4])));
            buff = sc.nextLine();
        }
    }

    void outputStudentsInfo() {
        System.out.println("-----------------------------------------");
        System.out.println("Список студентов:\nФамилия\tИмя\tОтчество\tID\tСредний балл");
        for (GettersSetters student: students)
            System.out.println(student.getFullName() + "\t" + student.getiDNumber() + "\t" + student.getGpa());
        System.out.println("-----------------------------------------");
    }

    public Main() {
        System.out.println("Выберите вариант работы с приложением и введите его номер:\n1. Автоматическое заполнение полей данных\n2. Ручное заполнение полей данных");

        String buff = sc.nextLine();
        switch (buff){
            default -> System.out.println("Неправильный ввод");
            case "1" -> {
                System.out.println("Введите количество студентов: ");
                fillInStudentsRandom(Integer.parseInt(sc.nextLine()));
                outputStudentsInfo();
            }
            case "2" -> {
                System.out.println("Введите информацию о студентах в формате: \"Фамилия\" \"Имя\" \"Отчество\" \"ID\" \"Средний\" \"балл\"\nДля завершения введите \"END\"");
                fillInStudents();
                outputStudentsInfo();
            }
        }

        buff = "";
        GettersSetters student;
        while (!buff.equals(endingWord)){
            System.out.println("-----------------------------------------" +
                    "\nПользовательское меню" +
                    "\n1. Сортировка списка по ID" +
                    "\n2. Сортировка списка по среднему баллу" +
                    "\n3. Поиск по ФИО" +
                    "\nВведите номер варианта для его выполнения" +
                    "\nВведите \"END\" для завершения работы" +
                    "\n-----------------------------------------");

            buff = sc.nextLine();
            switch (buff){
                default -> System.out.println("Неправильный ввод");
                case "1" -> {
                    System.out.println("Сортировка по ID");
                    Collections.sort(students);
                    outputStudentsInfo();
                }
                case "2" -> {
                    System.out.println("Сортировка по GPA");
                    students.sort(new SortingStudentsByGPA().comparator);
                    outputStudentsInfo();
                }
                case "3" -> {
                    System.out.println("Введите ФИО искомого студента:");
                    student = findByName(sc.nextLine());
                    if (student != null)
                        System.out.println("Результат поиска:\n" + student.getFullName() + " " + student.getiDNumber() + " " + student.getGpa());
                }
                case "END" -> System.out.println("Завершение работы");
            }
        }
    }
}