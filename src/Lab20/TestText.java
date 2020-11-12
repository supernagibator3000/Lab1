package Lab20;

public class TestText {
    public static void main(String[] args) {
        MyText myText = new MyText();

        myText.textReader("Labs\\src\\Lab20\\text");
        myText.tenMostUsedWords();
        myText.replaceSpacebarFile("Labs\\src\\Lab20\\text");
    }
}
