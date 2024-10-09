import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double tiket, hargaTiket = 50000.0, totalHarga = 0.0, totalTiket = 0.0, diskon = 0.0, harga;
System.out.println("==================================================");
do {
    System.out.print("Masukkan jumlah tiket (ketik '0' untuk keluar): ");
    tiket = sc.nextDouble();
    if (tiket == 0) {
        break;
    }
    else if (tiket > 0 && tiket <= 4){
        diskon = 0.0;
    }
    else if (tiket > 4 && tiket <= 10){
        diskon = 0.1;
    }
    else if (tiket > 10){
        diskon = 0.15;
    }
    else {
        diskon = 0.0;
    }
    harga = (tiket * hargaTiket) - ((tiket * hargaTiket) * diskon);
    totalTiket += tiket;
    totalHarga += harga;
    System.out.println("Harga tiket: " + harga);
} while (true);

System.out.println("==================================================");
System.out.println("Total tiket yang terjual: " + totalTiket);
System.out.println("Total harga penjualan tiket: " + totalHarga);
System.out.println("==================================================");
sc.close();

    }
}