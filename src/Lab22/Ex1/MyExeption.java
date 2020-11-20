package Lab22.Ex1;

public class MyExeption extends Throwable{
    public String getMessage(){
        return new String("Неверный ИНН");
    }
}
