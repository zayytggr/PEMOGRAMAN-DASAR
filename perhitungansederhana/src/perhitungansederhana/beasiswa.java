// Identitas Diri
// NIM : 09020626044
// Nama : Ahmad Zayyan Widyadhana
// Modul Praktikum Bab4 implmentasi java
package perhitungansederhana;
import java.util.Scanner;class beasiswa {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        double ipk;
        double penghasilan;
        int tanggungan;
        String aktifSosial;
        String beasiswaLain;

        System.out.print("Masukkan IPK: ");
        ipk = input.nextDouble();

        System.out.print("Masukkan penghasilan orang tua: ");
        penghasilan = input.nextDouble();

        System.out.print("Masukkan jumlah tanggungan: ");
        tanggungan = input.nextInt();

        input.nextLine();

        System.out.print("Aktif kegiatan sosial? (ya/tidak): ");
        aktifSosial = input.nextLine();

        System.out.print("Menerima beasiswa lain? (ya/tidak): ");
        beasiswaLain = input.nextLine();

        if (ipk >= 3.50
                && penghasilan <= 3000000
                && tanggungan >= 3
                && beasiswaLain.equalsIgnoreCase("tidak")) {

            System.out.println("Prioritas Utama");

        } else if (ipk >= 3.00
                && penghasilan <= 5000000
                && beasiswaLain.equalsIgnoreCase("tidak")) {

            System.out.println("Prioritas Kedua");

        } else if (aktifSosial.equalsIgnoreCase("ya")
                && ipk >= 3.00
                && beasiswaLain.equalsIgnoreCase("tidak")) {

            System.out.println("Pertimbangan Khusus");

        } else {

            System.out.println("Belum memenuhi prioritas");
        }
    }
}
    

