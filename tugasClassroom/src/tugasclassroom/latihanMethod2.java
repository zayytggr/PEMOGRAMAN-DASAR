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
public class latihanMethod2 {
    static double konversiCelsiusKeFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Method Fahrenheit ke Celsius
    static double konversiFahrenheitKeCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;
        double suhu, hasil;

        System.out.println("=== MENU KONVERSI SUHU ===");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        System.out.print("Pilih menu (1/2): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan suhu Celsius: ");
                suhu = input.nextDouble();

                hasil = konversiCelsiusKeFahrenheit(suhu);

                System.out.println("Hasil: " + hasil + " Fahrenheit");
                break;

            case 2:
                System.out.print("Masukkan suhu Fahrenheit: ");
                suhu = input.nextDouble();

                hasil = konversiFahrenheitKeCelsius(suhu);

                System.out.println("Hasil: " + hasil + " Celsius");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
