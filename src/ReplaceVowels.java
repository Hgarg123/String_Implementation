import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String str1 = str.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(str1);
    }
}
