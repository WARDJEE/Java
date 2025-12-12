package week11.Woordenboek;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> words = new HashMap<>();

    public void addWord(String word, String translation){
        this.words.put(word, translation);
    }

    public String translate(String word){
        if (!this.words.containsKey(word)) return "Vertaling niet gevonden";
        return this.words.get(word);
    }

    public int numberOfWords(){
        return this.words.size();
    }
}
