/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class latihanString5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        // Memisahkan kalimat berdasarkan spasi
        String[] kata = kalimat.trim().split("\\s+");

        int jumlahKata;

        if (kalimat.trim().isEmpty()) {
            jumlahKata = 0;
        } else {
            jumlahKata = kata.length;
        }

        System.out.println("Jumlah kata: " + jumlahKata);

        input.close();
    }
}
