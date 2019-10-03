import java.util.Scanner;

public class ActualWeight {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int sumOfUpperWeight = 0;
        int sumofLowerWeight = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character >= 'A' && character <= 'Z') {
                sumOfUpperWeight = sumOfUpperWeight + (int) character;
            } else if (character >= 'a' && character <= 'z') {
                sumofLowerWeight = sumofLowerWeight + (int) character;

            }
        }
        int absoluteWeight = sumOfUpperWeight - sumofLowerWeight;
        if (absoluteWeight >= 0) {
            System.out.println(absoluteWeight);
        }
    }
}