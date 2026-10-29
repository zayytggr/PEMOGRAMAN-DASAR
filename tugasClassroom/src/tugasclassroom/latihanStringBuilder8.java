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
public class latihanStringBuilder8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);

            if (karakter != ' ') {
                hasil.append(karakter);
            }
        }

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
