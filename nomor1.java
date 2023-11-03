import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan empat digit: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.printf("%04d%n", hasil(a));
        System.out.printf("%04d%n", hasil(b));
        System.out.printf("%04d%n", hasil(c));
    }
        //masukkan method
        public static int hasil (int x){
            int digit1 = x/1000;
            int sisaHitung = x % 1000;
            int digit2 = sisaHitung / 100;
            sisaHitung = x % 100;
            int digit3 = sisaHitung / 10;
            int digit4 = sisaHitung % 10;

            digit1 = (digit1 + 5) % 10;
            digit2 = (digit2 + 5) % 10;
            digit3 = (digit3 + 5) % 10;
            digit4 = (digit4 + 5) % 10;

            int balik = digit2;
            digit2 = digit4;
            digit4 = balik;

            return digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
        
    }
}
