import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String str2 = str.toUpperCase();
        System.out.println(str2);
    }
}