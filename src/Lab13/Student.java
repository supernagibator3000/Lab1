package Lab13;

public class Student implements Comparable<Student>{
    private int iDNumber;
    private int gpa;

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student student) {
        return (this.iDNumber > student.iDNumber) ? 1 : -1;
    }
}
