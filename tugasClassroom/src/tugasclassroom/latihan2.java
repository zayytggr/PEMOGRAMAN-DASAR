/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;


public class latihan2 {
    public static void main(String[] args) {

        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transpose = new int[3][3];

        // Proses transpose
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }

        // Menampilkan matriks awal
        System.out.println("Matriks Awal:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + (" "));
            }
            System.out.println();
        }

        // Menampilkan hasil transpose
        System.out.println("\nHasil Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + (" "));
            }
            System.out.println();
        }
    }
}
