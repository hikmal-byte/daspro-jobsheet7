import java.util.Scanner;

public class Tugas2JB7 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);

        int durasi14, totalharga14, keluar14 = 0;
        int parkirmobil14 = 3000;
        int parkirmotor14 = 2000;
        String jeniskendaraan14;

        while (true) {
            System.out.println("Masukkan jenis kendaraan (mobil/motor):");
            jeniskendaraan14 = hikmal.nextLine();

            System.out.println("Masukkan durasi (jam): ");
            durasi14 = hikmal.nextInt();
            hikmal.nextLine(); // cleaning the newline

            if (jeniskendaraan14.equalsIgnoreCase("mobil")) {
                totalharga14 = (durasi14 > 5) ? 12500 : durasi14 * parkirmobil14;
                System.out.println("Total harga: Rp " + totalharga14);
            } else if (jeniskendaraan14.equalsIgnoreCase("motor")) {
                totalharga14 = (durasi14 > 5) ? 12500 : durasi14 * parkirmotor14;
                System.out.println("Total harga: Rp " + totalharga14);
            } else {
                System.out.println("Jenis kendaraan tidak dikenali.");
            }

            System.out.println("Apakah anda ingin keluar? (ya/tidak): ");
            String jawaban = hikmal.nextLine();
            if (jawaban.equalsIgnoreCase("ya")) {
                keluar14 = 1;
            }
        }
    }
}
