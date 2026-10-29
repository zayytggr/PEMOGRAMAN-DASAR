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
public class latihanString6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String[] kata = kalimat.toLowerCase().split("\\s+");
        String hasil = "";

        for (int i = 0; i < kata.length; i++) {
            if (!kata[i].isEmpty()) {
                hasil += kata[i].substring(0, 1).toUpperCase()
                        + kata[i].substring(1) + " ";
            }
        }

        System.out.println("Hasil: " + hasil.trim());

        input.close();
    }
}
