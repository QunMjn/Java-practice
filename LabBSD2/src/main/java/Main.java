//Trần Đặng Minh Quân -SE180398
public class Main {
    public static void main(String[] args) {
        String input = "hello world";
        IStringProcessor stringProcessor = new MyString();

        String reversed = stringProcessor.reverseString(input);
        System.out.println("Reversed: " + reversed); // Output: "dlrow olleh"

        String withoutDuplicates = stringProcessor.removeDuplicateCharacters(input);
        System.out.println("Without Duplicates: " + withoutDuplicates); // Output: "helo wrd"

        String withSpecialCharacter = stringProcessor.insertSpecialCharacter(input);
        System.out.println("With Special Character: " + withSpecialCharacter); // Output: "h$e$l$l$o w$o$r$l$d"
    }
}
