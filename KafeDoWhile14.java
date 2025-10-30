import java.util.Scanner;

public class KafeDoWhile14 {
    public static void main(String[] args) {
        Scanner Hikmal14 = new Scanner(System.in);
        int teh14, kopi14, roti14, totalharga;

        int hargaTeh14 = 7000;
        int hargaKopi14 = 12000;
        int hargaRoti14 = 20000;
        String namaPelanggan14;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan14 = Hikmal14.nextLine();
            if (namaPelanggan14.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi14 = Hikmal14.nextInt();
            System.out.print("Jumlah teh: ");
            teh14 = Hikmal14.nextInt();
            System.out.print("Jumlah roti: ");
            roti14 = Hikmal14.nextInt();

            totalharga = (kopi14 * hargaKopi14) + (teh14 * hargaTeh14) + (roti14 * hargaRoti14);
            System.out.println("Total yang harus dibayar " + totalharga);
            Hikmal14.nextLine(); 
        } while (true);

        System.out.println("Semua transaksi selesai. Terima kasih!");
        Hikmal14.close();
    }
}