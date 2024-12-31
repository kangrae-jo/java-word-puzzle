package wordpuzzle.model;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Collections;
import java.util.List;

public class MixWord {

    public static String mixWord(String word) {
        List<Character> characters = word.chars()
                .mapToObj(c -> (char) c)
                .collect(toList());

        Collections.shuffle(characters);

        return characters.stream()
                .map(String::valueOf)
                .collect(joining());
    }
}
