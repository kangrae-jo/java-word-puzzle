package wordpuzzle.controller;

import wordpuzzle.model.DictionaryReader;
import wordpuzzle.model.MixWord;
import wordpuzzle.model.Words;
import wordpuzzle.util.Console;
import wordpuzzle.view.InputView;
import wordpuzzle.view.OutputView;

public class GameManager {

    private static final int TRY_TIMES = 3;
    private final InputView inputView;
    private final OutputView outputView;

    public GameManager(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startGame() {
        Words words = readDictionary();
        do {
            String word = words.getOneWord();
            showSuggestWord(MixWord.mixWord(word));
            tryAnswer(word);
        } while (askRestart());
        Console.close();
    }

    private Words readDictionary() {
        return new Words(DictionaryReader.readDictionary());
    }

    private void showSuggestWord(String word) {
        outputView.showSuggestWord(word);
    }

    private void tryAnswer(String word) {
        for (int i = 0; i < TRY_TIMES; i++) {
            if (isCollect(inputView.inputAnswer(), word)) {
                outputView.showCollect();
                break;
            }
            outputView.showWrong();
        }
    }

    private boolean isCollect(String answer, String word) {
        return answer.equals(word);
    }

    private boolean askRestart() {
        String answer = inputView.askRestart();
        return answer.equals("y") || answer.equals("Y");
    }
}
