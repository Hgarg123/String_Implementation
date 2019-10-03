import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String substring = obj.nextLine();
        int index = obj.nextInt();
        String substring1 = substring.substring(index);
        System.out.println(substring1);

    }
}

