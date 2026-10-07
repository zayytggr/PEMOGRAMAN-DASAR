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
public class perulanganDowhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka;
        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();
            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0);
        System.out.println("Program selesai.");
    }

}
