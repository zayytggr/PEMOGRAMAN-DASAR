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
public class latihanMethod11 {
     static Scanner input = new Scanner(System.in);
    static String nama;
    static double tugas, uts, uas;

    // Method 1: Input data mahasiswa
    static void inputNilai() {
        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Nilai tugas: ");
        tugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Nilai UAS: ");
        uas = input.nextDouble();
    }

    // Method 2: Menghitung nilai akhir
    static double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    // Method 3: Menampilkan hasil
    static void tampilkanHasil(double nilaiAkhir) {
        System.out.println("Nama: " + nama);
        System.out.println("Nilai akhir: " + nilaiAkhir);

        if (nilaiAkhir >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak lulus");
        }
    }

    public static void main(String[] args) {
        inputNilai();
        double nilaiAkhir = hitungNilaiAkhir();
        tampilkanHasil(nilaiAkhir);
        input.close();
    }
}
