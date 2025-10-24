// package week02.assignment01; // <- optional, if you made a package
import java.util.*; // Scanner, List, ArrayList, Map, HashMap

public class WordLengthMapApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1) Empty list of Strings
        List<String> words = new ArrayList<>();

        System.out.println("Enter 10 words:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Word " + i + ": ");
            String word = input.nextLine().trim();
            words.add(word);                 // works now (real List)
        }

        // 2) Map: key = length, value = word
        Map<Integer, String> wordMap = new HashMap<>();
        for (String w : words) {             // works now (enhanced for over List)
            wordMap.put(w.length(), w);      // later words of same length overwrite earlier ones
        }

        // 3) Print the map
        System.out.println("\nMap contents (key = word length, value = word):");
        for (Map.Entry<Integer, String> entry : wordMap.entrySet()) {
            System.out.println("Length " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
