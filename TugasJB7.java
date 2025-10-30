import java.util.Scanner;

public class TugasJB7 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);
        int jumlahTiket, hargaTiket = 50000, totalTiket = 0;
        double hargaDasar, diskon, totalBayar, totalPendapatan = 0;
        String lanjut;

        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = hikmal.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.");
                continue;
            }
            

            hargaDasar = jumlahTiket * hargaTiket;


            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket >= 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }
                
            
            totalBayar = hargaDasar - (hargaDasar * diskon);

            totalTiket += jumlahTiket;
            totalPendapatan += totalBayar;

             System.out.println("Harga Dasar : Rp " + hargaDasar);
            System.out.println("Diskon : " + (diskon * 100) + "%");
            System.out.println("Total bayar : RP " + totalBayar + "\n");
             System.out.print("Apakah ada pelanggan lain? (Y/N): ");
             lanjut = hikmal.next();
                if (lanjut.equalsIgnoreCase("N")) {
                    break;

                }
                System.out.println();

                System.out.println("========================================");
            System.out.println("Total Tiket Terjual     : " + totalTiket);
            System.out.println("Total Pendapatan Hari : Rp " + totalPendapatan);
                System.out.println("========================================");
        hikmal.close();

        }
    }
}
