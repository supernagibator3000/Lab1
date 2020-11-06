package Lab19;

public class TestFile {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // String path = sc.nextLine();

        String path = "C:\\Users\\Владимир\\Desktop\\Универ\\3 семестр\\Разработка на жабе\\Labs\\src\\Lab19\\text";

        MyFile myFile = new MyFile(path);

        System.out.println("Запись в файл введённой с клавиатуры информации");
        myFile.write("end", true);
        System.out.println("\nСодержимое файла:");
        myFile.output();

        System.out.println("\n\nПерезапись файла");
        myFile.write("end", false);
        System.out.println("\nСодержимое файла:");
        myFile.output();

        System.out.println("\n\nЗапись информации в конец файла");
        myFile.write("end", true);
        System.out.println("\nСодержимое файла:");
        myFile.output();
    }
}
