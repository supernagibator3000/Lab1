package Lab14;

import Lab13.Student;

import java.util.ArrayList;


public class Searches {
    private static int C = 0;

    public int getC(){
        return C;
    }

    public void setC(int C){
        this.C = C;
    }

    public static int linearSearchIter(ArrayList<Student> students, Student student){
        for (int i = 0; i < students.size(); i++) {
            C++;
            if (students.get(i).getiDNumber() == student.getiDNumber())
                return i;
        }
        return Integer.MIN_VALUE;
    }

    public static int binSearchIter(ArrayList<Student> students, Student student){
        int mid, min = 0, max = students.size();
        while(true){
            C++;
            mid = (max - min) / 2 + min;
            if((mid == min) || (mid == max))
                break;
            if(student.getiDNumber() >= students.get(mid).getiDNumber())
                min = mid;
            else
                max = mid;
        }
        C++;
        if(students.get(mid).getiDNumber() == student.getiDNumber())
            return mid;
        else
            return Integer.MIN_VALUE;
    }

    public static int linearSearchRec(ArrayList<Student> students, Student student) {
        C++;
        if(students.size() == 0)
            return Integer.MIN_VALUE;
        if(students.get(0).getiDNumber() != student.getiDNumber()){
            ArrayList<Student> studentsCopy=new ArrayList<Student>();
            for (int i = 1; i < students.size(); i++) {
                studentsCopy.add(new Student());
                studentsCopy.set(i - 1, students.get(i));
            }
            return 1 + linearSearchRec(studentsCopy, student);
        }
        else
            return 0;
    }

    public static int binSearchRec(ArrayList<Student> students, Student student, int min, int max) {
        int mid = (max - min) / 2 + min;
        C++;
        if((mid == min) || (mid == max)){
            C++;
            if(students.get(mid).getiDNumber() == student.getiDNumber()) {
                return mid;
            }
            else
                return Integer.MIN_VALUE;
        }
        else if(student.getiDNumber() >= students.get(mid).getiDNumber())
            return binSearchRec(students, student, mid, max);
        else
            return binSearchRec(students, student, min, mid);
    }
}