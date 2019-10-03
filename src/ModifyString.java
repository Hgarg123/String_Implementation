import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String str2;

        for (int i = 0; i < str.length(); i++) {
            str2 = str.replaceFirst("[aeiou]", "*");
            str2 = str2.replaceFirst("[aeiou]", "^");
            str2 = str2.replaceFirst("[aeiou]", "!");

            System.out.println(str2);
        }
    }
}