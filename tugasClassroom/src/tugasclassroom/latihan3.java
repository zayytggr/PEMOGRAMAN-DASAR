/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;

/**
 *
 * @author DELL
 */
public class latihan3 {
    public static void main(String[] args) {

        int[][] matriks = {
            {10, 25, 30},
            {45, 15, 20},
            {35, 50, 40}
        };

        int terbesar = matriks[0][0];
        int baris = 0;
        int kolom = 0;

        // Mencari nilai terbesar
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {

                if (matriks[i][j] > terbesar) {
                    terbesar = matriks[i][j];
                    baris = i;
                    kolom = j;
                }
            }
        }

        // Menampilkan matriks
        System.out.println("Matriks:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + (" "));
            }
            System.out.println();
        }

        // Menampilkan hasil
        System.out.println("\nNilai terbesar: " + terbesar);
        System.out.println("Posisi baris: " + (baris + 1));
        System.out.println("Posisi kolom: " + (kolom + 1));
    }
}
