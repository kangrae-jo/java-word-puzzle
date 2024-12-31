package wordpuzzle.model;

import java.util.List;

public class Words {

    private static final int TXT_SIZE = 26;
    private final List<String> words;

    public Words(List<String> words) {
        this.words = words;
    }

    public String getOneWord() {
        return words.get(makeRandomNumber());
    }

    private int makeRandomNumber() {
        return (int) (Math.random() * 100) % TXT_SIZE;
    }
}
