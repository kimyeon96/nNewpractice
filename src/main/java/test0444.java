import java.util.Scanner;
public class test0444 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요 : ");
        int dan = s.nextInt();
            for(int i = dan; i<=dan; i++) {
                for(int j = 1; j<10; j++) {
                    System.out.println(i + "X" + j + "=" + i*j);
                }
            }
            }
        }