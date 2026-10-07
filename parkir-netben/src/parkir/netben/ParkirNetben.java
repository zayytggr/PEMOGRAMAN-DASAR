package parkir.netben;
import java.util.Scanner;


public class ParkirNetben {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

        String kendaraan;
        int lamaParkir;
        int tarifAwal;
        int tarifTambahan;
        int totalParkir;

        System.out.println("=== PERHITUNGAN BIAYA PARKIR ===");

        System.out.print("Masukkan jenis kendaraan (sepeda/mobil) : ");
        kendaraan = input.nextLine();

        System.out.print("Masukkan lama parkir (jam) : ");
        lamaParkir = input.nextInt();

        if (kendaraan.equalsIgnoreCase("sepeda")) {

            tarifAwal = 2000;
            tarifTambahan = 1000;

            if (lamaParkir == 1) {
                totalParkir = tarifAwal;
            } else {
                totalParkir = tarifAwal + (lamaParkir - 1) * tarifTambahan;
            }

            System.out.println();
            System.out.println("Jenis Kendaraan : Sepeda");
            System.out.println("Lama Parkir : " + lamaParkir + " jam");
            System.out.println("Tarif Awal : Rp " + tarifAwal);
            System.out.println("Tarif Tambahan/Jam : Rp " + tarifTambahan);
            System.out.println("Total Biaya Parkir : Rp " + totalParkir);

        } else if (kendaraan.equalsIgnoreCase("mobil")) {

            tarifAwal = 5000;
            tarifTambahan = 2000;

            if (lamaParkir == 1) {
                totalParkir = tarifAwal;
            } else {
                totalParkir = tarifAwal + (lamaParkir - 1) * tarifTambahan;
            }

            System.out.println();
            System.out.println("Jenis Kendaraan : Mobil");
            System.out.println("Lama Parkir : " + lamaParkir + " jam");
            System.out.println("Tarif Awal : Rp " + tarifAwal);
            System.out.println("Tarif Tambahan/Jam : Rp " + tarifTambahan);
            System.out.println("Total Biaya Parkir : Rp " + totalParkir);

        } else {

            System.out.println("Jenis kendaraan tidak tersedia.");

        }

        input.close();

    }
    
}
