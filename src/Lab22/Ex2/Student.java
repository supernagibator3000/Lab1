package Lab22.Ex2;

public class Student implements Comparable<Student>{
    private String fullName;
    private int iDNumber;
    private int gpa;

    public Student(String fullName, int iDNumber, int gpa) {
        this.fullName = fullName;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

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
