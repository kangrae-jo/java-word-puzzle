package wordpuzzle;

import wordpuzzle.controller.GameManager;
import wordpuzzle.view.InputView;
import wordpuzzle.view.OutputView;

public class Application {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager(new InputView(), new OutputView());
        gameManager.startGame();
    }
}
