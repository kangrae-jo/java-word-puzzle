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
        String word = words.getOneWord();
        showSuggestWord(word);
        for (int i = 0; i < 3; i++) {
            if (isCollect(inputView.inputAnswer(), word)) {
                outputView.showCollect();
                break;
            }
            outputView.showWrong();
        }
    }

    private Words readDictionary() {
        return new Words(DictionaryReader.readDictionary());
    }

    private void showSuggestWord(String word) {
        outputView.showSuggestWord(word);
    }

    private boolean isCollect(String answer, String word) {
        return answer.equals(word);
    }
}
