/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perhitungansederhana;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class nilaiA {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("masukkan nilai anda");
     double nilai = input.nextDouble();
     
      if (nilai > 100 || nilai < 0) {
            System.out.println("Terlalu lucu NGAKAK");
        } else if (nilai >= 91) {
            System.out.println("Kamu mendapatkan A");
        } else if (nilai >= 86) {
            System.out.println("Kamu mendapatkan A-");
        } else if (nilai >= 81) {
            System.out.println("Kamu mendapatkan B+");
        } else if (nilai >= 76) {
            System.out.println("Kamu mendapatkan B");
        } else if (nilai >= 71) {
            System.out.println("Kamu mendapatkan B-");
        } else if (nilai >= 66) {
            System.out.println("Kamu mendapatkan C+");
        } else if (nilai >= 61) {
            System.out.println("Kamu mendapatkan C-");
        } else if (nilai >= 56) {
            System.out.println("Kamu mendapatkan D");
        } else if (nilai >= 0) {
            System.out.println("Kamu mendapatkan E");
        }
   }
}
