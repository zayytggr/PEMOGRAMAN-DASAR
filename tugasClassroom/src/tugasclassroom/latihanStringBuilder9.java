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
public class latihanStringBuilder9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        String angka = input.nextLine();

        StringBuilder hasil = new StringBuilder();
        int jumlahDigit = 0;

        // Membaca angka dari belakang
        for (int i = angka.length() - 1; i >= 0; i--) {
            char karakter = angka.charAt(i);

            hasil.append(karakter);
            jumlahDigit++;

            // Menambahkan titik setiap tiga digit
            if (jumlahDigit % 3 == 0 && i > 0) {
                hasil.append('.');
            }
        }

        // Membalik urutan agar kembali normal
        hasil.reverse();

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
