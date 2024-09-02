package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String text = "The sun was shining brightly. " +
                "Birds were singing in the trees! " +
                "It was a perfect day for a walk in the park.";

        List<String> sentences = Arrays.stream(text.split("[.<?!]")).toList();
        System.out.println(sentences);
        System.out.println("Count: " + sentences.size());
        //
        List<String> words = Arrays.stream(text.split("[.<?!\\s]")).filter(s -> !s.isBlank())
                .toList();
        System.out.println(words);
        System.out.println("Count: " + words.size());
        //
        char[] chars = text.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString()
                .toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println("Count: " + chars.length);
    }
}
