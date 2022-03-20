public class Practice1 {
    public static void main(String[] args) {

        int dan;
        int times;

        for (dan = 3; dan < 6; dan++) {
            for (times = 1; times < 10; times++) {
                if(dan == 4) continue;
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
        }
    }
}