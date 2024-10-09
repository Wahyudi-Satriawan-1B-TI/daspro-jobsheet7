import java.util.Scanner;
public class KafeDoWhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int kopi, teh, roti, totalHarga;
int hKopi = 12000, hTeh = 7000, hRoti = 20000;
String namaPelanggan;

do {
    System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
    namaPelanggan = sc.nextLine();
    if (namaPelanggan.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan.");
        break;
    }
    System.out.print("Jumlah Kopi: ");
    kopi = sc.nextInt();
    System.out.print("Jumlah Teh: ");
    teh = sc.nextInt();
    System.out.print("Jumlah Roti: ");
    roti = sc.nextInt();
    totalHarga = (kopi*hKopi) + (teh*hTeh) + (roti*hRoti);
    System.out.println("Total yang harus dibayar: Rp " + totalHarga);
    sc.nextLine();
} while (true);
System.out.println("Semua transaksi selesai.");
sc.close();
    }
}
