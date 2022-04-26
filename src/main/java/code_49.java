import java.util.Scanner;
public class code_49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        if (a>b) {
            System.out.println(1);
        } else if (a<=b) {
            System.out.println(0);
        }
    }
}
