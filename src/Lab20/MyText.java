package Lab20;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MyText {
    private HashMap<String, Integer> wordsMap;

    public MyText(){
        wordsMap = new HashMap<>();
    }

    public String getMostUsedWord(){
        return this.getMostUsedWordPair().getKey();
    }

    public int getMostUsedWornCounter(){
        return this.getMostUsedWordPair().getValue();
    }

    public Map.Entry<String, Integer> getMostUsedWordPair(){
        HashMap.Entry<String, Integer> max = new AbstractMap.SimpleEntry<String, Integer>("", 0);

        for (HashMap.Entry<String, Integer> pair : wordsMap.entrySet())
            if (pair.getValue() > max.getValue())
                max = pair;

        return max;
    }

    public void wordsCounter(String[] words){
        int counter = 0;
        String buff;

        for (String word: words){
            wordsMap.computeIfPresent(word, (key, value) -> value + 1);
            wordsMap.putIfAbsent(word, 1);
        }
    }

    public void wordsCounterOutput(){
        String key;
        Integer value;

        for (HashMap.Entry<String, Integer> pair : wordsMap.entrySet()) {
            key = pair.getKey();
            value = pair.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
