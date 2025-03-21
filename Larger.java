import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int pertama = scanner.nextInt();

        System.out.println("Enter the second number:");
        int kedua = scanner.nextInt();

        System.out.println("Enter the third number:");
        int ketiga = scanner.nextInt();

        int terbesar;
        if (pertama >= kedua && pertama >= ketiga) {
            terbesar = pertama;
        } else if (kedua >= pertama && kedua >= ketiga) {
            terbesar = kedua;
        } else {
            terbesar = ketiga;
        }

        System.out.println("Angka terbesar adalah: " + terbesar);
        scanner.close();
    }
}
