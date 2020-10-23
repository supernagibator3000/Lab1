package Lab14;

import Lab13.Student;

import java.util.ArrayList;


public class Searches {
    public static int linearSearchIter(ArrayList<Student> students, Student g){
        for (int i = 0; i < students.size(); i++)
            if(students.get(i).equals(g))
                return i;
        return Integer.MIN_VALUE;
    }

    public static int binSearchIter(ArrayList<Student> students, Student g){
        int mid, min=0, max = students.size();
        while(true){
            mid=(max-min)/2+min;
            if((mid==min)||(mid==max))
                break;
            if(g.getiDNumber()>=students.get(mid).getiDNumber())
                min=mid;
            else max=mid;
        }
        if(students.get(mid).equals(g))
            return mid;
        else
            return Integer.MIN_VALUE;
    }

    public static int linearSearchRec(ArrayList<Student> students, Student g) {
        if(students.size()==0)
            return Integer.MIN_VALUE;
        if(!students.get(0).equals(g)){
            ArrayList<Student> gettersCopy=new ArrayList<Student>();
            for (int i = 1; i < students.size(); i++)
                gettersCopy.set(i-1, students.get(i));
            return 1+linearSearchRec(gettersCopy,g);
        }
        else return 0;
    }

    public static int binSearchRec(ArrayList<Student> students, Student g, int min, int max) {
        int mid=(max-min)/2+min;
        if((mid==min)||(mid==max)){
            if(students.get(mid).equals(g))
                return mid;
            else return Integer.MIN_VALUE;
        }
        else if(g.getiDNumber()>=students.get(mid).getiDNumber())
            return binSearchRec(students,g,mid,max);
        else
            return binSearchRec(students,g,min,mid);
    }
}