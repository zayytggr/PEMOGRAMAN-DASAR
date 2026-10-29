/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;

/**
 *
 * @author DELL
 */
public class latihanMethod6 {
    static double rataRata(double a, double b) {
        return (a + b) / 2;
    }

    // Method rata-rata untuk tiga bilangan
    static double rataRata(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {

        double hasil1 = rataRata(80.0, 90.0);
        double hasil2 = rataRata(80.0, 90.0, 100.0);

        System.out.println("Rata-rata dua bilangan: " + hasil1);
        System.out.println("Rata-rata tiga bilangan: " + hasil2);
    }
}
