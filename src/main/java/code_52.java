import java.util.Scanner;
public class code_52 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();

        if (a!=b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
