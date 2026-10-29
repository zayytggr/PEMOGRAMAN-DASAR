/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;

/**
 *
 * @author DELL
 */
public class latihan4 {
    public static void main(String[] args) {

        int[][] matriks = {
            {4, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int jumlah = 0;

        // Menjumlahkan diagonal utama
        for (int i = 0; i < matriks.length; i++) {
            jumlah += matriks[i][i];
        }

        // Menampilkan matriks
        System.out.println("Matriks:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + (" "));
            }
            System.out.println();
        }

        System.out.println("\nJumlah diagonal utama: " + jumlah);
    }
}
