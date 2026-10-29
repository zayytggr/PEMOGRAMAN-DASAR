/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;

public class latihan1 {
     public static void main(String[] args) {

        String[] mahasiswa = {
            "Mahasiswa 1",
            "Mahasiswa 2",
            "Mahasiswa 3"
        };

        String[] mataKuliah = {
            "Algoritma",
            "Basis Data",
            "Pemrograman",
            "Sistem Informasi"
        };

        // Array 2 dimensi: 3 mahasiswa x 4 mata kuliah
        int[][] nilai = {
            {80, 85, 90, 75},
            {70, 80, 85, 90},
            {90, 95, 80, 85}
        };

        // Menampilkan nilai dan rata-rata
        for (int i = 0; i < mahasiswa.length; i++) {
            int total = 0;

            System.out.println("\n" + mahasiswa[i]);

            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.println(
                    mataKuliah[j] + ": " + nilai[i][j]
                );

                total += nilai[i][j];
            }

            double rataRata = (double) total / mataKuliah.length;

            System.out.println("Total nilai: " + total);
            System.out.println("Rata-rata: " + rataRata);
        }
    }
}
