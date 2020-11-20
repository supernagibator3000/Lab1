package Lab22.Ex2;

public class MyException extends Throwable{
    private String message;

    public MyException(String fullName){
        message = "Студент " + fullName + " не найден";
    }

    public String getMessage(){
        return message;
    }
}
