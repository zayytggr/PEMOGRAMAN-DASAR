/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author DELL
 */
public class latihanString7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String kata1 = input.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = input.nextLine();

        // Mengubah semua huruf menjadi huruf kecil
        kata1 = kata1.toLowerCase().replaceAll("\\s+", "");
        kata2 = kata2.toLowerCase().replaceAll("\\s+", "");

        // Mengubah String menjadi array karakter
        char[] huruf1 = kata1.toCharArray();
        char[] huruf2 = kata2.toCharArray();

        // Mengurutkan huruf
        Arrays.sort(huruf1);
        Arrays.sort(huruf2);

        // Membandingkan hasil pengurutan
        if (Arrays.equals(huruf1, huruf2)) {
            System.out.println("Kedua kata merupakan anagram.");
        } else {
            System.out.println("Kedua kata bukan anagram.");
        }

        input.close();
    }
}
