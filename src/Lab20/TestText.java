package Lab20;

public class TestText {
    public static void main(String[] args) {
        String text = "Метод replace() — возвращает В Java новую строку, в результате, заменив все вхождения oldChar, в данной строке, на newChar, другими словами — метод позволяет заменить символ в строке.";
        MyText myText = new MyText();

        myText.wordsCounter(myText.fromTextToArray(text));

        System.out.println("Самое частое слово: " + myText.getMostUsedWord());

        System.out.println(myText.replaceSpacebar('#', text));
    }
}
