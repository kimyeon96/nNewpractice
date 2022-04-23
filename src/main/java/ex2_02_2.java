import java.util.Scanner;
public class ex2_02_2 {
    public static void main(String[] args) {
        int a, k, c;
        int result;

        Scanner s = new Scanner(System.in);
        System.out.printf("첫번째 계산할 값을 입력하세요 ==>");
        a = s.nextInt();

        System.out.printf("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==>");
        k = s.nextInt();

        System.out.printf("두번째 계산할 값을 입력하세요 ==>");
        c= s.nextInt();

        if(k == 1) {
            result = a+c;
            //System.out.println("%d + %d = %d",a,c,result);//
            System.out.println(a + "+" + c + "=" + result);
        }
        if (k == 2) {
            result = a-c;
            System.out.println(a + "-" + c + "=" + result);
        } if (k==3) {
            result = a*c;
            System.out.printf("%d * %d = %d", a,c,result);
        } if (k==4) {
            result=a/c;
            System.out.printf("%d / %d = %d",a,c,result);
        }
    }
}