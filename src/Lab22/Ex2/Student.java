package Lab22.Ex2;

public class Student implements GettersSetters{
    private String fullName;
    private int iDNumber;
    private int gpa;

    public Student(String fullName, int iDNumber, int gpa) {
        this.fullName = fullName;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int getGpa() {
        return gpa;
    }

    @Override
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(GettersSetters o) {
        return (this.iDNumber > ((Student) o).iDNumber) ? 1 : -1;
    }
}
