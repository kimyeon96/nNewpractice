import java.util.Arrays;

public class diamondfor {
    public static void main(String[] args) {
        for (int i = 2; i > 0; i++) {
            for (int j = 2; j <= i; j--) {
                System.out.print(" ");
            }
            for (int j=1; j>=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}