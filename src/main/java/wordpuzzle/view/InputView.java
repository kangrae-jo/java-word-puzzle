package wordpuzzle.view;

import wordpuzzle.util.Console;

public class InputView {

    public String inputAnswer() {
        System.out.print("정답: ");
        return Console.readLine();
    }

    public String askRestart() {
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
        return Console.readLine();
    }
}
