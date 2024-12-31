package wordpuzzle.model;

import java.util.List;

public class Words {

    private static final int TXT_SIZE = 26;
    private final List<Word> words;

    public Words(List<Word> words) {
        this.words = words;
    }

    public Word getOneWord() {
        return words.get(makeRandomNumber());
    }

    private int makeRandomNumber() {
        return (int) (Math.random() * 100) % TXT_SIZE;
    }

}
