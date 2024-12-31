package wordpuzzle.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryReader {

    private final static String DICTIONARY_PATH = "src/main/java/resources/dictionary.txt";

    public static List<String> readDictionary() {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(DICTIONARY_PATH))) {
            String dictionary;
            while ((dictionary = reader.readLine()) != null) {
                words.add(dictionary);
            }
        } catch (IOException e) {
            System.err.println("[ERROR]: 단어를 가져오는 중 오류가 발생했습니다. " + e.getMessage());
        }
        return words;
    }
}
