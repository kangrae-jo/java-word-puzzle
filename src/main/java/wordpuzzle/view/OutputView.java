package wordpuzzle.view;

public class OutputView {

    public void showSuggestWord(String word) {
        System.out.println("단어 퍼즐 게임을 시작합니다.\n");
        System.out.printf("제시단어: \"%s\"\n\n", word);
    }

    public void showCollect() {
        System.out.println("정답입니다. 축하합니다.\n");
    }

    public void showWrong() {
        System.out.println("정답이 아닙니다.\n");

    }

}
