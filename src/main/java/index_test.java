import java.util.Scanner;

public class index_test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            System.out.println("문자열을 입력하세요 : "+ str);

        System.out.println(str.indexOf("Java"));
        System.out.println(str.lastIndexOf("Java"));

    }
}
