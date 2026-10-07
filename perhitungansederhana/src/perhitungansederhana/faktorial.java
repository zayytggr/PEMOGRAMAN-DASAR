/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perhitungansederhana;
import java.util.Scanner;
public class faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        int hasil = 1;

        for (int i = n; i >= 1; i--) {
            hasil = hasil * i;
        }

        System.out.println(n + "! = " + hasil);

        input.close();
    }
}
