import java.util.Scanner;

public class FormatString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.print("chars:\t");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "\t");
        }
    }
}
