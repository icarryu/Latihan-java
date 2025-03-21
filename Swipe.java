public class Swipe {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Sebelum bertukar: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Setelah bertukar: a = " + a + ", b = " + b);
    }
}

