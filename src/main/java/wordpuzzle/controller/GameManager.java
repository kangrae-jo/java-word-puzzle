package wordpuzzle.controller;

import wordpuzzle.model.DictionaryReader;
import wordpuzzle.model.Words;
import wordpuzzle.view.InputView;
import wordpuzzle.view.OutputView;

public class GameManager {

    private final InputView inputView;
    private final OutputView outputView;

    public GameManager(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startGame() {
        Words words = readDictionary();
        showSuggestWord(words);
    }

    private Words readDictionary() {
        return new Words(DictionaryReader.readDictionary());
    }

    private void showSuggestWord(Words words) {
        outputView.showSuggestWord(words.getOneWord());
    }
}
