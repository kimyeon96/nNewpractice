public class gugu {
    public static void main(String[] args) {
        for (int j = 1; j <=9; j++) {
            System.out.println(j + "단");
            for(int i = 2; i <=9; i++) {
                System.out.println(j + "x" + i + "=" + (j*i));
            }
        }
    }
}
