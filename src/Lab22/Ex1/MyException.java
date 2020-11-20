package Lab22.Ex1;

public class MyException extends Throwable{
    public String getMessage(){
        return new String("Неверный ИНН");
    }
}
