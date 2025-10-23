import java.util.Scanner;

public class SiakadFor14 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);
        double nilai14, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai14 = hikmal.nextDouble();
            if (nilai14 > tertinggi) {
                tertinggi = nilai14;
            }
            if (nilai14 < terendah) {
                terendah = nilai14;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah); 
    }
}