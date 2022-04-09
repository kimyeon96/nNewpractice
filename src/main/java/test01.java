import java.util.Scanner;
public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        System.out.println("a에 들어갈 숫자를 입력하세요");
        a = scan.nextInt();

        System.out.println("b에 들어갈 숫자를 입력하세요.");
        b = scan.nextInt();


        System.out.println(a * b);
    }
}