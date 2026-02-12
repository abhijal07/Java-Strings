import java.util.Scanner;

public class CountCharactersEOF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        // Read input until EOF
        while (sc.hasNext()) {
            String word = sc.next();
            count += word.length();
        }

        System.out.println(count);
        sc.close();
    }
}
