import java.util.Scanner;

public class UpperWeight {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character >= 'A' && character <= 'Z') {
                sum = sum + (int) character;
            }
        }
        System.out.println(sum);
    }
}