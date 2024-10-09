import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int jenis, durasi, total = 0, tarif = 0, harga;
System.out.println("=======================================================");
do {
    System.out.print("Masukkan jenis kendaraan (1. Mobil 2. Motor 0. keluar): ");
    jenis = sc.nextInt();
    if (jenis == 0) {
        break;
    }
    if (jenis == 1 || jenis == 2 || jenis == 3) {
    }
    else {
        System.out.println("Jenis kendaraan tidak valid, Masukkan lagi");
        continue;
    }
    System.out.print("Masukkan durasi parkir: ");
    durasi = sc.nextInt();

    if (durasi > 5) {
        tarif = 12500;
        harga = tarif;
    }
    else {
        if (jenis == 1){
            tarif = 3000;
        }
        else if (jenis == 2){
            tarif = 2000;
        }
        harga = durasi * tarif;
    }
    System.out.println("Tarif parkir: Rp " + harga);
    total += harga;
    
    
} while (true);

System.out.println("=======================================================");
System.out.println("Total tarif parkir: " + total);
sc.close();
    }
}