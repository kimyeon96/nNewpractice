public class OperationEx2 {
    public static void main(String[] args) {
        int num3 = 5; //00000101;
        System.out.println(num3 << 1);
        System.out.println(num3);

        System.out.println(num3 <<= 1);
        System.out.println(num3);
        System.out.println(num3 << 2);
        System.out.println(num3 << 3);

        System.out.println(num3 >> 1); //00000101
    }
}
