import java.util.Scanner;
public class Ex2_03 {
    public static void main(String[] args) {
        int a, b;
        int result;
        char k;

        Scanner s = new Scanner(System.in);
        System.out.printf("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();

        //System.out.printf("+ - * / % ==>");//
        //k = (char) System.in.read();//

        System.out.printf("두번째 계산할 값을 입력하세요 ==>");
        b = s.nextInt();
        k = 0;
        if (k == '+') {
            result = a + b;
            System.out.printf("%d + %d = %d", a, b, result);
        }
        if (k == '-') {
            result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        }
        if (k == '*') {
            result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        }
        if (k == '/') {
            if (b != 0) {
                result = a / b;
                System.out.printf("%d / %d = %d", a, b, result);
            } else
                System.out.println("0으로 나누면 안됩니다.");
        }
        if (k == '%') {
            if (b != 0) {
                result = a % b;
                System.out.println(a + "%" + b + "=" + result);
            } else {
                System.out.printf("0으로 나누면 나머지 값이 안됩니다");
            }
        }
    }
}