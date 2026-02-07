import java.util.Scanner;

public class CharClassification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String input = sc.nextLine().trim();

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int otherCount = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } 
            else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } 
            else {
                otherCount++;
            }
        }

        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Other characters : " + otherCount);

        sc.close();
    }
}
