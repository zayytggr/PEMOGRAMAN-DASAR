/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;

/**
 *
 * @author DELL
 */
public class latihanMethod1 {
     static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {

        double r1 = 7;
        double r2 = 10;
        double r3 = 14;

        System.out.println("Luas Lingkaran");

        System.out.println("Jari-jari " + r1 + " = "
                + luasLingkaran(r1));

        System.out.println("Jari-jari " + r2 + " = "
                + luasLingkaran(r2));

        System.out.println("Jari-jari " + r3 + " = "
                + luasLingkaran(r3));
    }
}
