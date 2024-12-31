package wordpuzzle.view;

import wordpuzzle.util.Console;

public class InputView {

    public String inputAnswer() {
        System.out.print("정답: ");
        return Console.readLine();
    }
}
