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
public class bintangLooping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan angka perkalian");
        int angka = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + "x" + i + "=" + hasil);
        }
       
       
    }
    }
