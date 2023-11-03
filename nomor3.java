import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis kelamin (pria atau wanita): ");
        String jenisKelamin = input.next();
        System.out.println("Masukkan tinggi badan (cm): ");
        double beratBadan = input.nextDouble();
        System.out.println("Masukkan berat badan (kg): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung BMI
        double tinggiBadanMeters = tinggiBadan / 100;
        double bmi = beratBadan / (tinggiBadanMeters * tinggiBadanMeters);

        switch (jenisKelamin) {
            case "Pria":
                if (bmi < 20.50) {
                    System.out.println("Kurus");
                }
                else if (bmi > 20.50 && bmi < 26.99) {
                    System.out.println("Ideal");
                }
                else if (bmi >= 27.00) {
                    System.out.println("Gemuk");
                }
                else {
                    System.out.println("tidak valid.");
                }
                break;

            case "Wanita":
                if (bmi < 20.50) {
                    System.out.println("Kurus");
                }
                else if (bmi > 20.50 && bmi < 26.99) {
                    System.out.println("Ideal");
                }
                else if (bmi >= 27.00) {
                    System.out.println("Gemuk");
                
                }
                else {
                    System.out.println("tidak valid.");
                }
                break;
            }
                System.out.printf("%.2f\n", bmi );

    }
   }   
