public class Chapter3 {
    public static void main(String[] args) {
        int age = 24;
        System.out.println(age);

        int num = 10;
        int num2 = -num;
        System.out.println(num);
        System.out.println(num2);


        int num1 = 10;
        int i = 2;

        boolean value = ( (num1 = num1 + 10) > 10) && ( (i = i+2) > 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
