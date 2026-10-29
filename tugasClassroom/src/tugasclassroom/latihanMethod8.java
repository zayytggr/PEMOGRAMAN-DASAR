/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;

/**
 *
 * @author DELL
 */
public class latihanMethod8 {
      static int jumlahDeret(int n) {
        if (n == 0) {
            return 0;
        }

        return n + jumlahDeret(n - 1);
    }

    // Method menggunakan perulangan
    static int jumlahDeretPerulangan(int n) {
        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }

        return jumlah;
    }

    public static void main(String[] args) {

        int n = 5;

        int hasilRekursif = jumlahDeret(n);
        int hasilPerulangan = jumlahDeretPerulangan(n);

        System.out.println("Nilai n: " + n);
        System.out.println("Hasil rekursif: " + hasilRekursif);
        System.out.println("Hasil perulangan: " + hasilPerulangan);

        if (hasilRekursif == hasilPerulangan) {
            System.out.println("Kedua metode menghasilkan nilai yang sama.");
        } else {
            System.out.println("Kedua metode menghasilkan nilai berbeda.");
        }
    }
}
