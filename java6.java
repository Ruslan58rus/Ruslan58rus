import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class java6{

    private String string;
    private int max = 0;

    public java6(String string) {
        this.string = string;
    }
 
    public void mostFrequentChars() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        while (string.length() != 0) {
            int count = countCharacter(string, string.charAt(0));
            if (count > max) {
                max = count;
            }
            Character character = string.charAt(0);
            map.put(character, count);
            string = removeCharacters(string, string.charAt(0));
        }
 
        printResult(map);
    }

    private void printResult(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
 
    public int countCharacter(StringBuilder string, char c) {
        if (string.length() == 0) return 0;
        return (string.charAt(0) == c)
                ? 1 + countCharacter(string.delete(0, 1), c)
                : countCharacter(string.delete(0, 1), c);
    }
 
    public int countCharacter(String string, char c) {
        StringBuilder stringBuilder = new StringBuilder(string.subSequence(0, string.length()));
        return countCharacter(stringBuilder, c);
    }
 
    public String removeCharacters(String string, char c) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != c)
                stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        new Runnable() {
            public void run() {
                Scanner scanner = new Scanner(System.in);
                new java6(scanner.nextLine()).mostFrequentChars();
            }
        }.run();
    }
}