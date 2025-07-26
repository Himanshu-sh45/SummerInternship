import java.util.HashMap;

public class D18_HashMap_Q2 {
    public static void main(String[] args) {
        String str = "swiss";

        Character result = findFirstNonRepeatingChar(str);
        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static Character findFirstNonRepeatingChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }
}
