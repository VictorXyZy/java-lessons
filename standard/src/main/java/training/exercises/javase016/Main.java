package training.exercises.javase016;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String text = "victor xyzy victor Mungereti victor guiltythree open";

        text = text.toLowerCase();

        String[] words = text.split(" ");

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        for (String word : words) {
            hashSet.add(word);
            linkedHashSet.add(word);
        }

        System.out.println("Input: " + text);

        System.out.println("\nHashSet:");
        System.out.println("Unique words count: " + hashSet.size());
        System.out.println("Words: " + hashSet);

        System.out.println("\nLinkedHashSet:");
        System.out.println("Unique words count: " + linkedHashSet.size());
        System.out.println("Words: " + linkedHashSet);
    }
}
