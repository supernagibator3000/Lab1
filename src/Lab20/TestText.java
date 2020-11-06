package Lab20;

public class TestText {
    public static void main(String[] args) {
        String[] words = {"hi", "hello", "hi", "hi", "good", "morning"};

        MyText myText = new MyText();

        myText.wordsCounter(words);
        myText.wordsCounterOutput();

        System.out.println(myText.getMostUsedWord());
    }
}
