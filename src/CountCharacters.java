 import java.util.Scanner;
public class CountCharacters {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println(vowels + " " + consonants + " " + digits + " " + special);
    }
}
