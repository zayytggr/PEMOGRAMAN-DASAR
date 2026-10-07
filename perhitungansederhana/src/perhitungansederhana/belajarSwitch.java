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
public class belajarSwitch {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
     System.out.println("masukan angka untuk mengetahui hari");
     int hari = input.nextInt();
     switch (hari) {
         case 1:
             System.out.println("hari senin");
         break;
         case 2:
             System.out.println("hari selasa");
         break;
         case 3:
             System.out.println("hari rabu");
         break;
         case 4:
             System.out.println("hari kamis");
         break;
         case 5:
             System.out.println("hari jumat");
         break;
         case 6:
             System.out.println("hari sabtu");
         break;
         case 7:
             System.out.println("hari minggu");
         break;
     }
   }
}
