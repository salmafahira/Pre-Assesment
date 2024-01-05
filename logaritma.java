import java.util.Scanner;

public class logaritma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = sc.nextInt();
        int angka = sc.nextInt();

        int pangkat = 1;
        while (hasil > angka) {
            hasil /= angka;
            pangkat++;
        }
        System.out.println(pangkat);
    }
}