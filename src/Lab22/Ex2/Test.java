package Lab22.Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    static int quant = 6;
    static List<Student> students = new ArrayList<>();

    static Student findByName(String fullName){
        try{
            for (Student student: students)
                if (student.getFullName().equals(fullName))
                    return student;

            throw new MyException(fullName);
        }
        catch (MyException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    static Student randomStudent(){
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

    static void fillInStudentsInfo() {
        for (int i = 0; i < quant; i++)
            students.add(randomStudent());
    }

    static void outputStudentsInfo() {
        System.out.println("Фамилия\tИмя\tОтчество\tID\tСредний балл");
        for (int i = 0; i < quant; i++)
            System.out.println(students.get(i).getFullName() + "\t" + students.get(i).getiDNumber() + "\t" + students.get(i).getGpa());
    }

    public static void main(String[] args) {
        fillInStudentsInfo();
        outputStudentsInfo();

        System.out.println("Сортировка по ID");
        Collections.sort(students);

        outputStudentsInfo();

        System.out.println("Сортировка по среднему баллу");
        students.sort(new SortingStudentsByGPA().comparator);

        outputStudentsInfo();
    }
}
