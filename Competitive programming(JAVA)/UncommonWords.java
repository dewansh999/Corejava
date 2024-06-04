import java.util.ArrayList;
import java.util.List;

public class UncommonWords {
    public static List<String> findUncommonWords(String s1, String s2) {
        // Split the sentences into words
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        // Create lists to store word occurrences
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // Count word occurrences in the first sentence
        for (String word : words1) {
            if (!list1.contains(word)) {
                list1.add(word);
            } else {
                list2.add(word);
            }
        }

        // Count word occurrences in the second sentence
        for (String word : words2) {
            if (!list2.contains(word)) {
                list2.add(word);
            } else {
                list1.add(word);
            }
        }

        // Create a list to store uncommon words
        List<String> uncommon = new ArrayList<>();

        // Identify and add uncommon words
        for (String word : list1) {
            if (!list2.contains(word)) {
                uncommon.add(word);
            }
        }
        for (String word : list2) {
            if (!list1.contains(word)) {
                uncommon.add(word);
            }
        }

        return uncommon;
    }

    public static void main(String[] args) {
        String s1 = "this is a sample sentence";
        String s2 = "this is another sentence";
        List<String> result = findUncommonWords(s1, s2);
        System.out.println(result);
    }
}
