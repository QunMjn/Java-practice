
import java.util.HashSet;
import java.util.Set;

public class MyString implements IStringProcessor {
    @Override
    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    @Override
    public String removeDuplicateCharacters(String input) {
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        return sb.toString();
    }

    @Override
    public String insertSpecialCharacter(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
            if (i % 2 == 1) {
                sb.append('$');
            }
        }
        return sb.toString();
    }
}
